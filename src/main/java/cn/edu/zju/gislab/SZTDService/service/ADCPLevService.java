package cn.edu.zju.gislab.SZTDService.service;

import cn.edu.zju.gislab.SZTDService.po.Adcplev;
import cn.edu.zju.gislab.SZTDService.po.Adcplevnew;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public interface ADCPLevService {
    ArrayList<List<Adcplevnew>> getADCPLevNew();
    List<List<Adcplev>> getADCPLevHistory(int id,Timestamp timeBefore,Timestamp timeNow,int timeInterval);
    List<List<Adcplev>> getADCPLevForecastAll(int id, Timestamp startTime, Timestamp endTime);

}
