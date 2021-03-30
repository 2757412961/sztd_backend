package cn.edu.zju.gislab.SZTDService.controller;

import cn.edu.zju.gislab.SZTDService.po.Fub;
import cn.edu.zju.gislab.SZTDService.po.Fubnew;
import cn.edu.zju.gislab.SZTDService.service.FUBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.util.List;

@Controller
public class FUBController {
    @Autowired
    private FUBService fubService;

    /**
     * 根据BuoyWV的id查询BuoyWV最新数据
     * @param id BuoyWV的id
     * @return Buoywvnew 返回buoywvNew实例
     */
    @RequestMapping("/queryFubNew")
    public @ResponseBody Fubnew queryFubNew(int id) {
        //Fubnew fubnew =FUBService.getFubnew(id);
        Fubnew fubnew=null;
        System.out.println(fubnew.getDt());
        return fubnew;
    }

    /**
     * 根据BuoyWV的id、起始时间和终止时间查询历史数据
     * @param id  BuoyWV的id
     * @param startTime 起始时间
     * @param endTime  终止时间
     * @return  List<Buoywv> 返回按时间排序的Buoywv的List
     */
    @RequestMapping("/queryFubHistory")
    public @ResponseBody List<List<Fub>> queryFubHistory(int id, Long startTime, Long endTime){
        Timestamp stTime = new Timestamp(startTime);
        Timestamp edTime = new Timestamp(endTime);
        List<List<Fub>> fubList=fubService.getFubHistory(id,stTime,edTime);
        return fubList;
    }

    @RequestMapping("/queryFubLast24")
    public @ResponseBody List<List<Fub>> queryFubLast24(int id){
        List<List<Fub>> fubList=fubService.getFubLast24(id);
        return fubList;
    }
}
