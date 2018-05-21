package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;


public interface WaresOrderWareidDao {

	public <ModelType> ModelType findByTradeNo(String out_trade_no) throws Exception;
	
	public <ModelType> List<ModelType> findByWaresId(String waresId) throws Exception;
}
