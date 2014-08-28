package com.gordon.model;

import java.util.Map;

/**
 * 技能模板
 * */
public class Skill 
{
	private int id;
	private String name;
	private String desc;//技能的说明文字
	private String icon_url;//图标的物理地址
	
	/**
	 * 学习这个技能之前,先要学习什么技能.
	 * */
	private Skill skill_required;
	
	/**
	 * 技能的学习时间.技能只有花费一定时间进行学习才能进入角色的技能池.
	 * 以秒作为单位.
	 * */
	private int learn_time;
		
	/**
	 *技能属性表
	 *比如消耗的魔法值,CD时间等等,用json表示.
	 *如{"mana_cost":100,"cd":6}
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
