package cn.edu.zju.gislab.SZTDService.service;

import cn.edu.zju.gislab.SZTDService.po.Buoywv;
import cn.edu.zju.gislab.SZTDService.po.Buoywvnew;

import java.sql.Timestamp;
import java.util.List;

public interface BuoyWVService {
    Buoywvnew getBuoywvnew(int id);
    List<Buoywv> getBuoywvHistory(int id, Timestamp startTime, Timestamp endTime);
    List<Buoywv> getBuoywvLast24(int id);

}
