package com.cn.jf.backstage.dao.bg_dao.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/*
 * 运营商主档
 */
public class Yyzd {
	private String operatorID; // 运营方ID
	private String operator; // 营运房
	private String company; // 公司
	private String location; // 地址
	private String phone1; // 联系电话1
	private String phone2; // 联系电话2
	private String remark; // 备注
	private String createMan; // 创建人
	private String changeMan; // 更改人
	private String mark;

	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}

	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date changeTime;

	public Yyzd() {

	}
	public String getOperatorID() {
		return operatorID;
	}
	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreateMan() {
		return createMan;
	}
	public void setCreateMan(String createMan) {
		this.createMan = createMan;
	}
	public String getChangeMan() {
		return changeMan;
	}
	public void setChangeMan(String changeMan) {
		this.changeMan = changeMan;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getChangeTime() {
		return changeTime;
	}
	public void setChangeTime(Date changeTime) {
		this.changeTime = changeTime;
	}
}
