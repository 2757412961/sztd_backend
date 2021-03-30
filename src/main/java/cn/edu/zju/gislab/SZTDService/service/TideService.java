package cn.edu.zju.gislab.SZTDService.service;

import cn.edu.zju.gislab.SZTDService.po.Tide;
import cn.edu.zju.gislab.SZTDService.po.Tidenew;

import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

public interface TideService {
    Tidenew getTidenew(int id);

    List<Tide> getTideHistory(int id , Timestamp startTime, Timestamp endTime);

    List<Tide> getTideLast24(int id);
}
