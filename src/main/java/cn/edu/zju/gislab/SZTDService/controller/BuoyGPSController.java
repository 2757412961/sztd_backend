package cn.edu.zju.gislab.SZTDService.controller;

import cn.edu.zju.gislab.SZTDService.po.Buoygps;
import cn.edu.zju.gislab.SZTDService.po.Buoygpsnew;
import cn.edu.zju.gislab.SZTDService.po.Buoygpshistory;
import cn.edu.zju.gislab.SZTDService.service.BuoyGPSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.util.List;

@Controller
public class BuoyGPSController {
    @Autowired
    private BuoyGPSService buoyGPSService;

    /**
     * 根据BuoyWV的id查询BuoyWV最新数据
     * @param id BuoyWV的id
     * @return Buoywvnew 返回buoywvNew实例
     */
    @RequestMapping("/queryBuoyGPSNew")
    public @ResponseBody Buoygpsnew queryBuoyGPSNew(int id) {
        Buoygpsnew buoygpsnew =buoyGPSService.getBuoygpsnew(id);
        System.out.println(buoygpsnew.getDt());
        return buoygpsnew;
    }

    /**
     * 根据BuoyWV的id、起始时间和终止时间查询历史数据
     * @param id  BuoyWV的id
     * @return  List<Buoywv> 返回按时间排序的Buoywv的List
     */
    @RequestMapping("/queryBuoyGPSHistory")
    public @ResponseBody List<Buoygpshistory> queryBuoyGPSHistory(int id){
        List<Buoygpshistory> buoygpshistoryList=buoyGPSService.getBuoygpshistory(id);
        return buoygpshistoryList;
    }

    @RequestMapping("/queryBuoyGPSLast24")
    public @ResponseBody List<Buoygps> queryBuoyGPSLast24(int id){
        List<Buoygps> buoygpsList=buoyGPSService.getBuoygpsLast24(id);
        return buoygpsList;
    }
}
