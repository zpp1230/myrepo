package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;





public interface PayOrderStatisticDao {

	
	public <ModelType> ModelType findOperWithEmpCode(String emplCode) throws Exception;
	
	public <ModelType> List<ModelType> findMachWithOper(String operatorID) throws Exception;
	
	public <ModelType> List<ModelType> findGoodsWithMachCode(String machCode) throws Exception;
	
	public <ModelType> List<ModelType> findGoodsWithOper(String operatorID) throws Exception;
	
	public <ModelType> List<ModelType> findPay(String macaddress,String openid,
			String buyer_id) throws Exception;
	
	public <ModelType> List<ModelType> findMachWithOperAA(String emplCode) throws Exception;
}
