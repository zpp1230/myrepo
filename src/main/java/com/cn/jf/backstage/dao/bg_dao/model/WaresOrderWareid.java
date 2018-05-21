package com.cn.jf.backstage.dao.bg_dao.model;


/**
 * 支付相关联数据表--PayOrder
 * */
public class WaresOrderWareid {

	private Integer id;
	
	private String out_trade_no;
	
	private String waresId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public String getWaresId() {
		return waresId;
	}

	public void setWaresId(String waresId) {
		this.waresId = waresId;
	}
	
	
	
}
