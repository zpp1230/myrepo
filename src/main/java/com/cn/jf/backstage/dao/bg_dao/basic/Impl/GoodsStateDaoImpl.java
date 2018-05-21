package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.GoodsStateDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.GoodsStateMapper;


@Repository("goodsStateDao")
public class GoodsStateDaoImpl implements GoodsStateDao {

	
	@Resource
	private GoodsStateMapper goodsStateMapper;
	
	@Override
	public <ModelType> List<ModelType> findByMoch(String machCode) throws Exception {
		
		return goodsStateMapper.findByMoch(machCode);
	}

	@Override
	public <ModelType> int addGoodsState(ModelType modelType) throws Exception {
		
		return goodsStateMapper.addGoodsState(modelType);
	}

	@Override
	public <ModelType> int updateGoodsState(ModelType modelType) throws Exception {
		
		return goodsStateMapper.updateGoodsState(modelType);
	}

	@Override
	public <ModelType> ModelType findByParam(String machCode, String cargoData) throws Exception {
		
		return goodsStateMapper.findByParam(machCode, cargoData);
	}

	@Override
	public <ModelType> int deleteGoodsState(ModelType modelType) throws Exception {
		
		return goodsStateMapper.deleteGoodsState(modelType);
	}

	@Override
	public <ModelType> List<ModelType> findByGoodsId(String goodsId,String machCode) throws Exception {
		
		return goodsStateMapper.findByGoodsId(goodsId,machCode);
	}

	@Override
	public <ModelType> List<ModelType> findByMochAndState(String machCode) throws Exception {
		
		return goodsStateMapper.findByMochAndState(machCode);
	}

	@Override
	public <ModelType> List<ModelType> findByMochAndStateOne(String machCode) throws Exception {
		
		return goodsStateMapper.findByMochAndStateOne(machCode);
	}

	@Override
	public <ModelType> List<ModelType> findByMochAndStateOneAndGoodsId(String machCode, String goodsId)
			throws Exception {
		
		return goodsStateMapper.findByMochAndStateOneAndGoodsId(machCode, goodsId);
	}

	@Override
	public <ModelType> List<ModelType> findByMochAndGoodsID(String machCode, String goodsId) throws Exception {
		
		return goodsStateMapper.findByMochAndGoodsID(machCode, goodsId);
	}

}
