package com.cn.jf.backstage.dao.bg_dao.basic;


import java.util.List;
import java.util.Map;

/**
 * 商品主档dao接口
 * */
public interface GoodsmBasic {

	public <ModelType> List<ModelType> findIdAndName() throws Exception;
	
	public <ModelType> List<ModelType> findBywaresId(String waresId,String waresName) throws Exception;
	
	public <ModelType> List<ModelType> findByPage(String waresId,String waresName) throws Exception;
	
	public <ModelType> Long findByCount(String waresId,String waresName) throws Exception;
	
	public <ModelType> ModelType findById(String waresId) throws Exception;
	
	public <ModelType> List<ModelType> findByLessParam() throws Exception;
	
	public <ModelType> ModelType findByGoodsId(String waresId) throws Exception;
	
	public <ModelType> ModelType findByBarCodeNo(Map<String,Object> params) throws Exception;
}
