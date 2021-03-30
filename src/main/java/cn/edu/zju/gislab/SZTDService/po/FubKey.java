package cn.edu.zju.gislab.SZTDService.po;

import java.sql.Timestamp;

public class FubKey {
    private Integer fid;

    private Timestamp dt;

    private Integer wavelev;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Timestamp getDt() {
        return dt;
    }

    public void setDt(Timestamp dt) {
        this.dt = dt;
    }

    public Integer getWavelev() {
        return wavelev;
    }

    public void setWavelev(Integer wavelev) {
        this.wavelev = wavelev;
    }
}