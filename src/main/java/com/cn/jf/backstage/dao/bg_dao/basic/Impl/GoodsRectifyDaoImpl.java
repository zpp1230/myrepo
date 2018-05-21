package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.GoodsRectifyDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.GoodsRectifyMapper;



@Repository("goodsRectifyDao")
public class GoodsRectifyDaoImpl implements GoodsRectifyDao {

	
	@Resource
	private GoodsRectifyMapper goodsRectifyMapper;
	
	
	@Override
	public <ModelType> List<ModelType> findByMoch(String deviceId) throws Exception {
		
		return goodsRectifyMapper.findByMoch(deviceId);
	}

	@Override
	public <ModelType> int addGoodsRectify(ModelType modelType) throws Exception {
		
		return goodsRectifyMapper.addGoodsRectify(modelType);
	}

	@Override
	public <ModelType> int updateGoodsRectify(ModelType modelType) throws Exception {
		
		return goodsRectifyMapper.updateGoodsRectify(modelType);
	}

	@Override
	public <ModelType> ModelType findByParam(String deviceId, String cargoDatan) throws Exception {
		
		return goodsRectifyMapper.findByParam(deviceId, cargoDatan);
	}

	@Override
	public <ModelType> ModelType findByParamIsPastdOne(String deviceId, String cargoDatan) throws Exception {
		
		return goodsRectifyMapper.findByParamIsPastdOne(deviceId, cargoDatan);
	}

	@Override
	public <ModelType> ModelType findByParamIsPastdO(String deviceId, String cargoDatan) throws Exception {
		
		return goodsRectifyMapper.findByParamIsPastdO(deviceId, cargoDatan);
	}

}
