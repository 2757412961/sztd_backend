package cn.edu.zju.gislab.SZTDService.service.impl;

import cn.edu.zju.gislab.SZTDService.mapper.UserinfoMapper;
import cn.edu.zju.gislab.SZTDService.po.Userinfo;
import cn.edu.zju.gislab.SZTDService.po.UserinfoExample;
import cn.edu.zju.gislab.SZTDService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImp implements UserService {

	@Autowired
	private UserinfoMapper userinfoMapper;

	//登录验证
	@Override
	public int checkLogin(String username, String password) {
        UserinfoExample userinfoExample = new UserinfoExample();
		// 通过criteria构造查询条件
		UserinfoExample.Criteria criteria = userinfoExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(password);
		
		List<Userinfo> userList = userinfoMapper.selectByExample(userinfoExample);
		if(userList != null && userList.size() > 0) {
			return userList.get(0).getCategory();
		}
		return -1;
	}

	//管理员查询所有用户信息（id,username,catogory）
	@Override
	public List<Map<String,String>> selectAllUsers(){

		UserinfoExample allUserinfoExample = new UserinfoExample();
		// 通过criteria构造查询条件
		UserinfoExample.Criteria criteria_AllUsers = allUserinfoExample.createCriteria();

		//selectIDNameCategoryByExample
		List<Userinfo> allUsersList = userinfoMapper.selectByExample(allUserinfoExample);
		if(allUsersList == null|| allUsersList.size() <= 0) {
			return null;
		}

		List<Map<String,String>> allUsersListMap = new ArrayList<Map<String,String>>();

		for(int i=0;i<allUsersList.size();i++)
		{
			Map<String,String> map = new HashMap<>();

			map.put("id",allUsersList.get(i).getId().toString());
			map.put("username",allUsersList.get(i).getUsername().toString());
			if(allUsersList.get(i).getCategory()==1){
				map.put("category","管理员");
			}else{
				map.put("category","普通用户");
			}
			allUsersListMap.add(map);
		}
		return allUsersListMap;
	}


	//管理员修改指定用户权限（category：1-管理员，0-普通用户，-1-用户不存在）
	public Boolean updateUserCategory(int selectedID,int updatedCategory){

		Userinfo userRecord = userinfoMapper.selectByPrimaryKey(selectedID);
		userRecord.setCategory(updatedCategory);
		userinfoMapper.updateByPrimaryKey(userRecord);

		return true;
	}

	public Boolean addUser(String newUsername, String newPassword,int newCategory){

		UserinfoExample userinfoExample_username = new UserinfoExample();
		// 通过criteria构造查询条件
		UserinfoExample.Criteria criteria_username = userinfoExample_username.createCriteria();
		criteria_username.andUsernameEqualTo(newUsername);
		List<Userinfo> userList_username = userinfoMapper.selectByExample(userinfoExample_username);
		if(userList_username != null && userList_username.size() > 0) {
			return false;
		}

		Userinfo userRecord = new Userinfo();
		userRecord.setUsername(newUsername);
		userRecord.setPassword(newPassword);
		userRecord.setCategory(newCategory);
		userinfoMapper.insertSelective(userRecord);
		return true;
	}

	//管理员删除用户
	public Boolean deleteUser(int deletedID){
		userinfoMapper.deleteByPrimaryKey(deletedID);
		return true;
	}
}
