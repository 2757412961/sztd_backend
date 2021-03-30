package cn.edu.zju.gislab.SZTDService.service;

import cn.edu.zju.gislab.SZTDService.po.Dailypre;

import java.util.List;

public interface PredictPaperSerivce {
    String getDailyPre(int year,int month,int day);
    String getTDPre(int year,int month);
    String getFWPre(int year,int month);
    String getTYPHPre(int year,int month,int typhId );
    String getCurrentPre(int year,int month);

    String getDailyPrePath(int year,int month,int day,int hour);
    String getTDPrePath(int year,int month,int day);
    String getFWPrePath(int year,int month,int day);
    String getTYPHPrePath(int typhId,String time);
    String getCurrentPrePath(int year,int month,int day);
}
