package com.cn.jf.backstage.dao.bg_dao.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class RoleMaster{
    private  int    id;
    private  String roleName;
    private  String createBy;
    
    @JSONField (format="yyyy-MM-dd HH:mm:ss")
    private  Date   createTime;
    
    private  String updateBy;
    
    @JSONField (format="yyyy-MM-dd HH:mm:ss")
    private  Date   updateTime;
    
    private  String remark;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoleName(){
		return roleName;
	}
	public void setRoleName(String roleName){
		this.roleName = roleName;
	}
	public String getCreateBy(){
		return createBy;
	}
	public void setCreateBy(String createBy){
		this.createBy = createBy;
	}
	public Date getCreateTime(){
		return createTime;
	}
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	public String getUpdateBy(){
		return updateBy;
	}
	public void setUpdateBy(String updateBy){
		this.updateBy = updateBy;
	}
	public Date getUpdateTime(){
		return updateTime;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
