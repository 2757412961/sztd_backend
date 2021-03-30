package cn.edu.zju.gislab.SZTDService.service;


import java.util.List;
import java.util.Map;

public interface UserService {
	//登录验证
	public int checkLogin(String username, String password);

	//管理员查询所有用户信息（id,username,catogory）
	public List<Map<String,String>> selectAllUsers();

	//管理员修改指定用户权限（category：1-管理员，0-普通用户，-1-用户不存在）
	public Boolean updateUserCategory(int selectedID, int updatedCategory);

	//管理员增加用户
	public Boolean addUser(String newUsername, String newPassword, int newCategory);

	//管理员删除用户
	public Boolean deleteUser(int deletedID);

}
