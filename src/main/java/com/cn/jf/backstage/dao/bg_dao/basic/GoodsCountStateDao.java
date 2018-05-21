package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;



/**
 * 货道状态辅助dao接口
 * */
public interface GoodsCountStateDao {

	public <ModelType> List<ModelType> findByDevId(String deviceId) throws Exception;
	
	public <ModelType> int deleteGoodsCountState(String deviceId) throws Exception;
	
	public <ModelType> int addGoodsCountState(ModelType modelType) throws Exception;
	
	public <ModelType> ModelType findByMachAndGoodsId(String deviceId,String goodsId) throws Exception;
	
	public <ModelType> int updateGoodsCountState(ModelType modelType) throws Exception;
}
