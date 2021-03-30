package cn.edu.zju.gislab.SZTDService.po;

public class Currentpre extends CurrentpreKey {
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }
}