package cn.edu.zju.gislab.SZTDService.service.impl;

import cn.edu.zju.gislab.SZTDService.mapper.*;
import cn.edu.zju.gislab.SZTDService.po.*;
import cn.edu.zju.gislab.SZTDService.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductionServiceImp implements ProductionService {
    @Autowired
    private AtmMapper atmMapper;
    @Autowired
    private WaveMapper waveMapper;
    @Autowired
    private CurrenttMapper currenttMapper;
    @Autowired
    private AtmrefineMapper atmrefineMapper;
    @Override
    public Atm getAtmProNew() {
        AtmExample atmExample = new AtmExample();
        atmExample.setOrderByClause("dt desc");
        List<Atm> atmList = atmMapper.selectByExample(atmExample);
        if(atmList.size()!=0){
            return atmList.get(0);
        }
        return null;
    }

    @Override
    public Wave getWaveProNew() {
        WaveExample wavehsExample = new WaveExample();
        wavehsExample.setOrderByClause("dt desc");
        List<Wave> wavehsList = waveMapper.selectByExample(wavehsExample);
        if(wavehsList.size()!=0){
            return wavehsList.get(0);
        }
        return null;
    }

    @Override
    public Atmrefine getAtmRefineProNew() {
        AtmrefineExample atmrefineExample = new AtmrefineExample();
        atmrefineExample.setOrderByClause("dt desc");
        List<Atmrefine> atmrefineList = atmrefineMapper.selectByExample(atmrefineExample);
        if(atmrefineList.size()!=0){
            return atmrefineList.get(0);
        }
        return null;
    }

    @Override
    public Currentt getCurrentProNew() {
        CurrenttExample currenttExample = new CurrenttExample();
        currenttExample.setOrderByClause("dt desc");
        List<Currentt> currenttList = currenttMapper.selectByExample(currenttExample);
        if(currenttList.size()!=0){
            return currenttList.get(0);
        }
        return null;
    }
}
