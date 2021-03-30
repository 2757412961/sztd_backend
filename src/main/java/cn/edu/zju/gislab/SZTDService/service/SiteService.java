package cn.edu.zju.gislab.SZTDService.service;

import cn.edu.zju.gislab.SZTDService.po.Weathersite;
import cn.edu.zju.gislab.SZTDService.po.Weathersitenew;

import java.sql.Timestamp;
import java.util.List;

public interface SiteService {
    Weathersitenew getSiteNew(int id);

    List<Weathersite> getSiteHistory(int id, Timestamp startTime, Timestamp endTime);

    List<Weathersite> getSiteLast24(int id);
}
