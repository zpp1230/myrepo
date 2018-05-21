package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;




/**
 * 补货管理--商品状态
 * */
public interface GoodsStateDao {

	public <ModelType> List<ModelType> findByMoch(String machCode) throws Exception;
	
	public <ModelType> int addGoodsState(ModelType modelType) throws Exception;
	
	public <ModelType> int updateGoodsState(ModelType modelType) throws Exception;
	
	public <ModelType> ModelType findByParam(String machCode,String cargoData) throws Exception;
	
	public <ModelType> int deleteGoodsState(ModelType modelType) throws Exception;
	
	public <ModelType> List<ModelType> findByGoodsId(String goodsId,String machCode) throws Exception;
	
	public <ModelType> List<ModelType> findByMochAndState(String machCode) throws Exception;
	
	public <ModelType> List<ModelType> findByMochAndStateOne(String machCode) throws Exception;
	
	public <ModelType> List<ModelType> findByMochAndStateOneAndGoodsId(String machCode,String goodsId) throws Exception;
	
	public <ModelType> List<ModelType> findByMochAndGoodsID(String machCode,String goodsId) throws Exception;
}
