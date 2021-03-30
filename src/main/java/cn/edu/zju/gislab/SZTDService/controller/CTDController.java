package cn.edu.zju.gislab.SZTDService.controller;

import cn.edu.zju.gislab.SZTDService.po.Ctd;
import cn.edu.zju.gislab.SZTDService.po.Ctdnew;
import cn.edu.zju.gislab.SZTDService.service.CTDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

@Controller
public class CTDController {
    @Autowired
    private CTDService ctdService;

    /**
     * 根据CTD的id查询CTD最新数据
     * @param id CTD的id
     * @return Ctdnew 返回ctdNew实例
     */
    @RequestMapping("/queryCtdNew")
    @ResponseBody
    public Ctdnew queryCtdNew(int id) {
        Ctdnew ctdnew =ctdService.getCtdnew(id);
        System.out.println(ctdnew.getDt());
        return ctdnew;
    }

    /**
     * 根据CTD的id、起始时间和终止时间查询历史数据
     * @param startTime 起始时间
     * @param endTime  终止时间
     * @return  List<Ctd> 返回按时间排序的CTD的List
     */
    @RequestMapping("/queryCtdHistory")
    @ResponseBody
    public List<List<Ctd>> queryCtdHistory(Long startTime, Long endTime){
        Timestamp stTime = new Timestamp(startTime);
        Timestamp edTime = new Timestamp(endTime);

        List<List<Ctd>> ctdAllList = new ArrayList<>();

        //平台底层CTD=1
        List<Ctd> platformBottomCtdList = ctdService.getCtdHistory(1,stTime,edTime);
        //平台表层CTD=2
        List<Ctd> platformTopCtdList = ctdService.getCtdHistory(2,stTime,edTime);
        //浮标底层CTD=3
        List<Ctd> buoyBottomCtdList = ctdService.getCtdHistory(3,stTime,edTime);
        //浮标表层CTD=4
        List<Ctd> buoyTopCtdList = ctdService.getCtdHistory(4,stTime,edTime);

        ctdAllList.add(platformBottomCtdList);
        ctdAllList.add(platformTopCtdList);
        ctdAllList.add(buoyBottomCtdList);
        ctdAllList.add(buoyTopCtdList);

        return ctdAllList;

    }

    @RequestMapping("/queryCtdLast24")
    @ResponseBody
    public List<Ctd> queryCtdLast24(int id){
        List<Ctd> ctdList=ctdService.getCtdLast24(id);
        return ctdList;
    }
}
