package cn.edu.zju.gislab.SZTDService.controller;

import cn.edu.zju.gislab.SZTDService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //登录验证
    @RequestMapping("/loginAjax")
    public @ResponseBody int loginAjax(String username, String password) {

        int loginResult = userService.checkLogin(username, password);

        return loginResult;
    }

    //管理员查询所有用户信息（id,username,catogory）
    @RequestMapping("/selectAllUsers")
    public @ResponseBody List<Map<String,String>> selectAllUsers() {
        List<Map<String,String>> result = userService.selectAllUsers();

        if(result!=null){
            return result;
        }
        else{
            return null;
        }
    }

    //管理员修改指定用户权限（category：1-管理员，0-普通用户，-1-用户不存在）
    @RequestMapping("/updateUserCategory")
    public @ResponseBody String updateUserCategory(int selectedID,int updatedCategory) {
        Boolean result = userService.updateUserCategory(selectedID,updatedCategory);

        if(result){
            return "success";
        }
        else{
            return "fail";
        }
    }

    //管理员增加用户
    @RequestMapping("/addUser")
    public @ResponseBody String addUser(String newUsername, String newPassword,int newCategory) {
        Boolean result = userService.addUser(newUsername,newPassword,newCategory);

        if(result){
            return "success";
        }
        else{
            return "fail";
        }
    }

    //管理员删除用户
    @RequestMapping("/deleteUser")
    public @ResponseBody String deleteUser(int deletedID) {
        Boolean result = userService.deleteUser(deletedID);

        if(result){
            return "success";
        }
        else{
            return "fail";
        }
    }

}
