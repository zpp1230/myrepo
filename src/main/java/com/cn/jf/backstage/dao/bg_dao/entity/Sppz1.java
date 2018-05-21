package com.cn.jf.backstage.dao.bg_dao.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Sppz1 {
	private String goodsType; //货道 类似1-1 
	private String goods;   //商品
	private String goodsId;  //商品数量
	private String price;   //价格系数
	private int id;         //本表ID 自动生成
	private String machCode;
	private String type;    //货道标记  1/4  1/8 1/12
	
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
	
	public Sppz1(){
		
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getGoods() {
		return goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
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

	public String getMachCode() {
		return machCode;
	}

	public void setMachCode(String machCode) {
		this.machCode = machCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	
}
