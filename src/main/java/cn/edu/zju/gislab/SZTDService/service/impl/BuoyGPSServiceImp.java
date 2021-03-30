package cn.edu.zju.gislab.SZTDService.service.impl;

import cn.edu.zju.gislab.SZTDService.mapper.BuoygpsMapper;
import cn.edu.zju.gislab.SZTDService.mapper.BuoygpsnewMapper;
import cn.edu.zju.gislab.SZTDService.mapper.BuoygpshistoryMapper;
import cn.edu.zju.gislab.SZTDService.po.Buoygps;
import cn.edu.zju.gislab.SZTDService.po.Buoygpshistory;
import cn.edu.zju.gislab.SZTDService.po.BuoygpsExample;
import cn.edu.zju.gislab.SZTDService.po.BuoygpshistoryExample;
import cn.edu.zju.gislab.SZTDService.po.Buoygpsnew;
import cn.edu.zju.gislab.SZTDService.po.BuoygpsnewExample;
import cn.edu.zju.gislab.SZTDService.service.BuoyGPSService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BuoyGPSServiceImp implements BuoyGPSService {
    @Autowired
    private BuoygpsMapper buoygpsMapper;
    @Autowired
    private BuoygpsnewMapper buoygpsnewMapper;
    @Autowired
    private BuoygpshistoryMapper buoygpshistoryMapper;

    @Override
    public Buoygpsnew getBuoygpsnew(int id)
    {
        Buoygpsnew buoygpsnew = buoygpsnewMapper.selectByPrimaryKey(id);
        return buoygpsnew;
    }

    @Override
    public List<Buoygpshistory> getBuoygpshistory(int id)
    {
        BuoygpshistoryExample buoygpshistoryExample = new BuoygpshistoryExample();
        BuoygpshistoryExample.Criteria criteria = buoygpshistoryExample.createCriteria();
        criteria.andFidEqualTo(id);
        buoygpshistoryExample.setOrderByClause("dt asc");
        List<Buoygpshistory> buoygpshistoryList = buoygpshistoryMapper.selectByExample(buoygpshistoryExample);
        if(buoygpshistoryList.size()<1500)
            return buoygpshistoryList;
        else
        {
            List<Buoygpshistory> resultList = new ArrayList<>();
            int interval = buoygpshistoryList.size()/1000;
            for(int i=0;i<buoygpshistoryList.size();i=i+interval)
            {
                resultList.add(buoygpshistoryList.get(i));
            }
            return resultList;
        }
    }

    @Override
    public List<Buoygps> getBuoygpsLast24(int id)
    {
        Buoygpsnew buoygpsnew = buoygpsnewMapper.selectByPrimaryKey(id);
        Timestamp endTime = buoygpsnew.getDt();
        Timestamp startTime = new Timestamp(endTime.getTime()-24*60*60*1000);
        BuoygpsExample buoygpsExample = new BuoygpsExample();
        BuoygpsExample.Criteria criteria = buoygpsExample.createCriteria();
        criteria.andFidEqualTo(id);
        criteria.andDtBetween(startTime,endTime );
        buoygpsExample.setOrderByClause("dt asc");
        List<Buoygps> buoygpsList = buoygpsMapper.selectByExample(buoygpsExample);
        return buoygpsList;
    }

}
