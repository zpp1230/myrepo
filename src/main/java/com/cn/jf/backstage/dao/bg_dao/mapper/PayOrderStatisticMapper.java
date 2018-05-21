package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 报表明细接口
 * */
public interface PayOrderStatisticMapper {

	public <ModelType> ModelType findOperWithEmpCode(@Param("emplCode") String emplCode) throws Exception;
	
	public <ModelType> List<ModelType> findMachWithOper(@Param("operatorID") String operatorID) throws Exception;
	
	public <ModelType> List<ModelType> findGoodsWithMachCode(@Param("machCode") String machCode) throws Exception;
	
	public <ModelType> List<ModelType> findGoodsWithOper(@Param("operatorID") String operatorID) throws Exception;
	
	public <ModelType> List<ModelType> findPay(@Param("macaddress") String macaddress,
			@Param("openid") String openid,@Param("buyer_id") String buyer_id) throws Exception;
	
	public <ModelType> List<ModelType> findMachWithOperAA(@Param("emplCode") String emplCode) throws Exception;
}
