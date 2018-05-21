package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.GoodsCountStateDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.GoodsCountStateMapper;


@Repository("goodsCountStateDao")
public class GoodsCountStateDaoImpl implements GoodsCountStateDao {

	
	@Resource
	private GoodsCountStateMapper goodsCountStateMapper;
	
	
	@Override
	public <ModelType> List<ModelType> findByDevId(String deviceId) throws Exception {
		
		return goodsCountStateMapper.findByDevId(deviceId);
	}

	@Override
	public <ModelType> int deleteGoodsCountState(String deviceId) throws Exception {
		
		return goodsCountStateMapper.deleteGoodsCountState(deviceId);
	}

	@Override
	public <ModelType> int addGoodsCountState(ModelType modelType) throws Exception {
		
		return goodsCountStateMapper.addGoodsCountState(modelType);
	}

	@Override
	public <ModelType> ModelType findByMachAndGoodsId(String deviceId, String goodsId) throws Exception {
		
		return goodsCountStateMapper.findByMachAndGoodsId(deviceId, goodsId);
	}

	@Override
	public <ModelType> int updateGoodsCountState(ModelType modelType) throws Exception {
		
		return goodsCountStateMapper.updateGoodsCountState(modelType);
	}

}
