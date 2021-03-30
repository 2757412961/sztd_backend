package cn.edu.zju.gislab.SZTDService.controller;

import cn.edu.zju.gislab.SZTDService.po.Adcpinfonew;
import cn.edu.zju.gislab.SZTDService.po.Adcplev;
import cn.edu.zju.gislab.SZTDService.po.Adcplevnew;
import cn.edu.zju.gislab.SZTDService.result.ADCPInfoLevNew;
import cn.edu.zju.gislab.SZTDService.service.ADCPInfoService;
import cn.edu.zju.gislab.SZTDService.service.ADCPLevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ADCPLevController {
    @Autowired
    private ADCPLevService adcpLevService;
    @Autowired
    private ADCPInfoService adcpInfoService;

    /**
     * 查询ADCPLevNew表中所有id的监测站点的最新数据
     */
    @RequestMapping("/queryRealTimeMonitor")
    @ResponseBody
    public ADCPInfoLevNew queryRealTimeMonitor(){
        ADCPInfoLevNew aDCPInfoLevNew = new ADCPInfoLevNew();
        ArrayList<List<Adcplevnew>> adcplevnewListAll =  adcpLevService.getADCPLevNew();
        List<Adcpinfonew> adcpinfonewList =adcpInfoService.getADCPInfoNew();

        aDCPInfoLevNew.setAdcpinfoNewList(adcpinfonewList);
        aDCPInfoLevNew.setADCPlevNewListAll(adcplevnewListAll);
        return aDCPInfoLevNew;
    }

    /**
     * 查询ADCPLev表中最近几分钟每隔几分钟的监测站点数据
     */
    @RequestMapping("/queryHistoryMonitor")
    @ResponseBody
    public List<List<Adcplev>> queryHistoryMonitor(int id,int time,int timeInterval){
        //获取当前时刻
        //Date now = new Date();
        Date now = new Date(2016-1900, 10-1, 8);
        //当前时刻前time分钟
        Timestamp timeBefore =  new Timestamp(now.getTime() - time*60*1000);
        Timestamp timeNow = new Timestamp(now.getTime());

        List<List<Adcplev>> adcplevList =adcpLevService.getADCPLevHistory(id,timeBefore,timeNow,timeInterval);
        return adcplevList;
    }

    /**
     * 查询ADCPLev表中某个时间段内的某个监测站点各个深度的流速时间序列数据
     */
    @RequestMapping("/queryForecastAllMonitor")
    @ResponseBody
    public List<List<Adcplev>> queryForecastAllMonitor(int id, Long startTime, Long endTime){
        Timestamp stTime = new Timestamp(startTime);
        Timestamp edTime = new Timestamp(endTime);
        List<List<Adcplev>> adcplevList =adcpLevService.getADCPLevForecastAll(id,stTime,edTime);
        return adcplevList;
    }

}
