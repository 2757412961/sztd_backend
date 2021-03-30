package cn.edu.zju.gislab.SZTDService.service;

import cn.edu.zju.gislab.SZTDService.po.Buoygps;
import cn.edu.zju.gislab.SZTDService.po.Buoygpsnew;
import cn.edu.zju.gislab.SZTDService.po.Buoygpshistory;

import java.sql.Timestamp;
import java.util.List;

public interface BuoyGPSService {
    Buoygpsnew getBuoygpsnew(int id);
    List<Buoygpshistory> getBuoygpshistory(int id);
    List<Buoygps> getBuoygpsLast24(int id);
}
