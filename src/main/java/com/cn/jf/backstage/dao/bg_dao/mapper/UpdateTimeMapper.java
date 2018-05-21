package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UpdateTimeMapper {

	public <ModelType> List<ModelType> findByDev(@Param("deviceId") String deviceId) throws Exception;
	
	public <ModelType> int deleteDevUpdateTime(@Param("deviceId") String deviceId) throws Exception;
	
	public <ModelType> int addDevUpdateTime(ModelType modelType) throws Exception;
	
	
	public <ModelType> ModelType findByGoodsId(@Param("goodsId") String goodsId
			,@Param("deviceId") String deviceId) throws Exception;
}
