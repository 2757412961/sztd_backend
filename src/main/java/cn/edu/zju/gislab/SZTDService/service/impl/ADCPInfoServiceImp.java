package cn.edu.zju.gislab.SZTDService.service.impl;

import cn.edu.zju.gislab.SZTDService.mapper.AdcpinfonewMapper;
import cn.edu.zju.gislab.SZTDService.po.Adcpinfonew;
import cn.edu.zju.gislab.SZTDService.po.AdcpinfonewExample;
import cn.edu.zju.gislab.SZTDService.po.Adcplevnew;
import cn.edu.zju.gislab.SZTDService.po.AdcplevnewExample;
import cn.edu.zju.gislab.SZTDService.service.ADCPInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ADCPInfoServiceImp implements ADCPInfoService {
    @Autowired
    private AdcpinfonewMapper adcpinfonewMapper;

    @Override
    public List<Adcpinfonew> getADCPInfoNew() {
        List<Adcpinfonew> adcpinfonewList = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            Adcpinfonew adcpinfonew = adcpinfonewMapper.selectByPrimaryKey(i + 1);
            adcpinfonewList.add(adcpinfonew);
        }
        return adcpinfonewList;
    }


}
