package com.cn.jf.backstage.dao.bg_dao.entity;

import java.math.BigInteger;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class GeminiGoodsStateAssist {

private BigInteger stateId;
	
	private String goodsId;			//商品id
	
	private String goodsName;		//商品名称
	
	private String barCode;			//条码
	
	private Integer haveOrnot;		//是否有货
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date productdate;		//生产时间
	
	private String machCode;		//设备编号
	
	private String macAddr;			//mac地址
	
	private String cargodata;		//货道数据
	
	private String beState;
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;		//创建时间
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date updateTime;		//更新时间

	public BigInteger getStateId() {
		return stateId;
	}

	public void setStateId(BigInteger stateId) {
		this.stateId = stateId;
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

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public Integer getHaveOrnot() {
		return haveOrnot;
	}

	public void setHaveOrnot(Integer haveOrnot) {
		this.haveOrnot = haveOrnot;
	}

	public Date getProductdate() {
		return productdate;
	}

	public void setProductdate(Date productdate) {
		this.productdate = productdate;
	}

	public String getMachCode() {
		return machCode;
	}

	public void setMachCode(String machCode) {
		this.machCode = machCode;
	}

	public String getMacAddr() {
		return macAddr;
	}

	public void setMacAddr(String macAddr) {
		this.macAddr = macAddr;
	}

	public String getCargodata() {
		return cargodata;
	}

	public void setCargodata(String cargodata) {
		this.cargodata = cargodata;
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
