package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;


/**
 * 折扣管理dao接口
 * */
public interface DiscountCoefficientDao {

	public <ModelType> List<ModelType> findByPage(String operatorID) throws Exception;
	
	public <ModelType> Long findByCount(String operatorID) throws Exception;
	
	public <ModelType> ModelType findById(String discountTieId) throws Exception;
	
	public <ModelType> int addDiscountCoefficient(ModelType modelType) throws Exception;
	
	public <ModelType> int updateDiscountCoefficient(ModelType modelType) throws Exception;
	
	public <ModelType> int deleteDiscountCoefficient(String discountTieId) throws Exception;
	
	public <ModelType> List<ModelType> findByAll(String operatorID) throws Exception;
}
