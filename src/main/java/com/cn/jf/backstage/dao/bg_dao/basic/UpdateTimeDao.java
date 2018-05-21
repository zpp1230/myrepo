package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;



public interface UpdateTimeDao {

	public <ModelType> List<ModelType> findByDev(String deviceId) throws Exception;
	
	public <ModelType> int deleteDevUpdateTime(String deviceId) throws Exception;
	
	public <ModelType> int addDevUpdateTime(ModelType modelType) throws Exception;
	
	public <ModelType> ModelType findByGoodsId(String goodsId,String deviceId) throws Exception;
}
