package cn.edu.zju.gislab.SZTDService.po;

import java.sql.Timestamp;

public class Adcpinfonew {
    private Integer aid;

    private Timestamp dt;

    private Double temper;

    private Double head;

    private Double p;

    private Double r;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Timestamp getDt() {
        return dt;
    }

    public void setDt(Timestamp dt) {
        this.dt = dt;
    }

    public Double getTemper() {
        return temper;
    }

    public void setTemper(Double temper) {
        this.temper = temper;
    }

    public Double getHead() {
        return head;
    }

    public void setHead(Double head) {
        this.head = head;
    }

    public Double getP() {
        return p;
    }

    public void setP(Double p) {
        this.p = p;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }
}