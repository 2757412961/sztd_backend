package cn.edu.zju.gislab.SZTDService.result;

import cn.edu.zju.gislab.SZTDService.po.Adcpinfonew;
import cn.edu.zju.gislab.SZTDService.po.Adcplevnew;

import java.util.ArrayList;
import java.util.List;

public class ADCPInfoLevNew {
    private List<Adcpinfonew> adcpinfonewList;
    private ArrayList<List<Adcplevnew>> adcplevnewListAll;

    public ADCPInfoLevNew() {
    }

    public List<Adcpinfonew> getAdcpinfoNewList() {
        return adcpinfonewList;
    }

    public void setAdcpinfoNewList(List<Adcpinfonew> adcpinfonewList) {
        this.adcpinfonewList = adcpinfonewList;
    }

    public ArrayList<List<Adcplevnew>> getADCPlevNewListAll() {
        return adcplevnewListAll;
    }

    public void setADCPlevNewListAll(ArrayList<List<Adcplevnew>> adcplevnewListAll) {
        this.adcplevnewListAll = adcplevnewListAll;
    }

}
