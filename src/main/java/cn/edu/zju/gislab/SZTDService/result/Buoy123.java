package cn.edu.zju.gislab.SZTDService.result;

import cn.edu.zju.gislab.SZTDService.po.Buoywv;
import cn.edu.zju.gislab.SZTDService.po.Buoygps;
import cn.edu.zju.gislab.SZTDService.po.Fub;

import java.util.List;

public class Buoy123 {
    private List<Buoywv> buoywvList;
    private List<Buoygps> buoygpsList;
    private List<List<Fub>> fubList;


    public List<Buoywv> getBuoywvList()
    {
        return buoywvList;
    }

    public void setBuoywvList(List<Buoywv> buoywvList)
    {
        this.buoywvList = buoywvList;
    }

    public List<Buoygps> getBuoygpsList()
    {
        return buoygpsList;
    }

    public void setBuoygpsList(List<Buoygps> buoygpsList)
    {
        this.buoygpsList = buoygpsList;
    }

    public List<List<Fub>> getFubList()
    {
        return fubList;
    }

    public void setFubList(List<List<Fub>> fubList)
    {
        this.fubList = fubList;
    }

}
