package cn.edu.zju.gislab.SZTDService.po;

public class Weathersite extends WeathersiteKey {
    private String filename;

    private Integer record;

    private Double taAvg;

    private Double rhAvg;

    private Double wsWvc1;

    private Double wsWvc2;

    private Integer paAvg;

    private Double ptempAvg;

    private Double battVoltAvg;

    private String station;

    private Double rain;

    private Double njd;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Integer getRecord() {
        return record;
    }

    public void setRecord(Integer record) {
        this.record = record;
    }

    public Double getTaAvg() {
        return taAvg;
    }

    public void setTaAvg(Double taAvg) {
        this.taAvg = taAvg;
    }

    public Double getRhAvg() {
        return rhAvg;
    }

    public void setRhAvg(Double rhAvg) {
        this.rhAvg = rhAvg;
    }

    public Double getWsWvc1() {
        return wsWvc1;
    }

    public void setWsWvc1(Double wsWvc1) {
        this.wsWvc1 = wsWvc1;
    }

    public Double getWsWvc2() {
        return wsWvc2;
    }

    public void setWsWvc2(Double wsWvc2) {
        this.wsWvc2 = wsWvc2;
    }

    public Integer getPaAvg() {
        return paAvg;
    }

    public void setPaAvg(Integer paAvg) {
        this.paAvg = paAvg;
    }

    public Double getPtempAvg() {
        return ptempAvg;
    }

    public void setPtempAvg(Double ptempAvg) {
        this.ptempAvg = ptempAvg;
    }

    public Double getBattVoltAvg() {
        return battVoltAvg;
    }

    public void setBattVoltAvg(Double battVoltAvg) {
        this.battVoltAvg = battVoltAvg;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station == null ? null : station.trim();
    }

    public Double getRain() {
        return rain;
    }

    public void setRain(Double rain) {
        this.rain = rain;
    }

    public Double getNjd() {
        return njd;
    }

    public void setNjd(Double njd) {
        this.njd = njd;
    }
}