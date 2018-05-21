package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * 设备管理（机器编码）
 * */
public interface DevicemMapper {
	
	public <ModelType> List<ModelType> findmachCodePage(@Param("operatorID") String operatorID) throws Exception;
	
	public <ModelType> Long findByOperCount(@Param("operatorID") String operatorID) throws Exception;
	
	public <ModelType> List<ModelType> findByPage(@Param("machCode") String machCode,
			@Param("machName") String machName) throws Exception;
	
	public <ModelType> Long findByCount(@Param("machCode") String machCode,
			@Param("machName") String machName) throws Exception;
	
	public <ModelType> ModelType findByMacAddr(@Param("macAddr") String macAddr) throws Exception;
	
	public <ModelType> ModelType findByMachCode(@Param("machCode") String machCode) throws Exception;
	
	public <ModelType> List<ModelType> findmachCodePageAA(@Param("emplCode") String emplCode) throws Exception;
	
	public <ModelType> Long findByOperCountAA(@Param("emplCode") String emplCode) throws Exception;
	
	public <ModelType> ModelType findOrderInfo(@Param("params")Map<String,Object> params) throws Exception ;
}
