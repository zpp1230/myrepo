package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;




public interface GoodsConfigDao {

	public <ModelType> List<ModelType> fingByMoch(String machCode) throws Exception;
	
	public <ModelType> List<ModelType> findByGoodsId(String goodsId) throws Exception;
	
	public <ModelType> List<ModelType> findByMochAndCargo(String machCode,String goodsType) throws Exception;
}
