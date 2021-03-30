package cn.edu.zju.gislab.SZTDService.service.impl;

import cn.edu.zju.gislab.SZTDService.mapper.CtdMapper;
import cn.edu.zju.gislab.SZTDService.mapper.CtdnewMapper;
import cn.edu.zju.gislab.SZTDService.po.Ctd;
import cn.edu.zju.gislab.SZTDService.po.CtdExample;
import cn.edu.zju.gislab.SZTDService.po.Ctdnew;
import cn.edu.zju.gislab.SZTDService.po.CtdnewExample;
import cn.edu.zju.gislab.SZTDService.service.CTDService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

public class CTDServiceImp implements CTDService {
    @Autowired
    private CtdMapper ctdMapper;
    @Autowired
    private CtdnewMapper ctdnewMapper;

    @Override
    public Ctdnew getCtdnew(int id) {
        Ctdnew ctdnew = ctdnewMapper.selectByPrimaryKey(id);
        return ctdnew;
    }

    @Override
    public List<Ctd> getCtdHistory(int id, Timestamp startTime, Timestamp endTime) {
        CtdExample ctdExample = new CtdExample();
        CtdExample.Criteria criteria = ctdExample.createCriteria();
        criteria.andCtdidEqualTo(id);
        criteria.andDtBetween(startTime,endTime);
        ctdExample.setOrderByClause("dt asc");
        List<Ctd> ctdList = ctdMapper.selectByExample(ctdExample);
        if(ctdList.size()<1500)
            return ctdList;
        else{
            List<Ctd> resultList = new ArrayList<>();
            int interval = ctdList.size()/1000;
            for(int i=0;i<ctdList.size();i=i+interval){
                resultList.add(ctdList.get(i));
            }
            return resultList;
        }
    }
    @Override
    public List<Ctd> getCtdLast24(int id){
        Ctdnew ctdnew =ctdnewMapper.selectByPrimaryKey(id);
        Timestamp endTime = ctdnew.getDt();
        Timestamp startTime =  new Timestamp(endTime.getTime() - 24*60*60*1000);
        CtdExample ctdExample = new CtdExample();
        CtdExample.Criteria criteria = ctdExample.createCriteria();
        criteria.andCtdidEqualTo(id);
        criteria.andDtBetween(startTime,endTime);
        ctdExample.setOrderByClause("dt asc");
        List<Ctd> ctdList = ctdMapper.selectByExample(ctdExample);
        return ctdList;
    }
}
