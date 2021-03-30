package cn.edu.zju.gislab.SZTDService.service;

import cn.edu.zju.gislab.SZTDService.po.Fub;
import cn.edu.zju.gislab.SZTDService.po.Fubnew;

import java.sql.Timestamp;
import java.util.List;

public interface FUBService {
    Fubnew getFubnew(int id);
    List<List<Fub>> getFubHistory(int id, Timestamp startTime, Timestamp endTime);
    List<List<Fub>> getFubLast24(int id);
}
