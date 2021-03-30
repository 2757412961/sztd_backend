package cn.edu.zju.gislab.SZTDService.service.impl;

import cn.edu.zju.gislab.SZTDService.mapper.TideMapper;
import cn.edu.zju.gislab.SZTDService.mapper.TidenewMapper;
import cn.edu.zju.gislab.SZTDService.po.Tide;
import cn.edu.zju.gislab.SZTDService.po.TideExample;
import cn.edu.zju.gislab.SZTDService.po.Tidenew;
import cn.edu.zju.gislab.SZTDService.service.TideService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

public class TideServiceImp implements TideService {
    @Autowired
    private TidenewMapper tidenewMapper;
    @Autowired
    private TideMapper tideMapper;

    @Override
    public Tidenew getTidenew(int id) {
        Tidenew tidenew = tidenewMapper.selectByPrimaryKey(id);
        return tidenew;
    }

    @Override
    public List<Tide> getTideHistory(int id, Timestamp startTime, Timestamp endTime) {
        TideExample tideExample = new TideExample();
        TideExample.Criteria criteria = tideExample.createCriteria();
        criteria.andTideidEqualTo(id);
        criteria.andDtBetween(startTime,endTime);
        tideExample.setOrderByClause("dt asc");

        List<Tide> tideList = tideMapper.selectByExample(tideExample);
        if(tideList.size()<1500)
            return tideList;
        else{
            List<Tide> resultList = new ArrayList<>();
            int interval = tideList.size()/1000;
            for(int i=0;i<tideList.size();i=i+interval){
                resultList.add(tideList.get(i));
            }
            return resultList;
        }


    }

    @Override
    public List<Tide> getTideLast24(int id){
        Tidenew tidenew = tidenewMapper.selectByPrimaryKey(id);
        Timestamp endTime = tidenew.getDt();
        Timestamp startTime =  new Timestamp(endTime.getTime() - 24*60*60*1000);
        TideExample tideExample = new TideExample();
        TideExample.Criteria criteria = tideExample.createCriteria();
        criteria.andTideidEqualTo(id);
        criteria.andDtBetween(startTime,endTime);
        tideExample.setOrderByClause("dt asc");
        List<Tide> tideList = tideMapper.selectByExample(tideExample);
        return tideList;
    }
}
