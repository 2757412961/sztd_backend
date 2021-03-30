package cn.edu.zju.gislab.SZTDService.result;

import cn.edu.zju.gislab.SZTDService.po.Buoygpsnew;
import cn.edu.zju.gislab.SZTDService.po.Buoywvnew;
import cn.edu.zju.gislab.SZTDService.po.Ctdnew;
import cn.edu.zju.gislab.SZTDService.po.Fubnew;

public class Buoy4New {
    private Buoywvnew buoywvnew;
    private Buoygpsnew buoygpsnew;
    private Fubnew fubnew;

    private Ctdnew topCtdNew;
    private Ctdnew bottomCtdNew;



    public Buoy4New() {
    }

    public Buoywvnew getBuoywvnew()
    {
        return buoywvnew;
    }

    public void setBuoywvnew(Buoywvnew buoywvnew)
    {
        this.buoywvnew = buoywvnew;
    }

    public Buoygpsnew getBuoygpsnew()
    {
        return buoygpsnew;
    }

    public void setBuoygpsnew(Buoygpsnew buoygpsnew)
    {
        this.buoygpsnew = buoygpsnew;
    }

    public Fubnew getFubnew()
    {
        return fubnew;
    }

    public void setFubnew(Fubnew fubnew)
    {
        this.fubnew = fubnew;
    }

    public Ctdnew getTopCtdNew() {
        return topCtdNew;
    }

    public void setTopCtdNew(Ctdnew topCtdNew) {
        this.topCtdNew = topCtdNew;
    }

    public Ctdnew getBottomCtdNew() {
        return bottomCtdNew;
    }

    public void setBottomCtdNew(Ctdnew bottomCtdNew) {
        this.bottomCtdNew = bottomCtdNew;
    }


}
