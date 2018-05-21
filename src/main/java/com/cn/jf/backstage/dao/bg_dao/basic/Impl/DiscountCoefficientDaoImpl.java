package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.DiscountCoefficientDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.DiscountCoefficientMapper;


@Repository("discountCoefficientDao")
public class DiscountCoefficientDaoImpl implements DiscountCoefficientDao {

	
	@Resource
	private DiscountCoefficientMapper discountCoefficientMapper;
	
	
	@Override
	public <ModelType> List<ModelType> findByPage(String operatorID) throws Exception {
		
		return discountCoefficientMapper.findByPage(operatorID);
	}

	@Override
	public <ModelType> Long findByCount(String operatorID) throws Exception {
		
		return discountCoefficientMapper.findByCount(operatorID);
	}

	@Override
	public <ModelType> ModelType findById(String discountTieId) throws Exception {
		
		return discountCoefficientMapper.findById(discountTieId);
	}

	@Override
	public <ModelType> int addDiscountCoefficient(ModelType modelType) throws Exception {
		
		return discountCoefficientMapper.addDiscountCoefficient(modelType);
	}

	@Override
	public <ModelType> int updateDiscountCoefficient(ModelType modelType) throws Exception {
		
		return discountCoefficientMapper.updateDiscountCoefficient(modelType);
	}

	@Override
	public <ModelType> int deleteDiscountCoefficient(String discountTieId) throws Exception {
		
		return discountCoefficientMapper.deleteDiscountCoefficient(discountTieId);
	}

	@Override
	public <ModelType> List<ModelType> findByAll(String operatorID) throws Exception {
		
		return discountCoefficientMapper.findByAll(operatorID);
	}

}
