package cn.edu.zju.gislab.SZTDService.controller;

import cn.edu.zju.gislab.SZTDService.po.Ctd;
import cn.edu.zju.gislab.SZTDService.po.Ctdnew;
import cn.edu.zju.gislab.SZTDService.po.Tide;
import cn.edu.zju.gislab.SZTDService.po.Tidenew;
import cn.edu.zju.gislab.SZTDService.result.Platform;
import cn.edu.zju.gislab.SZTDService.result.PlatformNew;
import cn.edu.zju.gislab.SZTDService.service.CTDService;
import cn.edu.zju.gislab.SZTDService.service.TideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PlatformController {
    @Autowired
    private CTDService ctdService;
    @Autowired
    private TideService tideService;


    @RequestMapping("/queryPlatformNew")
    @ResponseBody
    public PlatformNew queryPlatformNew() {
        PlatformNew platformNew = new PlatformNew();
        //ctd1是底层，ctd2是顶层
        Ctdnew ctd1 = ctdService.getCtdnew(1);
        Ctdnew ctd2 = ctdService.getCtdnew(2);
        Tidenew tidenew = tideService.getTidenew(1);
        platformNew.setBottomCtdNew(ctd1);
        platformNew.setTopCtdNew(ctd2);
        platformNew.setTideNew(tidenew);
        return platformNew;
    }


    @RequestMapping("/queryPlatformLast24")
    @ResponseBody
    public Platform queryPlatformLast24(){
        Platform platform = new Platform();
        List<Ctd> bottomCtdList = ctdService.getCtdLast24(1);
        List<Ctd> topCtdList = ctdService.getCtdLast24(2);
        List<Tide> tideList = tideService.getTideLast24(1);
        platform.setTopCtdList(topCtdList);
        platform.setBottomCtdList(bottomCtdList);
        platform.setTideList(tideList);
        return platform;
    }



}
