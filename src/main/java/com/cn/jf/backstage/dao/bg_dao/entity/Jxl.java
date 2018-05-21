package com.cn.jf.backstage.dao.bg_dao.entity;

import java.sql.Timestamp;

public class Jxl {
 private String jxlCode;  //机型类编号
 private String jxlName;  //机型类名称
 private Integer jxlId;   //机型ID
 private Timestamp changeTime; // 更改时间


 public Jxl(){
	 
 }
 
 public String getJxlCode() {
	return jxlCode;
}
public void setJxlCode(String jxlCode) {
	this.jxlCode = jxlCode;
}
public String getJxlName() {
	return jxlName;
}
public void setJxlName(String jxlName) {
	this.jxlName = jxlName;
}
public Integer getJxlId() {
	return jxlId;
}
public void setJxlId(Integer jxlId) {
	this.jxlId = jxlId;
}
  
public Timestamp getChangeTime() {
	return changeTime;
}

public void setChangeTime(Timestamp changeTime) {
	this.changeTime = changeTime;
}
 
}
