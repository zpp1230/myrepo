package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;


/**
 * 商品主档接口
 * */
public interface GoodsmMapper {

	public <ModelType> List<ModelType> findIdAndName() throws Exception;
	
	public <ModelType> List<ModelType> findBywaresId(@Param("waresId") String waresId,
			@Param("waresName") String waresName) throws Exception;
	
	
	public <ModelType> List<ModelType> findByPage(@Param("waresId") String waresId,
			@Param("waresName") String waresName) throws Exception;
	
	public <ModelType> Long findByCount(@Param("waresId") String waresId,
			@Param("waresName") String waresName) throws Exception;
	
	public <ModelType> ModelType findById(@Param("waresId") String waresId) throws Exception;
	
	
	public <ModelType> List<ModelType> findByLessParam() throws Exception;
	
	public <ModelType> ModelType findByGoodsId(@Param("waresId") String waresId) throws Exception;
	
	public <ModelType> ModelType findByBarCodeNo(@Param("params")Map<String,Object> params) throws Exception;
}
