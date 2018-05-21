package com.cn.jf.backstage.dao.bg_dao.entity;

public class Hdpz1 {

	private String tier; // 层
	private String goodsType; //货道类型
	private String goodsNum; // 货道数
	private String machCode; //设备编码
	private int id; // 本表主键
	
	public Hdpz1(){
		
	}
	
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	public String getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}
	public String getMachCode() {
		return machCode;
	}
	public void setMachCode(String machCode) {
		this.machCode = machCode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
