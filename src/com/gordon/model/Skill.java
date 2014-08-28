package com.gordon.model;
/**
 * 技能模板
 * */
public class Skill 
{
	private int id;
	private String name;
	
	/**
	 * 学习这个技能之前,先要学习什么技能.
	 * */
	private Skill skill_required;
	
	/**
	 * 技能的学习时间.技能只有花费一定时间进行学习才能进入角色的技能池.
	 * 以秒作为单位.
	 * */
	private int learn_time;
	
	
}
