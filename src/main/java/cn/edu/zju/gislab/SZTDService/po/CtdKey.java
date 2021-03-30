package cn.edu.zju.gislab.SZTDService.po;

import java.sql.Timestamp;

public class CtdKey {
    private Integer ctdid;

    private Timestamp dt;

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
}