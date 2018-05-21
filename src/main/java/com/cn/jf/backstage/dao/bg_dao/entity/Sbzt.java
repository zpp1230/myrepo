package com.cn.jf.backstage.dao.bg_dao.entity;


import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Sbzt {
	private String machCode; //设备编号
	private String macAddr;  //mac地址
	private String rotate;   //旋转步进电机
	private String getGoodsDoor1; //取物门电机1
	private String getGoodsDoor2; //取物门电机2
	private String getGoodsDoor3; //取物门电机3	
	private String getGoodsDoor4; //取物门电机4
	private String getGoodsDoor5; //取物门电机5
	private String getGoodsDoor6; //取物门电机6
	private String getGoodsDoor7; //取物门电机7
	private String getGoodsDoor8; //取物门电机8
	private String getGoodsDoor9; //取物门电机9
	private String getGoodsDoor10; //取物门电机10
	private String trough;         //槽型开关
	private String temperatureSensor; //温度传感器
	private String save;             //保留
	private String doorStatus;       //门状态
	private String houseTemperature; //货仓温度
	private Integer sbztId;          //设备状态ID
	private String history;         //历史状态
	private String trouble;          //是否有故障
		
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date addTime;
	
	private String nsj; // 内升降
	private String xz;  //旋转
	private String wsj; //外升降
	private String ntp; //内托盘取货
	private String nth; //内推货
	private String bwm; //保温门
	private String wth; //外推货
	private String qwm; //取物门
	private String whjc; //外托盘红外检测
	private String qwmhw; //取物门红外未检测到
	private String cshzd; //初始化时取物门被遮挡
	private String qwmcs; //取饭盒时取物门超时
	private String gbcs;  //取物门关闭超时
	private String wbyc;  //微波异常
	
	
	
	public Sbzt(){
		
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



	public String getRotate() {
		return rotate;
	}



	public void setRotate(String rotate) {
		this.rotate = rotate;
	}



	public String getGetGoodsDoor1() {
		return getGoodsDoor1;
	}



	public void setGetGoodsDoor1(String getGoodsDoor1) {
		this.getGoodsDoor1 = getGoodsDoor1;
	}



	public String getGetGoodsDoor2() {
		return getGoodsDoor2;
	}



	public void setGetGoodsDoor2(String getGoodsDoor2) {
		this.getGoodsDoor2 = getGoodsDoor2;
	}



	public String getGetGoodsDoor3() {
		return getGoodsDoor3;
	}



	public void setGetGoodsDoor3(String getGoodsDoor3) {
		this.getGoodsDoor3 = getGoodsDoor3;
	}



	public String getGetGoodsDoor4() {
		return getGoodsDoor4;
	}



	public void setGetGoodsDoor4(String getGoodsDoor4) {
		this.getGoodsDoor4 = getGoodsDoor4;
	}



	public String getGetGoodsDoor5() {
		return getGoodsDoor5;
	}



	public void setGetGoodsDoor5(String getGoodsDoor5) {
		this.getGoodsDoor5 = getGoodsDoor5;
	}



	public String getGetGoodsDoor6() {
		return getGoodsDoor6;
	}



	public void setGetGoodsDoor6(String getGoodsDoor6) {
		this.getGoodsDoor6 = getGoodsDoor6;
	}



	public String getGetGoodsDoor7() {
		return getGoodsDoor7;
	}



	public void setGetGoodsDoor7(String getGoodsDoor7) {
		this.getGoodsDoor7 = getGoodsDoor7;
	}



	public String getGetGoodsDoor8() {
		return getGoodsDoor8;
	}



	public void setGetGoodsDoor8(String getGoodsDoor8) {
		this.getGoodsDoor8 = getGoodsDoor8;
	}



	public String getGetGoodsDoor9() {
		return getGoodsDoor9;
	}



	public void setGetGoodsDoor9(String getGoodsDoor9) {
		this.getGoodsDoor9 = getGoodsDoor9;
	}



	public String getGetGoodsDoor10() {
		return getGoodsDoor10;
	}



	public void setGetGoodsDoor10(String getGoodsDoor10) {
		this.getGoodsDoor10 = getGoodsDoor10;
	}



	public String getTrough() {
		return trough;
	}



	public void setTrough(String trough) {
		this.trough = trough;
	}



	public String getTemperatureSensor() {
		return temperatureSensor;
	}



	public void setTemperatureSensor(String temperatureSensor) {
		this.temperatureSensor = temperatureSensor;
	}



	public String getSave() {
		return save;
	}



	public void setSave(String save) {
		this.save = save;
	}



	public String getDoorStatus() {
		return doorStatus;
	}



	public void setDoorStatus(String doorStatus) {
		this.doorStatus = doorStatus;
	}



	public String getHouseTemperature() {
		return houseTemperature;
	}



	public void setHouseTemperature(String houseTemperature) {
		this.houseTemperature = houseTemperature;
	}



	public Integer getSbztId() {
		return sbztId;
	}



	public void setSbztId(Integer sbztId) {
		this.sbztId = sbztId;
	}



	public String getHistory() {
		return history;
	}



	public void setHistory(String history) {
		this.history = history;
	}



	public String getTrouble() {
		return trouble;
	}



	public void setTrouble(String trouble) {
		this.trouble = trouble;
	}



	public Date getAddTime() {
		return addTime;
	}



	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}



	public String getNsj() {
		return nsj;
	}



	public void setNsj(String nsj) {
		this.nsj = nsj;
	}



	public String getXz() {
		return xz;
	}



	public void setXz(String xz) {
		this.xz = xz;
	}



	public String getWsj() {
		return wsj;
	}



	public void setWsj(String wsj) {
		this.wsj = wsj;
	}



	public String getNtp() {
		return ntp;
	}



	public void setNtp(String ntp) {
		this.ntp = ntp;
	}



	public String getNth() {
		return nth;
	}



	public void setNth(String nth) {
		this.nth = nth;
	}



	public String getBwm() {
		return bwm;
	}



	public void setBwm(String bwm) {
		this.bwm = bwm;
	}



	public String getWth() {
		return wth;
	}



	public void setWth(String wth) {
		this.wth = wth;
	}



	public String getQwm() {
		return qwm;
	}



	public void setQwm(String qwm) {
		this.qwm = qwm;
	}



	public String getWhjc() {
		return whjc;
	}



	public void setWhjc(String whjc) {
		this.whjc = whjc;
	}



	public String getQwmhw() {
		return qwmhw;
	}



	public void setQwmhw(String qwmhw) {
		this.qwmhw = qwmhw;
	}



	public String getCshzd() {
		return cshzd;
	}



	public void setCshzd(String cshzd) {
		this.cshzd = cshzd;
	}



	public String getQwmcs() {
		return qwmcs;
	}



	public void setQwmcs(String qwmcs) {
		this.qwmcs = qwmcs;
	}



	public String getGbcs() {
		return gbcs;
	}



	public void setGbcs(String gbcs) {
		this.gbcs = gbcs;
	}



	public String getWbyc() {
		return wbyc;
	}



	public void setWbyc(String wbyc) {
		this.wbyc = wbyc;
	}
	
	
	
}
