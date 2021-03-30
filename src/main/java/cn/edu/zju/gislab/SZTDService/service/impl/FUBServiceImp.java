package cn.edu.zju.gislab.SZTDService.service.impl;

import cn.edu.zju.gislab.SZTDService.mapper.FubMapper;
import cn.edu.zju.gislab.SZTDService.mapper.FubnewMapper;
import cn.edu.zju.gislab.SZTDService.po.Fub;
import cn.edu.zju.gislab.SZTDService.po.Fubnew;
import cn.edu.zju.gislab.SZTDService.po.FubExample;
import cn.edu.zju.gislab.SZTDService.po.FubnewKey;
import cn.edu.zju.gislab.SZTDService.service.FUBService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


public class FUBServiceImp implements FUBService {
    @Autowired
    private FubMapper fubMapper;
    @Autowired
    private FubnewMapper fubnewMapper;

    @Override
    public Fubnew getFubnew(int id) {
        FubnewKey fubnewKey = new FubnewKey();
        fubnewKey.setFid(id);
        fubnewKey.setWavelev(4);
        Fubnew fubnew = fubnewMapper.selectByPrimaryKey(fubnewKey);
        return fubnew;
    }

    @Override
    public List<List<Fub>> getFubHistory(int id, Timestamp startTime, Timestamp endTime) {
        List<List<Fub>> fubAllLevelList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            FubExample fubExample = new FubExample();
            FubExample.Criteria criteria = fubExample.createCriteria();
            criteria.andFidEqualTo(id);
            criteria.andWavelevEqualTo(i);
            criteria.andDtBetween(startTime, endTime);
            fubExample.setOrderByClause("dt asc");
            List<Fub> fubList = fubMapper.selectByExample(fubExample);

            if (fubList.size() < 1500)
                fubAllLevelList.add(fubList);
            else {
                List<Fub> resultList = new ArrayList<>();
                int interval = fubList.size() / 1000;
                for (int j = 0; j < fubList.size(); j = j + interval) {
                    resultList.add(fubList.get(j));
                }
                fubAllLevelList.add(resultList);
            }
        }
        return fubAllLevelList;
    }

    @Override
    public List<List<Fub>> getFubLast24(int id) {
        List<List<Fub>> fubAllLevelList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            FubnewKey fubnewKey = new FubnewKey();
            fubnewKey.setFid(id);
            fubnewKey.setWavelev(i);
            Fubnew fubnew = fubnewMapper.selectByPrimaryKey(fubnewKey);
            Timestamp endTime = fubnew.getDt();
            Timestamp startTime = new Timestamp(endTime.getTime() - 24 * 60 * 60 * 1000);
            FubExample fubExample = new FubExample();
            FubExample.Criteria criteria = fubExample.createCriteria();
            criteria.andFidEqualTo(id);
            criteria.andWavelevEqualTo(i);
            criteria.andDtBetween(startTime, endTime);
            fubExample.setOrderByClause("dt asc");
            List<Fub> fubList = fubMapper.selectByExample(fubExample);
            fubAllLevelList.add(fubList);
        }
        return fubAllLevelList;
    }

}
