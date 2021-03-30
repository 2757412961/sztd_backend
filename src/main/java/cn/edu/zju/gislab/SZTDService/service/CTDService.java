package cn.edu.zju.gislab.SZTDService.service;

import cn.edu.zju.gislab.SZTDService.po.Ctd;
import cn.edu.zju.gislab.SZTDService.po.Ctdnew;

import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

public interface CTDService {
    Ctdnew getCtdnew(int id);
    List<Ctd> getCtdHistory(int id, Timestamp startTime, Timestamp endTime);
    List<Ctd> getCtdLast24(int id);

}
