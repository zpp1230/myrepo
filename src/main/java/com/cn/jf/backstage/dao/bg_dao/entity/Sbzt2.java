package com.cn.jf.backstage.dao.bg_dao.entity;

public class Sbzt2 {
	private String startTime;  //开始时间
	private String endTime; //结束时间
	private String start;    //启动温度
	private String end;      //停止温度
	private String more;     //超出时间
	private String machCode; // 设备号 
	private Integer sbztId;  
	
	public Sbzt2(){
		
	}
	
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getMore() {
		return more;
	}
	public void setMore(String more) {
		this.more = more;
	}
	public String getMachCode() {
		return machCode;
	}
	public void setMachCode(String machCode) {
		this.machCode = machCode;
	}

	public Integer getSbztId() {
		return sbztId;
	}

	public void setSbztId(Integer sbztId) {
		this.sbztId = sbztId;
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
	

}
