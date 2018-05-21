package com.cn.jf.backstage.dao.bg_dao.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class PayOrder {

	
	private  String  out_trade_no;//商户订单号
    private  String  transaction_id;//微信支付订单号
    private  String  fee_type;//货币种类
    private  double  cash_fee;//现金支付金额
    private  double  total_fee;//订单金额
    private  String  trade_type;//交易类型
    private  String  openid;//用户标识
    private  String  appid;//公众账号ID
    private  String  macaddress;//MAC地址
    private  String  buyer_id; // 支付宝买家用户号
    private  String  buyer_logon_id; // 支付宝买家账号
    private  double  total_amount; // 支付宝订单金额
    private  double  receipt_amount; // 支付宝实际收款金额
    private  String  trade_no; // 支付宝交易号
    private  String  mark;//支付标记
    private  String  state;//状态
    private  String  mch_id;//商户号
    
    private  String  mid;//银商商户号
    private  String  tid;//银商终端号
    private  String  mchntUuid;//银商唯一编码
    private  String  totalAmount;//银商订单金额
    
    private  String  waresId;//商品ID
    private  String  waresName;
    private  String  goodsType;
    
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private  Date  paymentDate;//支付日期

    
	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getMchntUuid() {
		return mchntUuid;
	}

	public void setMchntUuid(String mchntUuid) {
		this.mchntUuid = mchntUuid;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getWaresName() {
		return waresName;
	}

	public void setWaresName(String waresName) {
		this.waresName = waresName;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
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

	public double getCash_fee() {
		return cash_fee;
	}

	public void setCash_fee(double cash_fee) {
		this.cash_fee = cash_fee;
	}

	public double getTotal_fee() {
		return total_fee;
	}

	public void setTotal_fee(double total_fee) {
		this.total_fee = total_fee;
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

	public String getMacaddress() {
		return macaddress;
	}

	public void setMacaddress(String macaddress) {
		this.macaddress = macaddress;
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

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public double getReceipt_amount() {
		return receipt_amount;
	}

	public void setReceipt_amount(double receipt_amount) {
		this.receipt_amount = receipt_amount;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMch_id() {
		return mch_id;
	}

	public void setMch_id(String mch_id) {
		this.mch_id = mch_id;
	}

	public String getWaresId() {
		return waresId;
	}

	public void setWaresId(String waresId) {
		this.waresId = waresId;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
}
