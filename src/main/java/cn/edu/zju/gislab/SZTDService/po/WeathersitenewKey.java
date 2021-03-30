package cn.edu.zju.gislab.SZTDService.po;

import java.sql.Timestamp;

public class WeathersitenewKey {
    private Timestamp dt;

    private String station;

    public Timestamp getDt() {
        return dt;
    }

    public void setDt(Timestamp dt) {
        this.dt = dt;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station == null ? null : station.trim();
    }
}