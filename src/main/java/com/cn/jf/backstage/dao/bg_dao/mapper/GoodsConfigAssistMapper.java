package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 商品配置辅助接口
 * */
public interface GoodsConfigAssistMapper {

	public <ModelType> List<ModelType> findByMachCode(@Param("machCode") String machCode) throws Exception;
	
	public <ModelType> ModelType findByGoodsId(@Param("goodsId") String goodsId) throws Exception;
}
