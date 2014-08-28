package com.gordon.model;

import java.util.List;

/**
 * 账户角色
 * by Gordon
 * 462991284@qq.com
 * */
public class User 
{	
	private int id;
	
	//通过邮箱与密码进行登录
	private String email;
	private String password;	
	
	//成就表
	private List<Achievement>archievements;
	
	//成就分
	private int score_achievements;
}
