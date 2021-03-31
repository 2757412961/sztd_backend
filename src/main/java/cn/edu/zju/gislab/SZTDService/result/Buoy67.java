package cn.edu.zju.gislab.SZTDService.result;

import cn.edu.zju.gislab.SZTDService.po.*;
import lombok.Data;

import java.util.List;

@Data
public class Buoy67 {
    private List<Buoywv> buoywvList;
    private List<Buoygps> buoygpsList;
    private List<List<Fub>> fubList;

    private List<Ctd> ctdList;

    private List<Weathersite> weathersiteList;

}
