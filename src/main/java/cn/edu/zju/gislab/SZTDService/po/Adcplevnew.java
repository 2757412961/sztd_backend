package cn.edu.zju.gislab.SZTDService.po;

import java.sql.Timestamp;

public class Adcplevnew extends AdcplevnewKey {
    private Timestamp dt;

    private Double u;

    private Double v;

    private Double veloc;

    public Timestamp getDt() {
        return dt;
    }

    public void setDt(Timestamp dt) {
        this.dt = dt;
    }

    public Double getU() {
        return u;
    }

    public void setU(Double u) {
        this.u = u;
    }

    public Double getV() {
        return v;
    }

    public void setV(Double v) {
        this.v = v;
    }

    public Double getVeloc() {
        return veloc;
    }

    public void setVeloc(Double veloc) {
        this.veloc = veloc;
    }
}