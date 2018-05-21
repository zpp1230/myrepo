package com.cn.jf.backstage.dao.bg_dao.entity;

import com.alibaba.fastjson.annotation.JSONField;

public class MenuMaster{
    private  String  menuid;
    private  String  menuname;
    private  String  menuPerent;
    private  String  icon;
    private  String  url;
    private  String  createBy;
    @JSONField (format="yyyy-MM-dd HH:mm:ss")
    private  String  createTime;
    private  String  updateBy;
    @JSONField (format="yyyy-MM-dd HH:mm:ss")
    private  String  updateTime;
    private  String  remark;
    
	public String getMenuid() {
		return menuid;
	}
	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public String getMenuPerent() {
		return menuPerent;
	}
	public void setMenuPerent(String menuPerent) {
		this.menuPerent = menuPerent;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
