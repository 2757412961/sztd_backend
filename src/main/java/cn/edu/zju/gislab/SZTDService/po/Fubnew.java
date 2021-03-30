package cn.edu.zju.gislab.SZTDService.po;

import java.sql.Timestamp;

public class Fubnew extends FubnewKey {
    private Timestamp dt;

    private Double flowv;

    private Integer flowdire;

    public Timestamp getDt() {
        return dt;
    }

    public void setDt(Timestamp dt) {
        this.dt = dt;
    }

    public Double getFlowv() {
        return flowv;
    }

    public void setFlowv(Double flowv) {
        this.flowv = flowv;
    }

    public Integer getFlowdire() {
        return flowdire;
    }

    public void setFlowdire(Integer flowdire) {
        this.flowdire = flowdire;
    }
}