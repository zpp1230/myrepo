package com.cn.jf.backstage.dao.bg_dao.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class GoodsMaster {
    private  String   waresId;//商品ID
    private  String   waresName;//商品名称
    private  double   waresPrice;//商品价格
    private  String   waresImage1;//选餐图片
    private  String   waresImage2;//下单图片
    private  int      starValue;//推荐星值
    private  String   callBackUrl;//回调函数
    private  String   waresDiscr;//商品描述
    private  Integer  quaGuaPeriod;//保质期
    private  String   operParty;//运营方
    private  String   waresSyno;//商品简介
    private  double   waresCost;//商品成本
    private  double   actualSelPrice;//实际售价
    private  String   unitPrice;//价格单位
    private  String   waresLunchboxModel;//商品餐盒规格
    private  String   theGoodsModel;//货道规格
    private  String   barCodeNo;//条码编码
    private  Integer  heatingTime;//加热时间
    private  String   supplier;//供应商
    private  String   waresType;//商品类型
	
    private  String   createBy;//创建人
    
    private  String   updateBy;//更新人
	private  String   remark;//备注
	private String operatorID;
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
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
	public double getWaresPrice() {
		return waresPrice;
	}
	public void setWaresPrice(double waresPrice) {
		this.waresPrice = waresPrice;
	}
	public String getWaresImage1() {
		return waresImage1;
	}
	public void setWaresImage1(String waresImage1) {
		this.waresImage1 = waresImage1;
	}
	public String getWaresImage2() {
		return waresImage2;
	}
	public void setWaresImage2(String waresImage2) {
		this.waresImage2 = waresImage2;
	}
	public int getStarValue() {
		return starValue;
	}
	public void setStarValue(int starValue) {
		this.starValue = starValue;
	}
	public String getCallBackUrl() {
		return callBackUrl;
	}
	public void setCallBackUrl(String callBackUrl) {
		this.callBackUrl = callBackUrl;
	}
	public String getWaresDiscr() {
		return waresDiscr;
	}
	public void setWaresDiscr(String waresDiscr) {
		this.waresDiscr = waresDiscr;
	}
	public Integer getQuaGuaPeriod() {
		return quaGuaPeriod;
	}
	public void setQuaGuaPeriod(Integer quaGuaPeriod) {
		this.quaGuaPeriod = quaGuaPeriod;
	}
	public String getOperParty() {
		return operParty;
	}
	public void setOperParty(String operParty) {
		this.operParty = operParty;
	}
	public String getWaresSyno() {
		return waresSyno;
	}
	public void setWaresSyno(String waresSyno) {
		this.waresSyno = waresSyno;
	}
	public double getWaresCost() {
		return waresCost;
	}
	public void setWaresCost(double waresCost) {
		this.waresCost = waresCost;
	}
	public double getActualSelPrice() {
		System.out.println(actualSelPrice);
		return actualSelPrice;
	}
	public void setActualSelPrice(double actualSelPrice) {
		this.actualSelPrice = actualSelPrice;
	}
	public String getUnitPrice() {
		System.out.println(unitPrice);
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getWaresLunchboxModel() {
		
		System.out.println(waresLunchboxModel);
		
		return waresLunchboxModel;
	}
	public void setWaresLunchboxModel(String waresLunchboxModel) {
		this.waresLunchboxModel = waresLunchboxModel;
	}
	public String getTheGoodsModel() {
		return theGoodsModel;
	}
	public void setTheGoodsModel(String theGoodsModel) {
		this.theGoodsModel = theGoodsModel;
	}
	public String getBarCodeNo() {
		return barCodeNo;
	}
	public void setBarCodeNo(String barCodeNo) {
		this.barCodeNo = barCodeNo;
	}
	public Integer getHeatingTime() {
		return heatingTime;
	}
	public void setHeatingTime(Integer heatingTime) {
		this.heatingTime = heatingTime;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getWaresType() {
		return waresType;
	}
	public void setWaresType(String waresType) {
		this.waresType = waresType;
	}
	public String getCreateBy() {
		System.out.println(createBy);
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOperatorID() {
		return operatorID;
	}
	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		System.out.println(updateTime);
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
