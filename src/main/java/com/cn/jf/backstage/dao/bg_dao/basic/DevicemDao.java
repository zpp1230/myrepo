package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;
import java.util.Map;




/**
 * 设备管理dao
 * */
public interface DevicemDao {

	public <ModelType> List<ModelType> findmachCodePage(String operatorID) throws Exception;
	
	public <ModelType> Long findByOperCount(String operatorID) throws Exception;
	
	public <ModelType> List<ModelType> findByPage(String machCode,String machName) throws Exception;
	
	public <ModelType> Long findByCount(String machCode,String machName) throws Exception;
	
	public <ModelType> ModelType findByMacAddr(String macAddr) throws Exception;
	
	public <ModelType> ModelType findByMachCode(String machCode) throws Exception;
	
	public <ModelType> List<ModelType> findmachCodePageAA(String emplCode) throws Exception;
	
	public <ModelType> Long findByOperCountAA(String emplCode) throws Exception;
	
	public <ModelType> ModelType findOrderInfo(Map<String,Object> params) throws Exception;
}
