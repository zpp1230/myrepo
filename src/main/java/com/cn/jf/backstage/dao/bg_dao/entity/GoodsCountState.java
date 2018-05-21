package com.cn.jf.backstage.dao.bg_dao.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class GoodsCountState implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigInteger countId;     //本表ID
	private String goodsName;  		//商品
	private String goodsCount; 		//商品数量
	private String goodsPrice;  	//价格系数
	private String cargoData; 		//货道规格
	private String deviceId;  		//设备编号
	private String goodsId;   		//商品ID
	
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date updateTime;


	public BigInteger getCountId() {
		return countId;
	}


	public void setCountId(BigInteger countId) {
		this.countId = countId;
	}


	public String getGoodsName() {
		return goodsName;
	}


	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}


	public String getGoodsCount() {
		return goodsCount;
	}


	public void setGoodsCount(String goodsCount) {
		this.goodsCount = goodsCount;
	}


	public String getGoodsPrice() {
		return goodsPrice;
	}


	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}


	public String getCargoData() {
		return cargoData;
	}


	public void setCargoData(String cargoData) {
		this.cargoData = cargoData;
	}


	public String getDeviceId() {
		return deviceId;
	}


	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
