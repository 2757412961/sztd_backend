package cn.edu.zju.gislab.SZTDService.controller;

import cn.edu.zju.gislab.SZTDService.po.Buoywv;
import cn.edu.zju.gislab.SZTDService.po.Buoywvnew;
import cn.edu.zju.gislab.SZTDService.po.Buoygps;
import cn.edu.zju.gislab.SZTDService.po.Buoygpsnew;
import cn.edu.zju.gislab.SZTDService.po.Fub;
import cn.edu.zju.gislab.SZTDService.po.Fubnew;
import cn.edu.zju.gislab.SZTDService.result.Buoy123;
import cn.edu.zju.gislab.SZTDService.result.Buoy123New;
import cn.edu.zju.gislab.SZTDService.service.BuoyWVService;
import cn.edu.zju.gislab.SZTDService.service.BuoyGPSService;
import cn.edu.zju.gislab.SZTDService.service.FUBService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class Buoy123Controller {
    @Autowired
    private BuoyWVService buoyWVService;
    @Autowired
    private BuoyGPSService buoyGPSService;
    @Autowired
    private FUBService fubService;


    @RequestMapping("/queryBuoy123New")
    public @ResponseBody Buoy123New queryBuoy123New(int id) {
        Buoy123New buoy123New = new Buoy123New();
        //Integer.parseInt(id)
        Buoywvnew buoywvnew = buoyWVService.getBuoywvnew(id);
        Buoygpsnew buoygpsnew = buoyGPSService.getBuoygpsnew(id);
        Fubnew fubnew = fubService.getFubnew(id);

        buoy123New.setBuoywvnew(buoywvnew);
        buoy123New.setBuoygpsnew(buoygpsnew);
        buoy123New.setFubnew(fubnew);

        return buoy123New;
    }


    @RequestMapping("/queryBuoy123Last24")
    public @ResponseBody Buoy123 queryBuoy123Last24(int id){
        Buoy123 buoy123 = new Buoy123();
        List<Buoywv> buoywvList = buoyWVService.getBuoywvLast24(id);
        List<List<Fub>> fubAllLevelList = fubService.getFubLast24(id);

        buoy123.setBuoywvList(buoywvList);
        buoy123.setFubList(fubAllLevelList);

        return buoy123;
    }



}
