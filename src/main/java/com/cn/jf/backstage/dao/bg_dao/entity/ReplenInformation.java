package com.cn.jf.backstage.dao.bg_dao.entity;

import java.math.BigInteger;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 补货清单实体
 * */
public class ReplenInformation {

	private BigInteger replenishId;//id
	
	private String goodsId;//商品id
	
	private String goodsName;//商品名称
	
	private String cargoData;//货道数据
	
	private String machCode;//设备编号
	
	private int isExist;//有无商品

	private String beState;
	
	private String cargoType;
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
	

	public String getCargoType() {
		return cargoType;
	}

	public void setCargoType(String cargoType) {
		this.cargoType = cargoType;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public BigInteger getReplenishId() {
		return replenishId;
	}

	public void setReplenishId(BigInteger replenishId) {
		this.replenishId = replenishId;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getCargoData() {
		return cargoData;
	}

	public void setCargoData(String cargoData) {
		this.cargoData = cargoData;
	}

	public String getMachCode() {
		return machCode;
	}

	public void setMachCode(String machCode) {
		this.machCode = machCode;
	}

	public int getIsExist() {
		return isExist;
	}

	public void setIsExist(int isExist) {
		this.isExist = isExist;
	}

	public String getBeState() {
		return beState;
	}

	public void setBeState(String beState) {
		this.beState = beState;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
