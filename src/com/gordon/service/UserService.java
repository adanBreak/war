package com.gordon.service;

import java.util.List;

import com.gordon.model.Role;
import com.gordon.model.User;

/**
 * �û����ݽӿ�
 * by Gordon
 * */
public interface UserService 
{
	//ע��
	public User reg(User user);
	
	//��¼,�����û�
	public User login(String email,String passwordInput);
	
	//�����û�,���ؽ�ɫ�б�
	public List<Role> getRolesByUser(User user);
	
	//�ǳ�
	public void logout(User user);

}
