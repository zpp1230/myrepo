package com.cn.jf.backstage.dao.bg_dao.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/*
 * 商品类别主档
 */
public class Splb {
	private String operatorID; // 运营方ID
	private String goodsTypeCode; // 商品类别编码
	private String goodsType; // 商品类别
	private String createMan; // 创建人
	
	private String changeMan; // 更改人
	
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date changeTime;

	public Splb() {

	}

	public String getOperatorID() {
		return operatorID;
	}

	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	}

	public String getGoodsTypeCode() {
		return goodsTypeCode;
	}

	public void setGoodsTypeCode(String goodsTypeCode) {
		this.goodsTypeCode = goodsTypeCode;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
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
