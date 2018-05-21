package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WaresOrderWareidMapper {

	
	public <ModelType> ModelType findByTradeNo(@Param("out_trade_no") String out_trade_no) throws Exception;
	
	public <ModelType> List<ModelType> findByWaresId(@Param("waresId") String waresId) throws Exception;
}
