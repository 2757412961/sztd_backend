package cn.edu.zju.gislab.SZTDService.service.impl;

import cn.edu.zju.gislab.SZTDService.service.NCDataService;
import ucar.ma2.ArrayDouble;
import ucar.ma2.ArrayFloat;
import ucar.ma2.Index;
import ucar.nc2.NetcdfFile;
import ucar.nc2.Variable;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NCDataServiceImp implements NCDataService {
    private String atmBasePath="E:\\SZTD\\data\\target\\atm\\" ;//"D:\\工作\\北京预报中心\\深中通道\\深中大气样例\\深=大气样例\\atm_d01.2019022112_2019022812.nc";
    private String atmReBasePath="E:\\SZTD\\data\\target\\atmRefine\\" ;
    private String currentBasePath = "E:\\SZTD\\data\\target\\current\\" ;
    private String waveBasePath = "E:\\SZTD\\data\\target\\wave\\" ;

    private String getfileNameDate(String bjDateStr){
        //2011-05-09 11:49:45
        String yearStr =bjDateStr.substring(0,4);
        String monthStr = bjDateStr.substring(4,6);
        String dayStr = bjDateStr.substring(6,8);
        String hourStr =bjDateStr.substring(8,10);
        String str = yearStr+"-"+monthStr+"-"+dayStr+" "+hourStr+":00:00";
        Timestamp ts = Timestamp.valueOf(str);
        Timestamp startResult =  new Timestamp(ts.getTime()-8*60*60*1000);
        Timestamp endResult = new Timestamp(startResult.getTime()+7*24*60*60*1000);
        DateFormat sdf = new SimpleDateFormat("yyyyMMddHH");
        return sdf.format(startResult)+"_"+sdf.format(endResult);
    }
    private String getCurrentFileNameDate(String bjDateStr){
        //2011-05-09 11:49:45
        String yearStr =bjDateStr.substring(0,4);
        String monthStr = bjDateStr.substring(4,6);
        String dayStr = bjDateStr.substring(6,8);
        String hourStr =bjDateStr.substring(8,10);
        String str = yearStr+"-"+monthStr+"-"+dayStr+" "+hourStr+":00:00";
        Timestamp ts = Timestamp.valueOf(str);
        //文件名=起报时间-8小时
        //Timestamp result =  new Timestamp(ts.getTime()-8*60*60*1000);
        Timestamp result =  new Timestamp(ts.getTime());
        DateFormat sdf = new SimpleDateFormat("yyyyMMddHH");
        return sdf.format(result);
    }
    @Override
    public List<Map<String,Object>> getAtmWin10mNcData(String strDate,float lon, float lat) {
        List<Map<String,Object>> result = null;
//        String filePath = "D:\\工作\\北京预报中心\\深中通道\\深中大气样例\\深中大气样例\\atm_d01.2019022112_2019022812.nc";
//        NetcdfFile openNC=null;
        try {
            String filePath =atmBasePath+"atm_d01."+getfileNameDate(strDate)+".nc";
            NetcdfFile openNC = NetcdfFile.open(filePath);

            //获取该纬度在矩阵中的位置
            Variable XLat = openNC.findVariable("XLAT");
            ArrayFloat.D3 XLatArray= (ArrayFloat.D3)XLat.read(new int []{0,0,0},new int []{1,299,1});
            Index index_lat = XLatArray.getIndex();
            int latLength=XLatArray.getShape()[1];
            int i_lat=0;
            for(;i_lat<latLength;i_lat++){
                if(lat<=XLatArray.getFloat(index_lat.set(0,i_lat,0))){
                    break;
                }
            }

            //获取该经度在矩阵中的位置
            Variable YLon = openNC.findVariable("XLONG");
            ArrayFloat.D3 YLonArray=(ArrayFloat.D3) YLon.read(new int []{0,0,0},new int []{1,1,419});
            Index index_lon = YLonArray.getIndex();
            int lonLength=YLonArray.getShape()[2];
            int i_lon=0;
            for(;i_lon<lonLength;i_lon++){
                if(lon<=YLonArray.getFloat(index_lon.set(0,0,i_lon))){
                    break;
                }
            }

            //1个经度，1个纬度，120个时间点
            int[] origin = new int []{0,i_lat,i_lon};
            int[] size = new int[]{121,1,1};

            Variable v_U10 = openNC.findVariable("U10");
            ArrayFloat.D3 U10Array = (ArrayFloat.D3)v_U10.read(origin,size);
            Index i_u10=U10Array.getIndex();

            Variable v_V10 = openNC.findVariable("V10");
            ArrayFloat.D3 V10Array = (ArrayFloat.D3)v_V10.read(origin,size);
            Index i_v10=V10Array.getIndex();

            result = new ArrayList<Map<String,Object>>();
            for(int i =0;i<=120;i++){
                float u10 = U10Array.getFloat(i_u10.set(i));
                float v10 = V10Array.getFloat(i_v10.set(i));
                double speed = Math.sqrt(u10*u10+v10*v10);

//                double theta = 1.5*Math.PI - Math.atan2(v10,u10);   //此时x轴负轴为0，顺时针旋转
                double theta;
                if(u10>0&&v10<0){
                    theta=2.5*Math.PI - Math.atan2(-v10,-u10);   //此时x轴负轴为0，顺时针旋转

                }else{
                    theta=0.5*Math.PI - Math.atan2(-v10,-u10);   //此时x轴负轴为0，顺时针旋转
                }
                Map<String,Object> temp = new HashMap<String,Object>();
                temp.put("time",i);
                temp.put("speed",speed);
                temp.put("dir",theta);
                result.add(temp);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return result;
    }

    @Override
    public List<Map<String, Object>> getAtmWin500hpaNcData(String strDate,float lon, float lat) {
        List<Map<String,Object>> result = null;
        result=readUVWindData("500hpa",strDate,lon,lat);
        return result;
    }

    @Override
    public List<Map<String, Object>> getAtmWin200hpaNcData(String strDate,float lon, float lat) {
        List<Map<String,Object>> result = null;
        result=readUVWindData("200hpa",strDate,lon,lat);
        return result;
    }

    @Override
    public List<Map<String, Object>> getAtmReWin10mNcData(String strDate, float lon, float lat) {
        List<Map<String,Object>> result = null;
//        String filePath = "D:\\工作\\北京预报中心\\深中通道\\深中大气样例\\深中大气样例\\atm_d01.2019022112_2019022812.nc";
//        NetcdfFile openNC=null;
        try {
            String filePath =atmReBasePath+"atm_d02."+getfileNameDate(strDate)+".nc";
            NetcdfFile openNC = NetcdfFile.open(filePath);

            //获取该纬度在矩阵中的位置
            Variable XLat = openNC.findVariable("XLAT");
            ArrayFloat.D3 XLatArray= (ArrayFloat.D3)XLat.read(new int []{0,0,0},new int []{1,240,1});
            Index index_lat = XLatArray.getIndex();
            int latLength=XLatArray.getShape()[1];
            int i_lat=0;
            for(;i_lat<latLength;i_lat++){
                if(lat<=XLatArray.getFloat(index_lat.set(0,i_lat,0))){
                    break;
                }
            }

            //获取该经度在矩阵中的位置
            Variable YLon = openNC.findVariable("XLONG");
            ArrayFloat.D3 YLonArray=(ArrayFloat.D3) YLon.read(new int []{0,0,0},new int []{1,1,240});
            Index index_lon = YLonArray.getIndex();
            int lonLength=YLonArray.getShape()[2];
            int i_lon=0;
            for(;i_lon<lonLength;i_lon++){
                if(lon<=YLonArray.getFloat(index_lon.set(0,0,i_lon))){
                    break;
                }
            }

            //1个经度，1个纬度，120个时间点
            int[] origin = new int []{0,i_lat,i_lon};
            int[] size = new int[]{121,1,1};

            Variable v_U10 = openNC.findVariable("U10");
            ArrayFloat.D3 U10Array = (ArrayFloat.D3)v_U10.read(origin,size);
            Index i_u10=U10Array.getIndex();

            Variable v_V10 = openNC.findVariable("V10");
            ArrayFloat.D3 V10Array = (ArrayFloat.D3)v_V10.read(origin,size);
            Index i_v10=V10Array.getIndex();

            result = new ArrayList<Map<String,Object>>();
            for(int i =0;i<=120;i++){
                float u10 = U10Array.getFloat(i_u10.set(i));
                float v10 = V10Array.getFloat(i_v10.set(i));
                double speed = Math.sqrt(u10*u10+v10*v10);

//                double theta = 1.5*Math.PI - Math.atan2(v10,u10);
                double theta;
                if(u10>0&&v10<0){
                    theta=2.5*Math.PI - Math.atan2( -v10,-u10);   //此时x轴负轴为0，顺时针旋转

                }else{
                    theta=0.5*Math.PI - Math.atan2( -v10,-u10);   //此时x轴负轴为0，顺时针旋转
                }
                Map<String,Object> temp = new HashMap<String,Object>();
                temp.put("time",i);
                temp.put("speed",speed);
                temp.put("dir",theta);
                result.add(temp);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return result;
    }

    @Override
    public List<Map<String, Object>> getCurrentNcData(String strDate, int siglay, float lon, float lat) {
        List<Map<String,Object>> result = new ArrayList<Map<String, Object>>();
        try{
            String  filePath= currentBasePath + "reg_current_"+getCurrentFileNameDate(strDate)+".nc";
            NetcdfFile openNC = NetcdfFile.open(filePath);

            Variable yLat = openNC.findVariable("y");
            ArrayFloat yLatArray = (ArrayFloat) yLat.read(new int[]{0}, new int[]{381});
            Index index_lat = yLatArray.getIndex();
            int latLength = yLatArray.getShape()[0];
            int i_lat = 0;
            for (; i_lat < latLength; i_lat++) {
                if (lat <= yLatArray.getFloat(index_lat.set(i_lat))) {
                    break;
                }
            }

            //获取该经度在矩阵中的位置
            Variable xLon = openNC.findVariable("x");  //经度
            ArrayFloat xLonArray = (ArrayFloat)xLon.read(new int[]{0}, new int[]{251});
            Index index_lon = xLonArray.getIndex();
            int lonLength = xLonArray.getShape()[0];
            int i_lon = 0;
            for (; i_lon < lonLength; i_lon++) {
                if (lon <= xLonArray.getFloat(index_lon.set(i_lon))) {
                    break;
                }
            }
            //1个经度，1个纬度，120个时间点
            int[] origin = new int []{0,siglay,i_lat,i_lon};
            int[] size = new int[]{25,1,1,1};

            Variable var_u = openNC.findVariable("u");
            ArrayFloat uArray = (ArrayFloat) var_u.read(origin, size);
            Index i_uu = uArray.getIndex();

            Variable var_v = openNC.findVariable("v");
            ArrayFloat vArray = (ArrayFloat) var_v.read(origin, size);
            Index i_vv = vArray.getIndex();

            //1个经度，1个纬度，120个时间点
            int[] zeta_origin = new int []{0,i_lat,i_lon};
            int[] zeta_size = new int[]{25,1,1};

            Variable var_zeta = openNC.findVariable("zeta");
            ArrayFloat zetaArray = (ArrayFloat) var_zeta.read(zeta_origin, zeta_size);
            Index i_zeta = zetaArray.getIndex();


            for (int i = 0; i <= 24; i++) {
                float uu = uArray.getFloat(i_uu.set(i));
                float vv = vArray.getFloat(i_vv.set(i));
                double speed = Math.sqrt(uu * uu + vv * vv);

                double theta;
                if(uu<0&&vv>0){
                    theta=2.5*Math.PI - Math.atan2(vv, uu);   //此时x轴负轴为0，顺时针旋转

                }else{
                    theta=0.5*Math.PI - Math.atan2(vv, uu);   //此时x轴负轴为0，顺时针旋转
                }

                float zeta=zetaArray.getFloat(i_zeta.set(i));

                Map<String, Object> temp = new HashMap<String, Object>();
                temp.put("time", i);
                temp.put("speed", speed);
                temp.put("dir", theta);
                temp.put("zeta",zeta);
                result.add(temp);
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


        return result;
    }

    @Override
    public List<Map<String, Object>> getWaveHSDIRNcData(String strDate, float lon, float lat) {
        List<Map<String,Object>> result = new ArrayList<Map<String, Object>>();
        try{
            String  filePath= waveBasePath + "WAVE"+getWaveFileNameDate(strDate)+".nc";
            NetcdfFile openNC = NetcdfFile.open(filePath);

            //获取该纬度在矩阵中的位置
            Variable yLat = openNC.findVariable("lat");  //纬度
//            ArrayDouble yLatArray = (ArrayDouble) yLat.read(new int[]{0}, new int[]{1000});
            ArrayDouble yLatArray = (ArrayDouble) yLat.read(new int[]{0}, new int[]{200});
            Index index_lat = yLatArray.getIndex();
            int latLength = yLatArray.getShape()[0];
            int i_lat = 0;
            for (; i_lat < latLength; i_lat++) {
                if (lat <= yLatArray.getDouble(index_lat.set(i_lat))) {
                    break;
                }
            }

            //获取该经度在矩阵中的位置
            Variable xLon = openNC.findVariable("lon");  //经度
            ArrayDouble xLonArray = (ArrayDouble)xLon.read(new int[]{0}, new int[]{200});
            Index index_lon = xLonArray.getIndex();
            int lonLength = xLonArray.getShape()[0];
            int i_lon = 0;
            for (; i_lon < lonLength; i_lon++) {
                if (lon <= xLonArray.getDouble(index_lon.set(i_lon))) {
                    break;
                }
            }
            //海浪浪高HS：1个经度，1个纬度，144个时间点
            int[] origin_HS = new int []{i_lat,i_lon,0};
            int[] size_HS = new int[]{1,1,25};

            Variable var_HS = openNC.findVariable("HS");
            ArrayDouble HSArray = (ArrayDouble) var_HS.read(origin_HS, size_HS);
            Index i_HS = HSArray.getIndex();

            //海浪浪向DIR：1个经度，1个纬度，144个时间点
            int[] origin_DIR = new int []{i_lat,i_lon,0};
            int[] size_DIR = new int[]{1,1,25};

            Variable var_DIR = openNC.findVariable("DIR");
            ArrayDouble DIRArray = (ArrayDouble) var_DIR.read(origin_DIR, size_DIR);
            Index i_DIR = DIRArray.getIndex();

            result = new ArrayList<Map<String,Object>>();
            for (int i = 0; i <= 24; i++) {
                Double HS=HSArray.getDouble(i_HS.set(0,0,i));
                //甲方的nc文件中dir数值代表东方向逆时针旋转的角度大小，echarts默认是北方向逆时针，所以减去90度
                Double DIR=DIRArray.getDouble(i_DIR.set(0,0,i));
                Map<String, Object> temp = new HashMap<String, Object>();
                temp.put("time", i);
                temp.put("HS", HS);
                temp.put("DIR", DIR);
                result.add(temp);
            }
        }
          catch(Exception e){
            System.out.println(e.getMessage());
        }


        return result;
    }
    @Override
    public List<Map<String, Object>> getWaveTPSNcData(String strDate, float lon, float lat) {
        List<Map<String,Object>> result = new ArrayList<Map<String, Object>>();
        try{
            String  filePath= waveBasePath + "WAVE"+getWaveFileNameDate(strDate)+".nc";
            NetcdfFile openNC = NetcdfFile.open(filePath);

            //获取该纬度在矩阵中的位置
            Variable yLat = openNC.findVariable("lat");  //纬度
            ArrayDouble yLatArray = (ArrayDouble) yLat.read(new int[]{0}, new int[]{200});
            Index index_lat = yLatArray.getIndex();
            int latLength = yLatArray.getShape()[0];
            int i_lat = 0;
            for (; i_lat < latLength; i_lat++) {
                if (lat <= yLatArray.getDouble(index_lat.set(i_lat))) {
                    break;
                }
            }

            //获取该经度在矩阵中的位置
            Variable xLon = openNC.findVariable("lon");  //经度
            ArrayDouble xLonArray = (ArrayDouble)xLon.read(new int[]{0}, new int[]{200});
            Index index_lon = xLonArray.getIndex();
            int lonLength = xLonArray.getShape()[0];
            int i_lon = 0;
            for (; i_lon < lonLength; i_lon++) {
                if (lon <= xLonArray.getDouble(index_lon.set(i_lon))) {
                    break;
                }
            }
            //海浪浪高HS：1个经度，1个纬度，144个时间点
            int[] origin_TPS = new int []{i_lat,i_lon,0};
            int[] size_TPS = new int[]{1,1,25};

            Variable var_TPS = openNC.findVariable("TPS");
            ArrayDouble TPSArray = (ArrayDouble) var_TPS.read(origin_TPS, size_TPS);
            Index i_TPS = TPSArray.getIndex();
            result = new ArrayList<Map<String,Object>>();
            for (int i = 0; i <= 24; i++) {
                Double TPS=TPSArray.getDouble(i_TPS.set(0,0,i));
                Map<String, Object> temp = new HashMap<String, Object>();
                temp.put("time", i);
                temp.put("TPS", TPS);
                result.add(temp);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


        return result;
    }
    private String getWaveFileNameDate(String bjDateStr){
        //2011-05-09 11:49:45
        String yearStr =bjDateStr.substring(0,4);
        String monthStr = bjDateStr.substring(4,6);
        String dayStr = bjDateStr.substring(6,8);
        String str = yearStr+"-"+monthStr+"-"+dayStr+" "+"00:00:00";
        Timestamp ts = Timestamp.valueOf(str);
        DateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(ts);
    }

    private List<Map<String, Object>> readUVWindData(String level,String strDate,float lon, float lat){
        List<Map<String,Object>> result = new ArrayList<Map<String, Object>>();
        try {
            String filePath =atmBasePath+"atm_d01."+getfileNameDate(strDate)+".nc";
            NetcdfFile openNC = NetcdfFile.open(filePath);
            //获取该纬度在矩阵中的位置
            Variable XLat = openNC.findVariable("XLAT"); //纬度
            ArrayFloat XLatArray = (ArrayFloat) XLat.read(new int[]{0, 0, 0}, new int[]{1, 299, 1});
            Index index_lat = XLatArray.getIndex();
            int latLength = XLatArray.getShape()[1];
            int i_lat = 0;
            for (; i_lat < latLength; i_lat++) {
                if (lat <= XLatArray.getFloat(index_lat.set(0, i_lat, 0))) {
                    break;
                }
            }

            //获取该经度在矩阵中的位置
            Variable YLon = openNC.findVariable("XLONG");  //经度
            ArrayFloat YLonArray = (ArrayFloat)YLon.read(new int[]{0, 0, 0}, new int[]{1, 1, 419});
            Index index_lon = YLonArray.getIndex();
            int lonLength = YLonArray.getShape()[2];
            int i_lon = 0;
            for (; i_lon < lonLength; i_lon++) {
                if (lon <= YLonArray.getFloat(index_lon.set(0, 0, i_lon))) {
                    break;
                }
            }

            //1个经度，1个纬度，120个时间点
            int[] origin ;
            int[] size ;
            switch(level){
                case "500hpa":
                    origin= new int []{0,1,i_lat,i_lon};//500hpa是第二维度第二层数据
                    size = new int[]{121,1,1,1};
                    break;
                default:   //200hpa
                    //1个经度，1个纬度，120个时间点
                    origin = new int []{0,2,i_lat,i_lon};//200hpa是第二维度第三层数据
                    size = new int[]{121,1,1,1};
            }

            Variable v_UU = openNC.findVariable("UU");
            ArrayFloat UUArray = (ArrayFloat) v_UU.read(origin, size);
            Index i_uu = UUArray.getIndex();

            Variable v_VV = openNC.findVariable("VV");
            ArrayFloat VVArray = (ArrayFloat) v_VV.read(origin, size);
            Index i_vv = VVArray.getIndex();


            for (int i = 0; i <= 120; i++) {
                float uu = UUArray.getFloat(i_uu.set(i));
                float vv = VVArray.getFloat(i_vv.set(i));
                double speed = Math.sqrt(uu * uu + vv * vv);

//                double theta = 1.5*Math.PI - Math.atan2(vv, uu);   //此时北向为0，顺时针旋转
                double theta;
                if(uu>0&&vv<0){
                    theta=2.5*Math.PI - Math.atan2(-vv, -uu);   //此时x轴负轴为0，顺时针旋转

                }else{
                    theta=0.5*Math.PI - Math.atan2(-vv, -uu);   //此时x轴负轴为0，顺时针旋转
                }
                Map<String, Object> temp = new HashMap<String, Object>();
                temp.put("time", i);
                temp.put("speed", speed);
                temp.put("dir", theta);
                result.add(temp);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return result;
    }



}
