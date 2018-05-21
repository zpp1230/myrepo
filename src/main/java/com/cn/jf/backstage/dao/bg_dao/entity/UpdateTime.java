package com.cn.jf.backstage.dao.bg_dao.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class UpdateTime implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigInteger comId;
	
	private String deviceId;
	
	private String goodsId;
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date updateTimeg;


	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUpdateTimeg() {
		return updateTimeg;
	}

	public void setUpdateTimeg(Date updateTimeg) {
		this.updateTimeg = updateTimeg;
	}

	public BigInteger getComId() {
		return comId;
	}

	public void setComId(BigInteger comId) {
		this.comId = comId;
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
}
