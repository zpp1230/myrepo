package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.WaresOrderWareidDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.WaresOrderWareidMapper;


@Repository("waresOrderWareidDao")
public class WaresOrderWareidDaoImpl implements WaresOrderWareidDao {

	
	@Resource
	private WaresOrderWareidMapper waresOrderWareidMapper;
	
	
	@Override
	public <ModelType> ModelType findByTradeNo(String out_trade_no) throws Exception {
		
		return waresOrderWareidMapper.findByTradeNo(out_trade_no);
	}


	@Override
	public <ModelType> List<ModelType> findByWaresId(String waresId) throws Exception {
		
		return waresOrderWareidMapper.findByWaresId(waresId);
	}

}
