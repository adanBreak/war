package com.gordon.model;

import java.util.Date;

/**
 * 用户与成就表的关系
 * */
public class AchievementUser 
{
	private int id;
	private User user;
	private Achievement achievement;
	private Date time_get;//成就的获得时间

}
