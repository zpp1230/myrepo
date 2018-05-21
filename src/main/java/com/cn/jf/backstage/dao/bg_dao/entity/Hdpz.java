package com.cn.jf.backstage.dao.bg_dao.entity;

public class Hdpz {
	private String operatorID; // 运营方ID
	private String machCode;   // 设备编号
	private String model;      // 机型
	
	public Hdpz(){
		
	}
	public String getOperatorID() {
		return operatorID;
	}
	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	}
	public String getMachCode() {
		return machCode;
	}
	public void setMachCode(String machCode) {
		this.machCode = machCode;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

}
