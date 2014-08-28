package com.gordon.service;

import com.gordon.model.Role;
import com.gordon.model.Skill;

/**
 * 角色服务
 * by Gordon
 * */
public interface RoleService 
{
	//创建角色
	public void createRole(Role role);
	
	//删除角色
	public void delRole(Role role);
	
	//上线
	public void goOnline(Role role);
	
	//下线
	public void goOffline(Role role);
	
	//移动
	public void move(int move);//move见Move类
	
	//施法
	public void cast(Skill skill);
}
