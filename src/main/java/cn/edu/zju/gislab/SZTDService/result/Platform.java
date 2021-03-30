package cn.edu.zju.gislab.SZTDService.result;

import cn.edu.zju.gislab.SZTDService.po.Ctd;
import cn.edu.zju.gislab.SZTDService.po.Tide;

import java.util.List;

public class Platform {
    private List<Ctd> topCtdList;
    private List<Ctd> bottomCtdList;
    private List<Tide> tideList;

    public List<Ctd> getTopCtdList() {
        return topCtdList;
    }

    public void setTopCtdList(List<Ctd> topCtdList) {
        this.topCtdList = topCtdList;
    }

    public List<Ctd> getBottomCtdList() {
        return bottomCtdList;
    }

    public void setBottomCtdList(List<Ctd> bottomCtdList) {
        this.bottomCtdList = bottomCtdList;
    }

    public List<Tide> getTideList() {
        return tideList;
    }

    public void setTideList(List<Tide> tideList) {
        this.tideList = tideList;
    }
}
