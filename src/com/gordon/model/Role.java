package com.gordon.model;

import java.util.List;

//用户创建的人物角色,一个用户可以创建多名角色.
public class Role 
{
	private int id;
	private int user_id;
	private String name; //用户创建角色时,需定义名字.
	private int level;//等级
	private int exp;//当前经验所获得经验
	private double face_angel;//面向角度
	
	
	/**
	 * 角色的基本原型,这个原型是决定角色技能.
	 * */
	private int role_type;
		
	/**
	 *角色已学到的技能. 
	 * */
	private List<Skill>skills_learned;
	

	/**
	 *角色现在可以使用的技能.
	 *请注意,学到的技能与使用的技能是两个概念.
	 *每名角色可使用的技能数有上限,但学到的技能数没上限.
	 *可以使用一些道具调整使用的技能. 
	 * */
	private List<Skill>skills_available;
	
	//方位信息,用3维坐标表示.角色下线时,保存其坐标信息.
	private double x_position;
	private double y_position;
	private double z_position;
	
	/**
	 * 上下线状态.角色只有上线才能进行付费服务,才能进行活动.
	 * 用户下线或者强制关闭时会有一段时间间隔才进入下线状态,关闭点卡付费服务.
	 * 值为true时上线,否则下线.
	 * */
	private boolean status_online;
	
	/**
	 * 角色是否死亡
	 * 值为true时生存,否则为死亡
	 * */
	private boolean status_alive;
}
