package com.cn.jf.backstage.dao.bg_dao.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Hdlb {
	// 货道类别主档ID
	private String categoryId;

	// 货道类别
	private String goodsCategory;

	// 货道形状：1、扇形，2、立方体，3、特定形状
	private String goodsForm;

	// 长度
	private String goodsLength;

	// 宽度
	private String goodsWidth;

	// 高度
	private String goodsHeight;

	// 图片
	private String goodsPic;

	// 允许最大商品规格
	private String maxComNorms;

	// 允许最小商品规格
	private String minComNorms;

	// 出货方式：1、自取，2、挑出，3、推出，4、负压
	private String shipmentWay;

	// 创建人
	private String createPer;

	

	// 更改人
	// private String updatePre;

	private String updatePer;
	
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date modifyTime;
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getGoodsCategory() {
		return goodsCategory;
	}
	public void setGoodsCategory(String goodsCategory) {
		this.goodsCategory = goodsCategory;
	}
	public String getGoodsForm() {
		return goodsForm;
	}
	public void setGoodsForm(String goodsForm) {
		this.goodsForm = goodsForm;
	}
	public String getGoodsLength() {
		return goodsLength;
	}
	public void setGoodsLength(String goodsLength) {
		this.goodsLength = goodsLength;
	}
	public String getGoodsWidth() {
		return goodsWidth;
	}
	public void setGoodsWidth(String goodsWidth) {
		this.goodsWidth = goodsWidth;
	}
	public String getGoodsHeight() {
		return goodsHeight;
	}
	public void setGoodsHeight(String goodsHeight) {
		this.goodsHeight = goodsHeight;
	}
	public String getGoodsPic() {
		return goodsPic;
	}
	public void setGoodsPic(String goodsPic) {
		this.goodsPic = goodsPic;
	}
	public String getMaxComNorms() {
		return maxComNorms;
	}
	public void setMaxComNorms(String maxComNorms) {
		this.maxComNorms = maxComNorms;
	}
	public String getMinComNorms() {
		return minComNorms;
	}
	public void setMinComNorms(String minComNorms) {
		this.minComNorms = minComNorms;
	}
	public String getShipmentWay() {
		return shipmentWay;
	}
	public void setShipmentWay(String shipmentWay) {
		this.shipmentWay = shipmentWay;
	}
	public String getCreatePer() {
		return createPer;
	}
	public void setCreatePer(String createPer) {
		this.createPer = createPer;
	}
	public String getUpdatePer() {
		return updatePer;
	}
	public void setUpdatePer(String updatePer) {
		this.updatePer = updatePer;
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

	
}
