package com.cn.jf.backstage.dao.bg_dao.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Jxzd {
	private String modelNum; // 机型编号
	private String model; // 机型
	private String coolType; // 制冷类别
	private String hotType; // 加热类别
	private String ipcSize; // 工控机规格
	private String os; // 操作系统
	private String routerSize; // 路由器规格
	private String displayer1; // 显示器1
	private String displayer2; // 显示器2
	private String coinMech; // 纸硬币器
	private String qrcodeScanner; // 二维码扫描器
	private String voltage; // 额定电压
	private String width; // 宽度
	private String depth; // 深度
	private String height; // 高度
	private String weight; // 重量
	private String electricity; // 最大电流
	private String power; // 最大功率
	private String camera; // 摄像头
	private String infrared; // 红外人体感应
	private String ozone; // 臭氧杀菌
	private String environment; // 使用环境
	private String temperature; // 环境温度
	private String humidity; // 环境湿度
	private String noise; // 机器噪音
	private String takeWay; // 取货方式
	private String takeNum; // 取物口数量
	private String picture; // 机型图片	
	private String goodsSize; // 货到规格
	private String keepDate; // 保养周期
	private String createMan; // 创建人
	
	private String changeMan; // 更改人
	
	/*private String jxlName;*/
	
	
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date changeTime;

	public Jxzd() {

	}

	public String getModelNum() {
		return modelNum;
	}

	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCoolType() {
		return coolType;
	}

	public void setCoolType(String coolType) {
		this.coolType = coolType;
	}

	public String getHotType() {
		return hotType;
	}

	public void setHotType(String hotType) {
		this.hotType = hotType;
	}

	public String getIpcSize() {
		return ipcSize;
	}

	public void setIpcSize(String ipcSize) {
		this.ipcSize = ipcSize;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getRouterSize() {
		return routerSize;
	}

	public void setRouterSize(String routerSize) {
		this.routerSize = routerSize;
	}

	public String getDisplayer1() {
		return displayer1;
	}

	public void setDisplayer1(String displayer1) {
		this.displayer1 = displayer1;
	}

	public String getDisplayer2() {
		return displayer2;
	}

	public void setDisplayer2(String displayer2) {
		this.displayer2 = displayer2;
	}

	public String getCoinMech() {
		return coinMech;
	}

	public void setCoinMech(String coinMech) {
		this.coinMech = coinMech;
	}

	public String getQrcodeScanner() {
		return qrcodeScanner;
	}

	public void setQrcodeScanner(String qrcodeScanner) {
		this.qrcodeScanner = qrcodeScanner;
	}

	public String getVoltage() {
		return voltage;
	}

	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	/*public String getJxlName() {
		return jxlName;
	}

	public void setJxlName(String jxlName) {
		this.jxlName = jxlName;
	}*/

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getElectricity() {
		return electricity;
	}

	public void setElectricity(String electricity) {
		this.electricity = electricity;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public String getInfrared() {
		return infrared;
	}

	public void setInfrared(String infrared) {
		this.infrared = infrared;
	}

	public String getOzone() {
		return ozone;
	}

	public void setOzone(String ozone) {
		this.ozone = ozone;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

	public String getTakeWay() {
		return takeWay;
	}

	public void setTakeWay(String takeWay) {
		this.takeWay = takeWay;
	}

	public String getTakeNum() {
		return takeNum;
	}

	public void setTakeNum(String takeNum) {
		this.takeNum = takeNum;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getGoodsSize() {
		return goodsSize;
	}

	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}

	public String getKeepDate() {
		return keepDate;
	}

	public void setKeepDate(String keepDate) {
		this.keepDate = keepDate;
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
