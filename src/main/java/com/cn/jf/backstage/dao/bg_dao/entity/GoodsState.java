package com.cn.jf.backstage.dao.bg_dao.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * 补货清单--商品状态
 * */
public class GoodsState implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigInteger stateId;//id
	private String goodsId;//商品id
	private String goodsName;//商品名称
	private String cargoData;//货道数据
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date reenterDate;//补入日期
	private String machCode;//设备编号
	private int expiratDate;//保质期
	private int isExist;//有无商品
	private String beState;
	private String cargoType;

	public String getCargoType() {
		return cargoType;
	}
	public void setCargoType(String cargoType) {
		this.cargoType = cargoType;
	}
	//创建时间
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
	
	public GoodsState(){}
	public Date getReenterDate() {
		return reenterDate;
	}
	public void setReenterDate(Date reenterDate) {
		this.reenterDate = reenterDate;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	public Date getCreateTime(){
		return createTime;
	}
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	public String getBeState(){
		return beState;
	}
	public void setBeState(String beState){
		this.beState = beState;
	}
	public BigInteger getStateId(){
		return stateId;
	}
	public void setStateId(BigInteger stateId){
		this.stateId = stateId;
	}
	public String getGoodsId(){
		return goodsId;
	}
	public void setGoodsId(String goodsId){
		this.goodsId = goodsId;
	}
	public String getGoodsName(){
		return goodsName;
	}
	public void setGoodsName(String goodsName){
		this.goodsName = goodsName;
	}
	public String getCargoData(){
		return cargoData;
	}
	public void setCargoData(String cargoData){
		this.cargoData = cargoData;
	}
	public String getMachCode(){
		return machCode;
	}
	public void setMachCode(String machCode){
		this.machCode = machCode;
	}
	public int getExpiratDate(){
		return expiratDate;
	}
	public void setExpiratDate(int expiratDate){
		this.expiratDate = expiratDate;
	}
	public int getIsExist(){
		return isExist;
	}
	public void setIsExist(int isExist){
		this.isExist = isExist;
	}

}
