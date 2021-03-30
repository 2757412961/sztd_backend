package cn.edu.zju.gislab.SZTDService.po;

import java.math.BigDecimal;

public class Tide extends TideKey {
    private Double pr;

    private Double wl;

    private BigDecimal wlCorrect;

    public Double getPr() {
        return pr;
    }

    public void setPr(Double pr) {
        this.pr = pr;
    }

    public Double getWl() {
        return wl;
    }

    public void setWl(Double wl) {
        this.wl = wl;
    }

    public BigDecimal getWlCorrect() {
        return wlCorrect;
    }

    public void setWlCorrect(BigDecimal wlCorrect) {
        this.wlCorrect = wlCorrect;
    }
}