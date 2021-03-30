package cn.edu.zju.gislab.SZTDService.controller;

import cn.edu.zju.gislab.SZTDService.po.*;
import cn.edu.zju.gislab.SZTDService.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Time;
import java.sql.Timestamp;

@Controller
public class ProductionController {
    @Autowired
    private ProductionService productionService;

    @RequestMapping("/queryAtmProNew")
    @ResponseBody
    public Timestamp queryAtmProNew(){
        Atm result = productionService.getAtmProNew();
        if(result!=null)
            return result.getDt();
        return null;
    }
    @RequestMapping("/queryWaveProNew")
    @ResponseBody
    public Timestamp queryWaveProNew(){
        Wave wave = productionService.getWaveProNew();
        if(wave !=null){
            return wave.getDt();
        } else{
            return null;
        }
    }

    @RequestMapping("/queryAtmRefineProNew")
    @ResponseBody
    public Timestamp queryAtmRefineProNew(){
        Atmrefine atmrefine = productionService.getAtmRefineProNew();
        if(atmrefine!=null){
            return atmrefine.getDt();
        }
        return null;
    }

    @RequestMapping("/queryCurrentProNew")
    @ResponseBody
    public Timestamp queryCurrentProNew(){
        Currentt currentt = productionService.getCurrentProNew();
        if(currentt!=null){
            return currentt.getDt();
        }
        return null;
    }


}
