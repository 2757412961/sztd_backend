package cn.edu.zju.gislab.SZTDService.controller;

import cn.edu.zju.gislab.SZTDService.service.NCDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ucar.ma2.Array;
import java.util.List;
import java.util.Map;

@Controller
public class NCDataController {
    @Autowired
    private NCDataService ncDataService;

    @RequestMapping("/queryAtmWin10mNcData")
    @ResponseBody
    public List<Map<String,Object>> queryAtmWin10mNcData(String strDate,float lon, float lat){
        List<Map<String,Object>> result =ncDataService.getAtmWin10mNcData(strDate,lon,lat);
        return result;
    }
    @RequestMapping("/queryAtmWin500hpaNcData")
    @ResponseBody
    public List<Map<String,Object>> queryAtmWin500hpaNcData(String strDate,float lon, float lat){
        List<Map<String,Object>> result =ncDataService.getAtmWin500hpaNcData(strDate,lon,lat);
        return result;
    }
    @RequestMapping("/queryAtmWin200hpaNcData")
    @ResponseBody
    public List<Map<String,Object>> queryAtmWin200hpaNcData(String strDate,float lon, float lat){
        List<Map<String,Object>> result =ncDataService.getAtmWin200hpaNcData(strDate,lon,lat);
        return result;
    }
    @RequestMapping("/queryAtmReWin10mNcData")
    @ResponseBody
    public List<Map<String,Object>> queryAtmReWin10mNcData(String strDate,float lon, float lat){
        List<Map<String,Object>> result =ncDataService.getAtmReWin10mNcData(strDate,lon,lat);
        return result;
    }
    @RequestMapping("/queryCurrentNcData")
    @ResponseBody
    public List<Map<String,Object>> queryCurrentNcData(String strDate,int siglay,float lon, float lat){
        List<Map<String,Object>> result =ncDataService.getCurrentNcData(strDate,siglay,lon,lat);
        return result;
    }
    @RequestMapping("/queryWaveHSDIRNcData")
    @ResponseBody
    public List<Map<String,Object>> queryWaveHSDIRNcData(String strDate,float lon, float lat){
        List<Map<String,Object>> result =ncDataService.getWaveHSDIRNcData(strDate,lon,lat);
        return result;
    }
    @RequestMapping("/queryWaveTPSNcData")
    @ResponseBody
    public List<Map<String,Object>> queryWaveTPSNcData(String strDate,float lon, float lat){
        List<Map<String,Object>> result =ncDataService.getWaveTPSNcData(strDate,lon,lat);
        return result;
    }
}
