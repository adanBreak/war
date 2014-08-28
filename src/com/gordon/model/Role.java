package com.gordon.model;

import java.util.List;

//�û������������ɫ,һ���û����Դ���������ɫ.
public class Role 
{
	private int id;
	private int user_id;
	private String name; //�û�������ɫʱ,�趨������.
	private int level;//�ȼ�
	private int exp;//��ǰ��������þ���
	private double face_angel;//����Ƕ�
	
	
	/**
	 * ��ɫ�Ļ���ԭ��,���ԭ���Ǿ�����ɫ����.
	 * */
	private int role_type;
		
	/**
	 *��ɫ��ѧ���ļ���. 
	 * */
	private List<Skill>skills_learned;
	

	/**
	 *��ɫ���ڿ���ʹ�õļ���.
	 *��ע��,ѧ���ļ�����ʹ�õļ�������������.
	 *ÿ����ɫ��ʹ�õļ�����������,��ѧ���ļ�����û����.
	 *����ʹ��һЩ���ߵ���ʹ�õļ���. 
	 * */
	private List<Skill>skills_available;
	
	//��λ��Ϣ,��3ά�����ʾ.��ɫ����ʱ,������������Ϣ.
	private double x_position;
	private double y_position;
	private double z_position;
	
	/**
	 * ������״̬.��ɫֻ�����߲��ܽ��и��ѷ���,���ܽ��л.
	 * �û����߻���ǿ�ƹر�ʱ����һ��ʱ�����Ž�������״̬,�رյ㿨���ѷ���.
	 * ֵΪtrueʱ����,��������.
	 * */
	private boolean status_online;
	
	/**
	 * ��ɫ�Ƿ�����
	 * ֵΪtrueʱ����,����Ϊ����
	 * */
	private boolean status_alive;
}
