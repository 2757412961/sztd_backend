package cn.edu.zju.gislab.SZTDService.controller;

import cn.edu.zju.gislab.SZTDService.po.Buoywv;
import cn.edu.zju.gislab.SZTDService.po.Buoywvnew;
import cn.edu.zju.gislab.SZTDService.service.BuoyWVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.util.List;

@Controller
public class BuoyWVController {
    @Autowired
    private BuoyWVService buoyWVService;

    /**
     * 根据BuoyWV的id查询BuoyWV最新数据
     * @param id BuoyWV的id
     * @return Buoywvnew 返回buoywvNew实例
     */
    @RequestMapping("/queryBuoyWVNew")
    @ResponseBody
    public Buoywvnew queryBuoyWVNew(int id) {
        Buoywvnew buoywvnew =buoyWVService.getBuoywvnew(id);
        System.out.println(buoywvnew.getDt());
        return buoywvnew;
    }

    /**
     * 根据BuoyWV的id、起始时间和终止时间查询历史数据
     * @param id  BuoyWV的id
     * @param startTime 起始时间
     * @param endTime  终止时间
     * @return  List<Buoywv> 返回按时间排序的Buoywv的List
     */
    @RequestMapping("/queryBuoyWVHistory")
    @ResponseBody
    public List<Buoywv> queryBuoyWVHistory(int id, Long startTime, Long endTime){
        Timestamp stTime = new Timestamp(startTime);
        Timestamp edTime = new Timestamp(endTime);
        List<Buoywv> buoywvList=buoyWVService.getBuoywvHistory(id,stTime,edTime);
        return buoywvList;
    }

    @RequestMapping("/queryBuoyWVLast24")
    @ResponseBody
    public List<Buoywv> queryBuoyWVLast24(int id){
        List<Buoywv> buoywvList=buoyWVService.getBuoywvLast24(id);
        return buoywvList;
    }
}
