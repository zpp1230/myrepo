package com.cn.jf.backstage.dao.bg_dao.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Sppz {
	private String machCode;  //设备编号
	private String tier;      //层
	private String columns;    //列
	private String goodsNum;  //货道数
	private String goodsSize; //货道规格
	private String goods;     //商品
	private String machModel; //机型
	private String mach;       //主键
	private String createMan; //创建人
	private String changeMan; //修改人
	private String remark;    //备注
	
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date changeTime;
	public String getMachCode() {
		return machCode;
	}
	public void setMachCode(String machCode) {
		this.machCode = machCode;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	public String getColumns() {
		return columns;
	}
	public void setColumns(String columns) {
		this.columns = columns;
	}
	public String getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}
	public String getGoodsSize() {
		return goodsSize;
	}
	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public String getMachModel() {
		return machModel;
	}
	public void setMachModel(String machModel) {
		this.machModel = machModel;
	}
	public String getMach() {
		return mach;
	}
	public void setMach(String mach) {
		this.mach = mach;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
