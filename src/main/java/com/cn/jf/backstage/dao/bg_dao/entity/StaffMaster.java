package com.cn.jf.backstage.dao.bg_dao.entity;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class StaffMaster implements Serializable{
	private static final long serialVersionUID = -8094604492554763459L;
    private  String  emplCode;//用户ID
    private  String  emplName;//姓名
    private  String  password;//密码
    private  String  company;//公司
    private  String  position;//用户类别
    private  String  positionName;//用户类别名称
    private  String  contPhone;//联系电话
    private  String  backupTel;//备用电话
    private  String  emerAddr;//联系地址
    private  String  operParty;//运营方
    private  String  operPartyID;//运营方
    private  String salt;
    
    
    @JSONField (format="yyyy-MM-dd HH:mm:ss")
    private  Date    createTime;//账号创建时间
    private  String  createBy;//创建人
    
    @JSONField (format="yyyy-MM-dd HH:mm:ss")
    private  Date    updateTime;//更新时间
    private  String  updateBy;//更新人
    
    @JSONField (format="yyyy-MM-dd HH:mm:ss")
	private  Date    periodValidity;//账号有效日期
	private  String  remark;//备注
	
	public String getOperPartyID() {
		return operPartyID;
	}
	public void setOperPartyID(String operPartyID) {
		this.operPartyID = operPartyID;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getEmplCode() {
		return emplCode;
	}
	public void setEmplCode(String emplCode) {
		this.emplCode = emplCode;
	}
	public String getEmplName() {
		return emplName;
	}
	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public String getContPhone() {
		return contPhone;
	}
	public void setContPhone(String contPhone) {
		this.contPhone = contPhone;
	}
	public String getBackupTel() {
		return backupTel;
	}
	public void setBackupTel(String backupTel) {
		this.backupTel = backupTel;
	}
	public String getEmerAddr() {
		return emerAddr;
	}
	public void setEmerAddr(String emerAddr) {
		this.emerAddr = emerAddr;
	}
	public String getOperParty() {
		return operParty;
	}
	public void setOperParty(String operParty) {
		this.operParty = operParty;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy){
		this.updateBy = updateBy;
	}
	public Date getPeriodValidity(){
		return periodValidity;
	}
	public void setPeriodValidity(Date periodValidity){
		this.periodValidity = periodValidity;
	}
	public String getRemark(){
		return remark;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	
}
