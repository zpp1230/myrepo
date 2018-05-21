package com.cn.jf.backstage.dao.bg_dao.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Sppz2 {
	private String goods;  //商品
	private String number; //商品数量
	private String price;  //价格系数
	private int id;        //本表ID
	private String goodsType; //货道规格
	private String machCode;  //设备编号
	private String goodsId;   //商品ID
	
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
	
	public Sppz2(){
		
	}

	public String getGoods() {
		return goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getMachCode() {
		return machCode;
	}

	public void setMachCode(String machCode) {
		this.machCode = machCode;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
