package com.cn.jf.backstage.dao.bg_dao.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class DeviceMaster {
    private  String  machCode;//机器编码
    private  String  machName;//机器识别码
    private  String  hostIp;//主机IP
    private  String  desAddr;//目标地址
    private  String  machModel;//机器型号
    private  String  machModelID;
    private  String  hostName;//主机名称(既公共机操作系统名称)
    private  String  storeId;//门店ID
    private  String  portNum;//端口号
    private  String  areaPrefix;//区域前缀
    private  String  routerCode;//路由器编号
    private  String  macAddr;//mac地址
    private  String  monitor;//显示器
    private  String  ipc;//工控机
    private  String  machType;//机器类型
    private  String  machOwner;//机器所有者
    private  String  tel;//电话
    private  String  cooperationMode;//合作方式
    private  String  operateCompany;//运营公司
   
    private  String   useAddr;//使用地址
	private  String   PermaintBy;//运维负责人
	private  String   replenishBy;//补货负责人
	
    private  String   createBy;//创建人
   
    private  String   updateBy;//更新人
	
	private  String   remark;//备注
	private  String  operatorID; // 运营方ID
	private  String  trouble;  //机器状态是否有故障
	private String  matter;  //货道是否配置
	private String  problem; //商品是否配置
	
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date leaseStartTime;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date leaseExpireTime;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date buyTime;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
	
	public String getMachModelID() {
		return machModelID;
	}
	public void setMachModelID(String machModelID) {
		this.machModelID = machModelID;
	}
	public String getMachCode() {
		return machCode;
	}
	public void setMachCode(String machCode) {
		this.machCode = machCode;
	}
	public String getMachName() {
		return machName;
	}
	public void setMachName(String machName) {
		this.machName = machName;
	}
	public String getHostIp() {
		return hostIp;
	}
	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}
	public String getDesAddr() {
		return desAddr;
	}
	public void setDesAddr(String desAddr) {
		this.desAddr = desAddr;
	}
	public String getMachModel() {
		return machModel;
	}
	public void setMachModel(String machModel) {
		this.machModel = machModel;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getPortNum() {
		return portNum;
	}
	public void setPortNum(String portNum) {
		this.portNum = portNum;
	}
	public String getAreaPrefix() {
		return areaPrefix;
	}
	public void setAreaPrefix(String areaPrefix) {
		this.areaPrefix = areaPrefix;
	}
	public String getRouterCode() {
		return routerCode;
	}
	public void setRouterCode(String routerCode) {
		this.routerCode = routerCode;
	}
	public String getMacAddr() {
		return macAddr;
	}
	public void setMacAddr(String macAddr) {
		this.macAddr = macAddr;
	}
	public String getMonitor() {
		return monitor;
	}
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public String getIpc() {
		return ipc;
	}
	public void setIpc(String ipc) {
		this.ipc = ipc;
	}
	public String getMachType() {
		return machType;
	}
	public void setMachType(String machType) {
		this.machType = machType;
	}
	public String getMachOwner() {
		return machOwner;
	}
	public void setMachOwner(String machOwner) {
		this.machOwner = machOwner;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCooperationMode() {
		return cooperationMode;
	}
	public void setCooperationMode(String cooperationMode) {
		this.cooperationMode = cooperationMode;
	}
	public String getOperateCompany() {
		return operateCompany;
	}
	public void setOperateCompany(String operateCompany) {
		this.operateCompany = operateCompany;
	}
	public String getUseAddr() {
		return useAddr;
	}
	public void setUseAddr(String useAddr) {
		this.useAddr = useAddr;
	}
	public String getPermaintBy() {
		return PermaintBy;
	}
	public void setPermaintBy(String permaintBy) {
		PermaintBy = permaintBy;
	}
	public String getReplenishBy() {
		return replenishBy;
	}
	public void setReplenishBy(String replenishBy) {
		this.replenishBy = replenishBy;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOperatorID() {
		return operatorID;
	}
	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	}
	public String getTrouble() {
		return trouble;
	}
	public void setTrouble(String trouble) {
		this.trouble = trouble;
	}
	public String getMatter() {
		return matter;
	}
	public void setMatter(String matter) {
		this.matter = matter;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public Date getLeaseStartTime() {
		return leaseStartTime;
	}
	public void setLeaseStartTime(Date leaseStartTime) {
		this.leaseStartTime = leaseStartTime;
	}
	public Date getLeaseExpireTime() {
		return leaseExpireTime;
	}
	public void setLeaseExpireTime(Date leaseExpireTime) {
		this.leaseExpireTime = leaseExpireTime;
	}
	public Date getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
