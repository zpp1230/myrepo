package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/***
 * 折扣管理
 * */
public interface DiscountCoefficientMapper {

	public <ModelType> List<ModelType> findByPage(@Param("operatorID") String operatorID) throws Exception;
	
	public <ModelType> Long findByCount(@Param("operatorID") String operatorID) throws Exception;
	
	public <ModelType> ModelType findById(@Param("discountTieId") String discountTieId) throws Exception;
	
	public <ModelType> int addDiscountCoefficient(ModelType modelType) throws Exception;
	
	public <ModelType> int updateDiscountCoefficient(ModelType modelType) throws Exception;
	
	public <ModelType> int deleteDiscountCoefficient(@Param("discountTieId") String discountTieId) throws Exception;
	
	public <ModelType> List<ModelType> findByAll(@Param("operatorID") String operatorID) throws Exception;
}
