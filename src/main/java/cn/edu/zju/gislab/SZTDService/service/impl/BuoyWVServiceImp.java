package cn.edu.zju.gislab.SZTDService.service.impl;

import cn.edu.zju.gislab.SZTDService.mapper.BuoywvMapper;
import cn.edu.zju.gislab.SZTDService.mapper.BuoywvnewMapper;
import cn.edu.zju.gislab.SZTDService.po.Buoywv;
import cn.edu.zju.gislab.SZTDService.po.BuoywvExample;
import cn.edu.zju.gislab.SZTDService.po.Buoywvnew;
import cn.edu.zju.gislab.SZTDService.service.BuoyWVService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BuoyWVServiceImp implements BuoyWVService {
    @Autowired
    private BuoywvMapper buoywvMapper;
    @Autowired
    private BuoywvnewMapper buoywvnewMapper;

    @Override
    public Buoywvnew getBuoywvnew(int id) {
        Buoywvnew buoywvnew = buoywvnewMapper.selectByPrimaryKey(id);
        return buoywvnew;
    }

    @Override
    public List<Buoywv> getBuoywvHistory(int id, Timestamp startTime, Timestamp endTime) {
        BuoywvExample buoywvExample = new BuoywvExample();
        BuoywvExample.Criteria criteria = buoywvExample.createCriteria();
        criteria.andFidEqualTo(id);
        criteria.andDtBetween(startTime,endTime);
        buoywvExample.setOrderByClause("dt asc");
        List<Buoywv> buoywvList = buoywvMapper.selectByExample(buoywvExample);
        if(buoywvList.size()<1500)
            return buoywvList;
        else{
            List<Buoywv> resultList = new ArrayList<>();
            int interval = buoywvList.size()/1000;
            for(int i=0;i<buoywvList.size();i=i+interval){
                resultList.add(buoywvList.get(i));
            }
            return resultList;
        }
    }

    @Override
    public List<Buoywv> getBuoywvLast24(int id){
        Buoywvnew buoywvnew =buoywvnewMapper.selectByPrimaryKey(id);
        Timestamp endTime = buoywvnew.getDt();
        Timestamp startTime =  new Timestamp(endTime.getTime() - 24*60*60*1000);
        BuoywvExample buoywvExample = new BuoywvExample();
        BuoywvExample.Criteria criteria = buoywvExample.createCriteria();
        criteria.andFidEqualTo(id);
        criteria.andDtBetween(startTime,endTime);
        buoywvExample.setOrderByClause("dt asc");
        List<Buoywv> buoywvList = buoywvMapper.selectByExample(buoywvExample);
        return buoywvList;
    }
}
