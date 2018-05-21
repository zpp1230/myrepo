package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.GoodsmBasic;
import com.cn.jf.backstage.dao.bg_dao.entity.GoodsMaster;
import com.cn.jf.backstage.dao.bg_dao.mapper.GoodsmMapper;


/**
 * 商品主档dao实现类
 * */
@Repository("goodsmBasic")
public class GoodsmBasicImpl implements GoodsmBasic {

	@Resource
	private GoodsmMapper goodsmMapper;

	@Override
	public <ModelType> List<ModelType> findIdAndName() throws Exception {
		
		return goodsmMapper.findIdAndName();
	}

	@Override
	public <ModelType> List<ModelType> findBywaresId(String waresId, String waresName) throws Exception {
		
		return goodsmMapper.findBywaresId(waresId, waresName);
	}

	@Override
	public <ModelType> List<ModelType> findByPage(String waresId, String waresName) throws Exception {
		
		return goodsmMapper.findByPage(waresId, waresName);
	}

	@Override
	public <ModelType> Long findByCount(String waresId, String waresName) throws Exception {
		
		return goodsmMapper.findByCount(waresId, waresName);
	}

	@Override
	public <ModelType> ModelType findById(String waresId) throws Exception {
		
		return goodsmMapper.findById(waresId);
	}

	@Override
	public <ModelType> List<ModelType> findByLessParam() throws Exception {
		
		return goodsmMapper.findByLessParam();
	}

	@Override
	public <ModelType> ModelType findByGoodsId(String waresId) throws Exception {
		
		return goodsmMapper.findByGoodsId(waresId);
	}

	@Override
	public <ModelType> ModelType findByBarCodeNo(Map<String, Object> params) throws Exception {
		
		return goodsmMapper.findByBarCodeNo(params);
	}
	
	
}
