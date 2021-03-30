package cn.edu.zju.gislab.SZTDService.po;

public class Fourweekpre extends FourweekpreKey {
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }
}