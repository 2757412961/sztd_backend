package cn.edu.zju.gislab.SZTDService.po;

import java.sql.Timestamp;

public class TideKey {
    private Integer tideid;

    private Timestamp dt;

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
}