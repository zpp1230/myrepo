package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 补货清单mapper接口
 * */
public interface ReplenInformationMapper {

	public <ModelType> List<ModelType> findByMachCode(@Param("machCode") String machCode) throws Exception;
	
	public <ModelType> int addReplenInformation(ModelType modelType) throws Exception;
	
	public <ModelType> int updateReplenInformation(ModelType modelType) throws Exception;
	
	public <ModelType> int deleteReplenInformation(ModelType modelType) throws Exception;
	
	public <ModelType> ModelType findByMachCodeAndCargo(@Param("machCode") String machCode,@Param("cargoData") String cargoData) throws Exception;
}
