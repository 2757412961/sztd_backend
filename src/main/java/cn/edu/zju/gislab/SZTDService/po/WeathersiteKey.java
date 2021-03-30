package cn.edu.zju.gislab.SZTDService.po;

import java.sql.Timestamp;

public class WeathersiteKey {
    private Integer id;

    private Timestamp dt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getDt() {
        return dt;
    }

    public void setDt(Timestamp dt) {
        this.dt = dt;
    }
}