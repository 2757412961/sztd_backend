package cn.edu.zju.gislab.SZTDService.controller;

import cn.edu.zju.gislab.SZTDService.po.*;
import cn.edu.zju.gislab.SZTDService.result.Buoy4;
import cn.edu.zju.gislab.SZTDService.result.Buoy4New;
import cn.edu.zju.gislab.SZTDService.result.Buoy67;
import cn.edu.zju.gislab.SZTDService.result.Buoy67New;
import cn.edu.zju.gislab.SZTDService.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Buoy67Controller {

    @Autowired
    private BuoyWVService buoyWVService;

    @Autowired
    private BuoyGPSService buoyGPSService;

    @Autowired
    private FUBService fubService;

    @Autowired
    private CTDService ctdService;

    @Autowired
    private SiteService siteService;

    @RequestMapping("/queryBuoy67New")
    public @ResponseBody
    Buoy67New queryBuoy67New(int id) {
        Buoy67New buoy67New = new Buoy67New();
        // basic
        Buoywvnew buoywvnew = buoyWVService.getBuoywvnew(id);
        Buoygpsnew buoygpsnew = buoyGPSService.getBuoygpsnew(id);
        Fubnew fubnew = fubService.getFubnew(id);
        // ctd, buoy6->ctd5, buoy7->ctd6
        int cid = id - 1;
        Ctdnew ctdnew = ctdService.getCtdnew(cid);
        // weather, buoy6->site4, buoy7->site5
        int sid = id - 2;
        Weathersitenew weathersitenew = siteService.getSiteNew(sid);

        buoy67New.setBuoywvnew(buoywvnew);
        buoy67New.setBuoygpsnew(buoygpsnew);
        buoy67New.setFubnew(fubnew);
        buoy67New.setCtdnew(ctdnew);
        buoy67New.setWeathersitenew(weathersitenew);

        return buoy67New;
    }

    @RequestMapping("/queryBuoy67Last24")
    public @ResponseBody
    Buoy67 queryBuoy67Last24(int id) {
        Buoy67 buoy67 = new Buoy67();
        List<Buoywv> buoywvList = buoyWVService.getBuoywvLast24(id);
        List<Buoygps> buoygpsList = buoyGPSService.getBuoygpsLast24(id);
        List<List<Fub>> fubList = fubService.getFubLast24(id);
        // ctd, buoy6->ctd5, buoy7->ctd6
        List<Ctd> ctdList = ctdService.getCtdLast24(id - 1);
        // weather, buoy6->site4, buoy7->site5
        List<Weathersite> weatherSiteList = siteService.getSiteLast24(id - 2);

        buoy67.setBuoywvList(buoywvList);
        buoy67.setBuoygpsList(buoygpsList);
        buoy67.setFubList(fubList);
        buoy67.setCtdList(ctdList);
        buoy67.setWeathersiteList(weatherSiteList);

        return buoy67;
    }

}
