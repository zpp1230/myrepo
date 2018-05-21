package com.cn.jf.backstage.dao.bg_dao.entity;


public class Pay {
	private String pass;              //微信 密钥
	private String user;              //微信 公众号ID
	private String mch_id;	          //银商 商户号
	private byte[] papers;	          //微信 pcks12证书 , 大小不能小于2KB，小于1M
	private String appid;	          //支付宝 应用ID
	private String sdkpass;           //支付宝 私钥
	private String sdkuser;           //支付宝 公钥
	private String silver_merchant;   //银商  平台商户号
	private String silver_end;        //银商 终端号
	private String silver_mechanism;  //银商  机构商户号
	private String silver_news;    //银商 消息来源
	private String silver_number;  //银商 来源编号
	private String silver_md5;     //银商 md5 密钥
	private String operatorID;     //运营商ID
	private String pay_method;     //支付方式
	private Integer id;            //本表ID
	private String fileName;       //文件名称
	private String fileRealName;   //文件名
	
	public String getFileRealName() {
		return fileRealName;
	}
	public void setFileRealName(String fileRealName) {
		this.fileRealName = fileRealName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getMch_id() {
		return mch_id;
	}
	public void setMch_id(String mch_id) {
		this.mch_id = mch_id;
	}
	public byte[] getPapers() {
		return papers;
	}
	public void setPapers(byte[] papers) {
		this.papers = papers;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getSdkpass() {
		return sdkpass;
	}
	public void setSdkpass(String sdkpass) {
		this.sdkpass = sdkpass;
	}
	public String getSdkuser() {
		return sdkuser;
	}
	public void setSdkuser(String sdkuser) {
		this.sdkuser = sdkuser;
	}
	public String getSilver_merchant() {
		return silver_merchant;
	}
	public void setSilver_merchant(String silver_merchant) {
		this.silver_merchant = silver_merchant;
	}
	public String getSilver_end() {
		return silver_end;
	}
	public void setSilver_end(String silver_end) {
		this.silver_end = silver_end;
	}
	public String getSilver_mechanism() {
		return silver_mechanism;
	}
	public void setSilver_mechanism(String silver_mechanism) {
		this.silver_mechanism = silver_mechanism;
	}
	public String getSilver_news() {
		return silver_news;
	}
	public void setSilver_news(String silver_news) {
		this.silver_news = silver_news;
	}
	public String getSilver_number() {
		return silver_number;
	}
	public void setSilver_number(String silver_number) {
		this.silver_number = silver_number;
	}
	public String getSilver_md5() {
		return silver_md5;
	}
	public void setSilver_md5(String silver_md5) {
		this.silver_md5 = silver_md5;
	}
	public String getOperatorID() {
		return operatorID;
	}
	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	}
	public String getPay_method() {
		return pay_method;
	}
	public void setPay_method(String pay_method) {
		this.pay_method = pay_method;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}
