package com.gordon.model;

import java.util.Map;

/**
 * ����ģ��
 * */
public class Skill 
{
	private int id;
	private String name;
	private String desc;//���ܵ�˵������
	private String icon_url;//ͼ��������ַ
	
	/**
	 * ѧϰ�������֮ǰ,��Ҫѧϰʲô����.
	 * */
	private Skill skill_required;
	
	/**
	 * ���ܵ�ѧϰʱ��.����ֻ�л���һ��ʱ�����ѧϰ���ܽ����ɫ�ļ��ܳ�.
	 * ������Ϊ��λ.
	 * */
	private int learn_time;
		
	/**
	 *�������Ա�
	 *�������ĵ�ħ��ֵ,CDʱ��ȵ�,��json��ʾ.
	 *��{"mana_cost":100,"cd":6}
	 * */
	private String skill_properties;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Skill getSkill_required() {
		return skill_required;
	}

	public void setSkill_required(Skill skill_required) {
		this.skill_required = skill_required;
	}

	public int getLearn_time() {
		return learn_time;
	}

	public void setLearn_time(int learn_time) {
		this.learn_time = learn_time;
	}

	
	
	
	
	
}
