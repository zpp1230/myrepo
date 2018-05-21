package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 商品配置接口
 * */
public interface GoodsConfigMapper {

	public <ModelType> List<ModelType> fingByMoch(@Param("machCode") String machCode) throws Exception;
	
	public <ModelType> List<ModelType> findByGoodsId(@Param("goodsId") String goodsId) throws Exception;
	
	public <ModelType> List<ModelType> findByMochAndCargo(@Param("machCode") String machCode,
			@Param("goodsType") String goodsType) throws Exception;
}
