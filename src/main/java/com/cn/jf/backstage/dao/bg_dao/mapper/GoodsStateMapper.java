package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 补货清单--数据状态
 * */
public interface GoodsStateMapper {

	public <ModelType> List<ModelType> findByMoch(@Param("machCode") String machCode) throws Exception;
	
	
	public <ModelType> ModelType findByParam(@Param("machCode") String machCode,
			@Param("cargoData") String cargoData) throws Exception;
	
	public <ModelType> int addGoodsState(ModelType modelType) throws Exception;
	
	public <ModelType> int updateGoodsState(ModelType modelType) throws Exception;
	
	public <ModelType> int deleteGoodsState(ModelType modelType) throws Exception;
	
	public <ModelType> List<ModelType> findByGoodsId(@Param("goodsId") String goodsId,@Param("machCode") String machCode) throws Exception;
	
	public <ModelType> List<ModelType> findByMochAndState(@Param("machCode") String machCode) throws Exception;
	
	public <ModelType> List<ModelType> findByMochAndStateOne(@Param("machCode") String machCode) throws Exception;
	
	public <ModelType> List<ModelType> findByMochAndStateOneAndGoodsId(@Param("machCode") String machCode,@Param("goodsId") String goodsId) throws Exception;
	
	public <ModelType> List<ModelType> findByMochAndGoodsID(@Param("machCode") String machCode,@Param("goodsId") String goodsId) throws Exception;
}
