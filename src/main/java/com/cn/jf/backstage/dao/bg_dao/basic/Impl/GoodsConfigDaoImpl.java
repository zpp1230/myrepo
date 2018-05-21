package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.GoodsConfigDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.GoodsConfigMapper;

@Repository("goodsConfigDao")
public class GoodsConfigDaoImpl implements GoodsConfigDao {

	@Resource
	private GoodsConfigMapper goodsConfigMapper;
	
	
	@Override
	public <ModelType> List<ModelType> fingByMoch(String machCode) throws Exception {
		
		return goodsConfigMapper.fingByMoch(machCode);
	}


	@Override
	public <ModelType> List<ModelType> findByGoodsId(String goodsId) throws Exception {
		
		return goodsConfigMapper.findByGoodsId(goodsId);
	}


	@Override
	public <ModelType> List<ModelType> findByMochAndCargo(String machCode, String goodsType) throws Exception {
		
		return goodsConfigMapper.findByMochAndCargo(machCode, goodsType);
	}

}
