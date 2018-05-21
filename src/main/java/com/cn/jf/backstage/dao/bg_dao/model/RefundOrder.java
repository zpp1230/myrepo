package com.cn.jf.backstage.dao.bg_dao.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 退款实体
 * */
public class RefundOrder {

	
	private  String  out_trade_no;//商户订单号
	
	private  String  transaction_id;//微信支付订单号
	
    private  String  fee_type;//货币种类
    
    private  String  trade_no; // 支付宝交易号
    
    private  String  mark;//支付标记
    
    private  String  waresId;//商品ID
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private  Date  refundDate;//支付日期
    
    private double refund_fee;

    private  String  macaddress;//MAC地址
    
    private String refund_remark;
    
    private  String  trade_type;//交易类型
    private  String  openid;//用户标识
    private  String  appid;//公众账号ID
    private  String  buyer_id; // 支付宝买家用户号
    private  String  buyer_logon_id; // 支付宝买家账号
    
    private String cargoData;
    
    private String machCode;
    
    
    
    public String getCargoData() {
		return cargoData;
	}

	public void setCargoData(String cargoData) {
		this.cargoData = cargoData;
	}

	public String getMachCode() {
		return machCode;
	}

	public void setMachCode(String machCode) {
		this.machCode = machCode;
	}

	public String getTrade_type() {
		return trade_type;
	}

	public void setTrade_type(String trade_type) {
		this.trade_type = trade_type;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getBuyer_id() {
		return buyer_id;
	}

	public void setBuyer_id(String buyer_id) {
		this.buyer_id = buyer_id;
	}

	public String getBuyer_logon_id() {
		return buyer_logon_id;
	}

	public void setBuyer_logon_id(String buyer_logon_id) {
		this.buyer_logon_id = buyer_logon_id;
	}

	
    

	public String getRefund_remark() {
		return refund_remark;
	}

	public void setRefund_remark(String refund_remark) {
		this.refund_remark = refund_remark;
	}

	public String getMacaddress() {
		return macaddress;
	}

	public void setMacaddress(String macaddress) {
		this.macaddress = macaddress;
	}

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getFee_type() {
		return fee_type;
	}

	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}

	public String getTrade_no() {
		return trade_no;
	}

	public void setTrade_no(String trade_no) {
		this.trade_no = trade_no;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getWaresId() {
		return waresId;
	}

	public void setWaresId(String waresId) {
		this.waresId = waresId;
	}

	public Date getRefundDate() {
		return refundDate;
	}

	public void setRefundDate(Date refundDate) {
		this.refundDate = refundDate;
	}

	public double getRefund_fee() {
		return refund_fee;
	}

	public void setRefund_fee(double refund_fee) {
		this.refund_fee = refund_fee;
	}
    
    
    
}
