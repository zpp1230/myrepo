package com.cn.jf.backstage.dao.bg_dao.model;

public class Goods {
	private String ID ;//商品ID
	private String tradename;//商品名称  必填
	private double  price;//商品价格  必填
	private String pathimage;//选餐图片
    private String flag;
	private String pOrderImag;//订单图片
	private String describe;//商品简介 
	private int starValue;//推荐星值
	private String callbackUrl;//回调函数
	private String macAddress;//mac地址  必填
	private String timeout;//超时时间
	private String store;//店铺
	private String order;//订单
	private String attach;//附加数据
	
	public String getAttach() {
		return attach;
	}
	public void setAttach(String attach) {
		this.attach = attach;
	}
	public String getTimeout() {
		return timeout;
	}
	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	public String getCallbackUrl() {
		return callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getTradename() {
		return tradename;
	}
	public void setTradename(String tradename) {
		this.tradename = tradename;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPathimage() {
		return pathimage;
	}
	public void setPathimage(String pathimage) {
		this.pathimage = pathimage;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getpOrderImag() {
		return pOrderImag;
	}
	public void setpOrderImag(String pOrderImag) {
		this.pOrderImag = pOrderImag;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public int getStarValue() {
		return starValue;
	}
	public void setStarValue(int starValue) {
		this.starValue = starValue;
	}
	}
 