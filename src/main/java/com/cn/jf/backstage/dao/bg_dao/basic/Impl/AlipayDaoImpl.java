package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.AlipayDao;
import com.cn.jf.backstage.dao.bg_dao.entity.Pay;

import com.cn.jf.backstage.dao.bg_dao.mapper.GoodsMasterMapper;

@Repository("alipayDao")
public class AlipayDaoImpl implements AlipayDao {

	@Resource
    private  GoodsMasterMapper  goodsMasterMapper;
	
	@Override
	public Pay getPayObj(Map<String,Object> params) throws Exception {
		
		return goodsMasterMapper.getPayObj(params);
	}

}
