package cn.edu.zju.gislab.SZTDService.result;

import cn.edu.zju.gislab.SZTDService.po.Ctdnew;
import cn.edu.zju.gislab.SZTDService.po.Tidenew;

public class PlatformNew {
    private Ctdnew topCtdNew;
    private Ctdnew bottomCtdNew;
    private Tidenew tideNew;

    public PlatformNew() {
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

    public Tidenew getTideNew() {
        return tideNew;
    }

    public void setTideNew(Tidenew tideNew) {
        this.tideNew = tideNew;
    }
}
