package com.cn.jf.backstage.dao.bg_dao.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Sbzt1 {
	private String machCode; //设备号
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date lastTime;
	
	public Sbzt1(){
		
	}

	public String getMachCode() {
		return machCode;
	}

	public void setMachCode(String machCode) {
		this.machCode = machCode;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}
	

}
