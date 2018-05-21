package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;



/**
 * 补货清单dao接口
 * */
public interface ReplenInformationDao {

	public <ModelType> List<ModelType> findByMachCode(String machCode) throws Exception;
	
	public <ModelType> int addReplenInformation(ModelType modelType) throws Exception;
	
	public <ModelType> int updateReplenInformation(ModelType modelType) throws Exception;
	
	public <ModelType> int deleteReplenInformation(ModelType modelType) throws Exception;
	
	public <ModelType> ModelType findByMachCodeAndCargo(String machCode,String cargoData) throws Exception;
}
