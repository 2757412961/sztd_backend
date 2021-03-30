package cn.edu.zju.gislab.SZTDService.service.impl;

import cn.edu.zju.gislab.SZTDService.mapper.*;
import cn.edu.zju.gislab.SZTDService.po.*;
import cn.edu.zju.gislab.SZTDService.service.PredictPaperSerivce;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PredictPaperServiceImp implements PredictPaperSerivce {
    @Autowired
    private DailypreMapper dailypreMapper;
    @Autowired
    private TendaypreMapper tendaypreMapper;
    @Autowired
    private FourweekpreMapper fourweekpreMapper;
    @Autowired
    private TyphpreMapper typhpreMapper;

    @Autowired
    private CurrentpreMapper currentpreMapper;


    //获取查询条件参数，none，year，month
    private String GetParamType(int year, int month)
    {
        if (year==-1)
        {
            return "none?";
        }
        else if (month==-1)
        {
            return "year?";
        }
        else
        {
            return "month?";
        }
    }

    private String number2String(int num){
        String str=String.valueOf(num);
        if(str.length()<2)
            str="0"+str;
        return str;
    }

    @Override
    public String getDailyPre(int year, int month, int day) {
        DailypreExample dailypreExample = new DailypreExample();
        DailypreExample.Criteria criteria =dailypreExample.createCriteria();
        StringBuilder resultBuilder = new StringBuilder();
        int lastYear=year;
        int lastMonth=month;
        int lastDay=day;
        if(lastYear==-1)
            resultBuilder.append("none?");
        else if(lastMonth==-1)
            resultBuilder.append("year?");
        else if(day==-1)
            resultBuilder.append("month?");
        else
            resultBuilder.append("day?");


        if(lastYear==-1){
            //初始化时
            dailypreExample.setOrderByClause("year asc");
            List<Dailypre> dailypreList = dailypreMapper.selectByExample(dailypreExample);
            for(Dailypre dailypre:dailypreList){
                if(lastYear!=dailypre.getYear()){
                    resultBuilder.append(dailypre.getYear()+";");
                    lastYear=dailypre.getYear();
                }

            }
            //lastYear=dailypreList.get(dailypreList.size()-1).getYear();
            resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"?");
        }else{
            resultBuilder.append(lastYear+"?");
        }


        if(lastMonth==-1){
            //更改year时
            criteria.andYearEqualTo(lastYear);
            dailypreExample.setOrderByClause("month asc");
            List<Dailypre> dailypreList = dailypreMapper.selectByExample(dailypreExample);
            for(Dailypre dailypre:dailypreList){
                if(lastMonth!=dailypre.getMonth()){
                    resultBuilder.append(dailypre.getMonth()+";");
                    lastMonth=dailypre.getMonth();
                }

            }
//            lastMonth=dailypreList.get(dailypreList.size()-1).getMonth();
            resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"?");
        }else {
            resultBuilder.append(lastMonth+"?");
        }


        if(lastDay==-1){
            //更改month时
            criteria.andYearEqualTo(lastYear);
            criteria.andMonthEqualTo(lastMonth);
            dailypreExample.setOrderByClause("day asc");
            List<Dailypre> dailypreList = dailypreMapper.selectByExample(dailypreExample);
            for(Dailypre dailypre:dailypreList){

                if(lastDay!=dailypre.getDay()){
                    resultBuilder.append(dailypre.getDay()+";");
                    lastDay=dailypre.getDay();
                }
            }
//            lastDay=dailypreList.get(dailypreList.size()-1).getDay();
            resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"?");

        }else{
            resultBuilder.append(lastDay+"?");
        }

        int lastHour=-1;
        //更改day时
        criteria.andYearEqualTo(lastYear);
        criteria.andMonthEqualTo(lastMonth);
        criteria.andDayEqualTo(lastDay);
        dailypreExample.setOrderByClause("hour asc");
        List<Dailypre> dailypreList = dailypreMapper.selectByExample(dailypreExample);
        for(Dailypre dailypre:dailypreList){
            if(lastHour!=dailypre.getHour()){
                resultBuilder.append(dailypre.getHour()+";");
                lastHour=dailypre.getHour();
            }
        }
        resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"");
        return resultBuilder.toString();
    }

    @Override
    public String getTDPre(int year, int month) {
        TendaypreExample tendaypreExample =new TendaypreExample();
        TendaypreExample.Criteria criteria =tendaypreExample.createCriteria();
        StringBuilder resultBuilder = new StringBuilder();
        int lastYear=year;
        int lastMonth=month;
        resultBuilder.append(GetParamType(lastYear,lastMonth));

        if(lastYear==-1){
            tendaypreExample.setOrderByClause("year asc");
            List<Tendaypre> tendaypreList= tendaypreMapper.selectByExample(tendaypreExample);
            for(Tendaypre tendaypre:tendaypreList){
                if(lastYear!=tendaypre.getYear()){
                    resultBuilder.append(tendaypre.getYear()+";");
                    lastYear=tendaypre.getYear();
                }

            }
//            lastYear=tendaypreList.get(tendaypreList.size()-1).getYear();
            resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"?");
        }else{
            resultBuilder.append(lastYear+"?");
        }

        if(lastMonth==-1){
            criteria.andYearEqualTo(lastYear);
            tendaypreExample.setOrderByClause("month asc");
            List<Tendaypre> tendaypreList= tendaypreMapper.selectByExample(tendaypreExample);
            for(Tendaypre tendaypre:tendaypreList){
                if(lastMonth!=tendaypre.getMonth()){
                    resultBuilder.append(tendaypre.getMonth()+";");
                    lastMonth=tendaypre.getMonth();
                }

            }
//            lastMonth=tendaypreList.get(tendaypreList.size()-1).getMonth();
            resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"?");
        }else {
            resultBuilder.append(lastMonth+"?");
        }

        int lastDay=-1;
        //更改month时
        criteria.andYearEqualTo(lastYear);
        criteria.andMonthEqualTo(lastMonth);
        tendaypreExample.setOrderByClause("day asc");
        List<Tendaypre> tendaypreList = tendaypreMapper.selectByExample(tendaypreExample);
        for(Tendaypre tendaypre:tendaypreList){
            if(lastDay!=tendaypre.getDay()){
                resultBuilder.append(tendaypre.getDay()+";");
                lastDay=tendaypre.getDay();
            }

        }
        resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"");
        return resultBuilder.toString();
    }

    @Override
    public String getCurrentPre(int year, int month) {
        CurrentpreExample currentpreExample =new CurrentpreExample();
        CurrentpreExample.Criteria criteria =currentpreExample.createCriteria();
        StringBuilder resultBuilder = new StringBuilder();
        int lastYear=year;
        int lastMonth=month;

        resultBuilder.append(GetParamType(lastYear,lastMonth));

        if(lastYear==-1){
            currentpreExample.setOrderByClause("year asc");
            List<Currentpre> currentpreList= currentpreMapper.selectByExample(currentpreExample);
            for(Currentpre currentpre:currentpreList){
                if(lastYear!=currentpre.getYear()){
                    resultBuilder.append(currentpre.getYear()+";");
                    lastYear=currentpre.getYear();
                }

            }
//            lastYear=fourweekpreList.get(fourweekpreList.size()-1).getYear();
            resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"?");
        }else{
            resultBuilder.append(lastYear+"?");
        }

        if(lastMonth==-1){
            criteria.andYearEqualTo(lastYear);
            currentpreExample.setOrderByClause("month asc");
            List<Currentpre> currentpreList= currentpreMapper.selectByExample(currentpreExample);
            for(Currentpre currentpre:currentpreList){
                if(lastMonth!=currentpre.getMonth()){
                    resultBuilder.append(currentpre.getMonth()+";");
                    lastMonth=currentpre.getMonth();
                }

            }
//            lastMonth=fourweekpreList.get(fourweekpreList.size()-1).getMonth();
            resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"?");
        }else {
            resultBuilder.append(lastMonth+"?");
        }

        int lastDay=-1;
        //更改month时
        criteria.andYearEqualTo(lastYear);
        criteria.andMonthEqualTo(lastMonth);
        currentpreExample.setOrderByClause("day asc");
        List<Currentpre> currentpreList = currentpreMapper.selectByExample(currentpreExample);
        for(Currentpre currentpre:currentpreList){
            if(lastDay!=currentpre.getDay()){
                resultBuilder.append(currentpre.getDay()+";");
                lastDay=currentpre.getDay();
            }

        }
        resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"");
        return resultBuilder.toString();
    }

    @Override
    public String getFWPre(int year, int month) {
        FourweekpreExample fourweekpreExample =new FourweekpreExample();
        FourweekpreExample.Criteria criteria =fourweekpreExample.createCriteria();
        StringBuilder resultBuilder = new StringBuilder();
        int lastYear=year;
        int lastMonth=month;

        resultBuilder.append(GetParamType(lastYear,lastMonth));

        if(lastYear==-1){
            fourweekpreExample.setOrderByClause("year asc");
            List<Fourweekpre> fourweekpreList= fourweekpreMapper.selectByExample(fourweekpreExample);
            for(Fourweekpre fourweekpre:fourweekpreList){
                if(lastYear!=fourweekpre.getYear()){
                    resultBuilder.append(fourweekpre.getYear()+";");
                    lastYear=fourweekpre.getYear();
                }

            }
//            lastYear=fourweekpreList.get(fourweekpreList.size()-1).getYear();
            resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"?");
        }else{
            resultBuilder.append(lastYear+"?");
        }

        if(lastMonth==-1){
            criteria.andYearEqualTo(lastYear);
            fourweekpreExample.setOrderByClause("month asc");
            List<Fourweekpre> fourweekpreList= fourweekpreMapper.selectByExample(fourweekpreExample);
            for(Fourweekpre fourweekpre:fourweekpreList){
                if(lastMonth!=fourweekpre.getMonth()){
                    resultBuilder.append(fourweekpre.getMonth()+";");
                    lastMonth=fourweekpre.getMonth();
                }

            }
//            lastMonth=fourweekpreList.get(fourweekpreList.size()-1).getMonth();
            resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"?");
        }else {
            resultBuilder.append(lastMonth+"?");
        }

        int lastDay=-1;
        //更改month时
        criteria.andYearEqualTo(lastYear);
        criteria.andMonthEqualTo(lastMonth);
        fourweekpreExample.setOrderByClause("day asc");
        List<Fourweekpre> fourweekpreList = fourweekpreMapper.selectByExample(fourweekpreExample);
        for(Fourweekpre fourweekpre:fourweekpreList){
            if(lastDay!=fourweekpre.getDay()){
                resultBuilder.append(fourweekpre.getDay()+";");
                lastDay=fourweekpre.getDay();
            }

        }
        resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"");
        return resultBuilder.toString();
    }

    @Override
    public String getTYPHPre(int year, int month, int typhId) {
        TyphpreExample typhpreExample = new TyphpreExample();
        TyphpreExample.Criteria criteria = typhpreExample.createCriteria();
        StringBuilder resultBuilder = new StringBuilder();
        int lastYear=year;
        int lastMonth = month ;
        int lastTyphId=typhId;
//        int lastPreId=preId;
        if(year==-1)
            resultBuilder.append("none?");
        else if(month==-1)
            resultBuilder.append("year");
        else if(typhId==-1)
            resultBuilder.append("month?");
//        else if(preId==-1)
//            resultBuilder.append("typhid?");
        else
            resultBuilder.append("typhid?");

        if(lastYear==-1){
            typhpreExample.setOrderByClause("year asc");
            List<Typhpre> typhpreList= typhpreMapper.selectByExample(typhpreExample);
            for(Typhpre typhpre:typhpreList){
                if(lastYear!=typhpre.getYear()){
                    resultBuilder.append(typhpre.getYear()+";");
                    lastYear=typhpre.getYear();
                }

            }
//            lastYear=typhpreList.get(typhpreList.size()-1).getYear();
            resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"?");
        }else{
            resultBuilder.append(lastYear+"?");
        }
        if(lastMonth==-1){
            typhpreExample.setOrderByClause("month asc");
            criteria.andYearEqualTo(lastYear);
            List<Typhpre> typhpreList= typhpreMapper.selectByExample(typhpreExample);
            for(Typhpre typhpre:typhpreList){
                if(lastMonth!=typhpre.getMonth()){
                    resultBuilder.append(typhpre.getMonth()+";");
                    lastMonth=typhpre.getMonth();
                }
            }
            resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"?");
        }else{
            resultBuilder.append(lastMonth+"?");
        }
        if(lastTyphId==-1){
            typhpreExample.setOrderByClause("typhid asc");
            criteria.andMonthEqualTo(lastMonth);
            List<Typhpre> typhpreList= typhpreMapper.selectByExample(typhpreExample);
            for(Typhpre typhpre:typhpreList){
                if(lastTyphId!=typhpre.getTyphid()){
                    resultBuilder.append(typhpre.getTyphid()+";");
                    lastTyphId=typhpre.getTyphid();
                }

            }
//            lastTyphId=typhpreList.get(typhpreList.size()-1).getTyphid();
            resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"?");
        }else{

            resultBuilder.append(lastTyphId+"?");
        }
        typhpreExample.setOrderByClause("day,hour asc");
        criteria.andTyphidEqualTo(lastTyphId);
        criteria.andYearEqualTo(lastYear);
        criteria.andMonthEqualTo(lastMonth);
        String lastTime="";
        List<Typhpre> typhpreList = typhpreMapper.selectByExample(typhpreExample);
        for(Typhpre typhpre:typhpreList){
            String time = ""+typhpre.getYear()+number2String(typhpre.getMonth())+number2String(typhpre.getDay())+number2String(typhpre.getHour());
            if(!lastTime.equals(time)){
                resultBuilder.append(time+";");
                lastTime=time;
            }

        }
        resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"");
        return resultBuilder.toString();

