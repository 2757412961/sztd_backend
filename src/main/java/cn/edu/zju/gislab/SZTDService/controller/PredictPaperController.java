package cn.edu.zju.gislab.SZTDService.controller;

import cn.edu.zju.gislab.SZTDService.service.PredictPaperSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PredictPaperController {
    @Autowired
    private PredictPaperSerivce predictPaperSerivce;

    @RequestMapping("/queryDailyPre")
    @ResponseBody
    public String queryDailyPre(int year,int month,int day){
        String result=predictPaperSerivce.getDailyPre(year, month, day);
        return result;
    }
    @RequestMapping("/queryDailyPrePath")
    @ResponseBody
    public String queryDailyPrePath(int year,int month,int day,int hour){
        String result=predictPaperSerivce.getDailyPrePath(year, month, day, hour);
        return result;
    }


    @RequestMapping("/queryTDPre")
    @ResponseBody
    public String queryTDPre(int year,int month){
        String result=predictPaperSerivce.getTDPre(year, month);
        return result;
    }

    @RequestMapping("/queryTDPrePath")
    @ResponseBody
    public String queryTDPrePath(int year,int month,int day){
        String result=predictPaperSerivce.getTDPrePath(year, month, day);
        return result;
    }
    @RequestMapping("/queryCurrentPre")
    @ResponseBody
    public String queryCurrentPre(int year,int month){
        String result=predictPaperSerivce.getCurrentPre(year, month);
        return result;
    }
    @RequestMapping("/queryFWPre")
    @ResponseBody
    public String queryFWPre(int year,int month){
        String result=predictPaperSerivce.getFWPre(year, month);
        return result;
    }
    @RequestMapping("/queryFWPrePath")
    @ResponseBody

    public String queryFWPrePath(int year,int month,int day){
        String result=predictPaperSerivce.getFWPrePath(year, month, day);
        return result;
    }

    @RequestMapping("/queryTYPHPre")
    @ResponseBody
    public String queryTYPHPre(int year,int month, int typhId){
        String result=predictPaperSerivce.getTYPHPre(year, month, typhId);
        return result;
    }

    @RequestMapping("/queryTYPHPrePath")
    @ResponseBody
    public String queryTYPHPrePath(int typhId, String time){
        String result=predictPaperSerivce.getTYPHPrePath(typhId, time);
        return result;
    }

    @RequestMapping("/queryCurrentPrePath")
    @ResponseBody
    public String queryCurrentPrePath(int year,int month,int day){
        String result=predictPaperSerivce.getCurrentPrePath(year, month, day);
        return result;
    }
}
