package com.cn.jf.backstage.dao.bg_dao.entity;

import java.io.Serializable;
import java.math.BigInteger;



/**
 * 补货清单--清出商品（已过期[补入时间]和未过期[]）
 * */
public class GoodsRectify implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private BigInteger rectifyId;//清出数据表
	
	private String waresId;//商品id
	
	private String waresName;//商品名称
	
	private String cargoDatan;//货道数据
	
	private String isPastdue;//是否过期，是/否，默认为否
	
	private String deviceId;//设备编号

	
	private String beState;
	
	
	private int isPastd;
	
	
	public int getIsPastd() {
		return isPastd;
	}

	public void setIsPastd(int isPastd) {
		this.isPastd = isPastd;
	}

	public String getBeState() {
		return beState;
	}

	public void setBeState(String beState) {
		this.beState = beState;
	}

	public BigInteger getRectifyId() {
		return rectifyId;
	}

	public void setRectifyId(BigInteger rectifyId) {
		this.rectifyId = rectifyId;
	}

	public String getWaresId() {
		return waresId;
	}

	public void setWaresId(String waresId) {
		this.waresId = waresId;
	}

	public String getWaresName() {
		return waresName;
	}

	public void setWaresName(String waresName) {
		this.waresName = waresName;
	}

	public String getCargoDatan() {
		return cargoDatan;
	}

	public void setCargoDatan(String cargoDatan) {
		this.cargoDatan = cargoDatan;
	}

	public String getIsPastdue() {
		return isPastdue;
	}

	public void setIsPastdue(String isPastdue) {
		this.isPastdue = isPastdue;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
}
