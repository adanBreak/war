package com.gordon.service;

import java.util.List;

import com.gordon.model.Role;
import com.gordon.model.User;

/**
 * 用户操纵接口
 * by Gordon
 * */
public interface UserService 
{
	//注册
	public User reg(User user);
	
	//登录,返回用户
	public User login(String email,String passwordInput);
	
	//根据用户,返回角色列表
	public List<Role> getRolesByUser(User user);
	
	//登出
	public void logout(User user);

}
