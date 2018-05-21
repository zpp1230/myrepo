package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.GoodsConfigAssistDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.GoodsConfigAssistMapper;


@Repository("goodsConfigAssistDao")
public class GoodsConfigAssistDaoImpl implements GoodsConfigAssistDao {

	
	@Resource
	private GoodsConfigAssistMapper goodsConfigAssistMapper;
	
	
	@Override
	public <ModelType> List<ModelType> findByMachCode(String machCode) throws Exception {
		
		return goodsConfigAssistMapper.findByMachCode(machCode);
	}

	@Override
	public <ModelType> ModelType findByGoodsId(String goodsId) throws Exception {
		
		return goodsConfigAssistMapper.findByGoodsId(goodsId);
	}

}
