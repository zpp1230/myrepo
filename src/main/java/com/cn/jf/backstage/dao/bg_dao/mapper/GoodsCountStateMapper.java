package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 货道状态辅助接口
 * */
public interface GoodsCountStateMapper {

	public <ModelType> List<ModelType> findByDevId(@Param("deviceId") String deviceId) throws Exception;
	
	public <ModelType> int deleteGoodsCountState(@Param("deviceId") String deviceId) throws Exception;
	
	public <ModelType> int addGoodsCountState(ModelType modelType) throws Exception;
	
	public <ModelType> ModelType findByMachAndGoodsId(@Param("deviceId") String deviceId,
			@Param("goodsId") String goodsId) throws Exception;
	
	public <ModelType> int updateGoodsCountState(ModelType modelType) throws Exception;
}
