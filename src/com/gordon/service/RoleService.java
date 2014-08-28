package com.gordon.service;

import com.gordon.model.Role;
import com.gordon.model.Skill;

/**
 * ��ɫ����
 * by Gordon
 * */
public interface RoleService 
{
	//������ɫ
	public void createRole(Role role);
	
	//ɾ����ɫ
	public void delRole(Role role);
	
	//����
	public void goOnline(Role role);
	
	//����
	public void goOffline(Role role);
	
	//�ƶ�
	public void move(int move);//move��Move��
	
	//ʩ��
	public void cast(Skill skill);
}
