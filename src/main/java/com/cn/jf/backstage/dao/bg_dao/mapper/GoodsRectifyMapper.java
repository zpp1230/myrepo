package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 补货清单--清出
 * */
public interface GoodsRectifyMapper {

	public <ModelType> List<ModelType> findByMoch(@Param("deviceId") String deviceId) throws Exception;
	
	public <ModelType> int addGoodsRectify(ModelType modelType) throws Exception;
	
	
	public <ModelType> int updateGoodsRectify(ModelType modelType) throws Exception;
	
	public <ModelType> ModelType findByParam(@Param("deviceId") String deviceId,
			@Param("cargoDatan") String cargoDatan) throws Exception;
	
	
	public <ModelType> ModelType findByParamIsPastdOne(@Param("deviceId") String deviceId,
			@Param("cargoDatan") String cargoDatan) throws Exception;
	
	
	public <ModelType> ModelType findByParamIsPastdO(@Param("deviceId") String deviceId,
			@Param("cargoDatan") String cargoDatan) throws Exception;
}
