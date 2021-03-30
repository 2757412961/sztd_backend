package cn.edu.zju.gislab.SZTDService.po;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Tidenew {
    private Integer tideid;

    private Timestamp dt;

    private Double pr;

    private Double wl;

    private BigDecimal wlCorrect;

    public Integer getTideid() {
        return tideid;
    }

    public void setTideid(Integer tideid) {
        this.tideid = tideid;
    }

    public Timestamp getDt() {
        return dt;
    }

    public void setDt(Timestamp dt) {
        this.dt = dt;
    }

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