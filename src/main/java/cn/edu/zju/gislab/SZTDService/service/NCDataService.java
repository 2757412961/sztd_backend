package cn.edu.zju.gislab.SZTDService.service;

import ucar.ma2.Array;
import java.util.List;
import java.util.Map;

public interface NCDataService {
    List<Map<String,Object>> getAtmWin10mNcData(String strDate,float lon, float lat);
    List<Map<String,Object>> getAtmWin500hpaNcData(String strDate,float lon, float lat);
    List<Map<String,Object>> getAtmWin200hpaNcData(String strDate,float lon, float lat);
    List<Map<String,Object>> getAtmReWin10mNcData(String strDate,float lon, float lat);
    List<Map<String,Object>> getCurrentNcData(String strDate,int siglay,float lon, float lat);
    List<Map<String,Object>> getWaveHSDIRNcData(String strDate,float lon, float lat);
    List<Map<String,Object>> getWaveTPSNcData(String strDate,float lon, float lat);
}
