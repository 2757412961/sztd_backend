package cn.edu.zju.gislab.SZTDService.po;

import java.sql.Timestamp;

public class Ctdnew {
    private Integer ctdid;

    private Timestamp dt;

    private String owner;

    private String position;

    private Double wp;

    private Double wt;

    private Double ec;

    private Double sl;

    private Double density;

    public Integer getCtdid() {
        return ctdid;
    }

    public void setCtdid(Integer ctdid) {
        this.ctdid = ctdid;
    }

    public Timestamp getDt() {
        return dt;
    }

    public void setDt(Timestamp dt) {
        this.dt = dt;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Double getWp() {
        return wp;
    }

    public void setWp(Double wp) {
        this.wp = wp;
    }

    public Double getWt() {
        return wt;
    }

    public void setWt(Double wt) {
        this.wt = wt;
    }

    public Double getEc() {
        return ec;
    }

    public void setEc(Double ec) {
        this.ec = ec;
    }

    public Double getSl() {
        return sl;
    }

    public void setSl(Double sl) {
        this.sl = sl;
    }

    public Double getDensity() {
        return density;
    }

    public void setDensity(Double density) {
        this.density = density;
    }
}