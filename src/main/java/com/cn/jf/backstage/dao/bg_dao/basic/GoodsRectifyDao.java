package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;




/**
 * 补货清单--清出dao层
 * */
public interface GoodsRectifyDao {

	public <ModelType> List<ModelType> findByMoch(String deviceId) throws Exception;
	
	public <ModelType> int addGoodsRectify(ModelType modelType) throws Exception;
	
	
	public <ModelType> int updateGoodsRectify(ModelType modelType) throws Exception;
	
	public <ModelType> ModelType findByParam(String deviceId,String cargoDatan) throws Exception;
	
	public <ModelType> ModelType findByParamIsPastdOne(String deviceId,String cargoDatan) throws Exception;
	
	
	public <ModelType> ModelType findByParamIsPastdO(String deviceId,String cargoDatan) throws Exception;
}
