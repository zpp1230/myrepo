package com.cn.jf.backstage.dao.bg_dao.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class discountcoefficient implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String discountTieId;
	//折扣系数
	private String discountTie;
	//开始时间
	private String startTime;
	//结束时间
	private String endTime;
	//创建人
	private String createPer;	
	//创建时间

	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	//更改时间
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date modifyTime;
		
	private String updatePer;
	
	
	private String operatorID;
	
	

	public String getOperatorID() {
		return operatorID;
	}

	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	}

	public String getDiscountTieId() {
		return discountTieId;
	}

	public void setDiscountTieId(String discountTieId) {
		this.discountTieId = discountTieId;
	}

	public String getDiscountTie() {
		return discountTie;
	}

	public void setDiscountTie(String discountTie) {
		this.discountTie = discountTie;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getCreatePer() {
		return createPer;
	}

	public void setCreatePer(String createPer) {
		this.createPer = createPer;
	}


	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getUpdatePer() {
		return updatePer;
	}

	public void setUpdatePer(String updatePer) {
		this.updatePer = updatePer;
	}

}