//        if(lastPreId==-1){
//            typhpreExample.setOrderByClause("preid asc");
//            criteria.andYearEqualTo(lastYear);
//            criteria.andTyphidEqualTo(lastTyphId);
//            List<Typhpre> typhpreList= typhpreMapper.selectByExample(typhpreExample);
//            for(Typhpre typhpre:typhpreList){
//                if(lastPreId!=typhpre.getPreid()){
//                    resultBuilder.append(typhpre.getPreid()+";");
//                    lastPreId=typhpre.getPreid();
//                }
//            }
//            resultBuilder.replace(resultBuilder.length()-1,resultBuilder.length(),"?");
//            Typhpre lastTyphPre=typhpreList.get(typhpreList.size()-1);
//            resultBuilder.append(""+lastTyphPre.getYear()+number2String(lastTyphPre.getMonth())+number2String(lastTyphPre.getDay())+number2String(lastTyphPre.getHour()));
//        }else{
//            resultBuilder.append(lastTyphId+"?");
//            criteria.andYearEqualTo(lastYear);
//            criteria.andTyphidEqualTo(lastTyphId);
//            criteria.andPreidEqualTo(lastPreId);
//            List<Typhpre> typhpreList= typhpreMapper.selectByExample(typhpreExample);
//            Typhpre lastTyphPre=typhpreList.get(typhpreList.size()-1);
//            resultBuilder.append(""+lastTyphPre.getYear()+number2String(lastTyphPre.getMonth())+number2String(lastTyphPre.getDay())+number2String(lastTyphPre.getHour()));
//        }
//
//        return resultBuilder.toString();
    }

    @Override
    public String getDailyPrePath(int year, int month, int day, int hour) {
        DailypreKey dailypreKey = new DailypreKey();
        dailypreKey.setYear(year);
        dailypreKey.setMonth(month);
        dailypreKey.setDay(day);
        dailypreKey.setHour(hour);
        String path=dailypreMapper.selectByPrimaryKey(dailypreKey).getPath();
        return path;
    }

    @Override
    public String getTDPrePath(int year, int month, int day) {
        TendaypreKey tendaypreKey = new TendaypreKey();
        tendaypreKey.setYear(year);
        tendaypreKey.setMonth(month);
        tendaypreKey.setDay(day);
        String path=tendaypreMapper.selectByPrimaryKey(tendaypreKey).getPath();
        return path;
    }

    @Override
    public String getFWPrePath(int year, int month, int day) {
        FourweekpreKey fourweekpreKey = new FourweekpreKey();
        fourweekpreKey.setYear(year);
        fourweekpreKey.setMonth(month);
        fourweekpreKey.setDay(day);
        String path =fourweekpreMapper.selectByPrimaryKey(fourweekpreKey).getPath();
        return path;
    }

    @Override
    public String getTYPHPrePath(int typhId, String time) {
        int year = Integer.parseInt(time.substring(0,4));
        int month = Integer.parseInt(time.substring(4,6));
        int day = Integer.parseInt(time.substring(6,8));
        int hour = Integer.parseInt(time.substring(8,10));
        TyphpreExample typhpreExample = new TyphpreExample();
        TyphpreExample.Criteria criteria = typhpreExample.createCriteria();
        criteria.andTyphidEqualTo(typhId);
        criteria.andYearEqualTo(year);
        criteria.andMonthEqualTo(month);
        criteria.andDayEqualTo(day);
        criteria.andHourEqualTo(hour);
        List<Typhpre> typhpreList = typhpreMapper.selectByExample(typhpreExample);
        if(typhpreList.size()!=0){
            return typhpreList.get(0).getPath();
        }
        return null;

//        TyphpreKey typhpreKey = new TyphpreKey();
//        typhpreKey.setTyphid(typhId);
//        typhpreKey.setPreid(preid);
//        String path=typhpreMapper.selectByPrimaryKey(typhpreKey).getPath();
//        return path;
    }

    @Override
    public String getCurrentPrePath(int year, int month, int day) {
        CurrentpreKey currentpreKey = new CurrentpreKey();
        currentpreKey.setYear(year);
        currentpreKey.setMonth(month);
        currentpreKey.setDay(day);
        String path = currentpreMapper.selectByPrimaryKey( currentpreKey).getPath();
        return path;
    }
}
