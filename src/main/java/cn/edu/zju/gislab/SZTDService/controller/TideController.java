package cn.edu.zju.gislab.SZTDService.controller;

import cn.edu.zju.gislab.SZTDService.po.Ctdnew;
import cn.edu.zju.gislab.SZTDService.po.Tide;
import cn.edu.zju.gislab.SZTDService.po.Tidenew;
import cn.edu.zju.gislab.SZTDService.service.TideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

@Controller
public class TideController {
    @Autowired
    private TideService tideServce;

    /**
     * 根据潮位计id获取潮位计最新数据
     * @param id  潮位计id
     * @return Tidenew 潮位计最新数据实例
     */

    @RequestMapping("/queryTideNew")
    @ResponseBody
    public Tidenew queryTideNew(int id) {
        Tidenew tidenew = tideServce.getTidenew(id);
        return tidenew;
    }

    /**
     * 根据潮位计id 、起始时间和终止时间查询潮位计历史数据
     * @param id 潮位计id
     * @param startTime  查询起始时间
     * @param endTime   查询终止时间
     * @return List<Tide> 返回按时间排序的Tide的List
     */
    @RequestMapping("/queryTideHistory")
    @ResponseBody
    public List<Tide> queryTideHistory(int id, Long startTime, Long endTime){
        Timestamp stTime = new Timestamp(startTime);
        Timestamp edTime = new Timestamp(endTime);
        List<Tide> tideList = tideServce.getTideHistory(id,stTime,edTime);
        return tideList;
    }
    @RequestMapping("/queryTideLast24")
    @ResponseBody
    public List<Tide> queryTideLast24(int id){
        List<Tide> tideList = tideServce.getTideLast24(id);
        return tideList;
    }
}
