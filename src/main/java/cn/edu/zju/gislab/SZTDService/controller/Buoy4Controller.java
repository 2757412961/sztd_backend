package cn.edu.zju.gislab.SZTDService.controller;

import cn.edu.zju.gislab.SZTDService.po.*;
import cn.edu.zju.gislab.SZTDService.result.Buoy4;
import cn.edu.zju.gislab.SZTDService.result.Buoy4New;
import cn.edu.zju.gislab.SZTDService.service.BuoyGPSService;
import cn.edu.zju.gislab.SZTDService.service.BuoyWVService;
import cn.edu.zju.gislab.SZTDService.service.CTDService;
import cn.edu.zju.gislab.SZTDService.service.FUBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Buoy4Controller {
    @Autowired
    private BuoyWVService buoyWVService;
    @Autowired
    private BuoyGPSService buoyGPSService;
    @Autowired
    private FUBService fubService;
    @Autowired
    private CTDService ctdService;


    @RequestMapping("/queryBuoy4New")
    public @ResponseBody Buoy4New queryBuoy4New(int id) {
        Buoy4New buoy4New = new Buoy4New();
        //Integer.parseInt(id)
        Buoywvnew buoywvnew = buoyWVService.getBuoywvnew(id);
        Buoygpsnew buoygpsnew = buoyGPSService.getBuoygpsnew(id);
        Fubnew fubnew = fubService.getFubnew(id);
        //ctd1是底层，ctd2是顶层
        Ctdnew ctd1 = ctdService.getCtdnew(3);
        Ctdnew ctd2 = ctdService.getCtdnew(4);

        buoy4New.setBuoywvnew(buoywvnew);
        buoy4New.setBuoygpsnew(buoygpsnew);
        buoy4New.setFubnew(fubnew);

        buoy4New.setBottomCtdNew(ctd1);
        buoy4New.setTopCtdNew(ctd2);

        return buoy4New;
    }

    @RequestMapping("/queryBuoy4Last24")
    public @ResponseBody Buoy4 queryBuoy4Last24(int id){
        Buoy4 buoy4 = new Buoy4();
        List<Buoywv> buoywvList = buoyWVService.getBuoywvLast24(id);
        List<List<Fub>> fubList = fubService.getFubLast24(id);
        List<Ctd> bottomCtdList = ctdService.getCtdLast24(3);
        List<Ctd> topCtdList = ctdService.getCtdLast24(4);

        buoy4.setBuoywvList(buoywvList);
        buoy4.setFubList(fubList);
        buoy4.setTopCtdList(topCtdList);
        buoy4.setBottomCtdList(bottomCtdList);

        return buoy4;
    }
}
