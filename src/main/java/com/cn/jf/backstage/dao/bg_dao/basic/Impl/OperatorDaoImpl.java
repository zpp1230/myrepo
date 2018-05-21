package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.OperatorDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.OperatorMapper;

@Repository("operatorDao")
public class OperatorDaoImpl implements OperatorDao {

	@Resource
	private OperatorMapper operatorMapper;
	
	@Override
	public <ModelType> List<String> findoperatorID() throws Exception {
		
		return operatorMapper.findoperatorID();
	}

}
