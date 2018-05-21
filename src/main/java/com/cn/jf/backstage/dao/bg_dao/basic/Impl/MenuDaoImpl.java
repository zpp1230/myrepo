package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import com.cn.jf.backstage.dao.bg_dao.basic.MenuDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.MenuMapper;

@Repository("menuDao")
public class MenuDaoImpl implements MenuDao{

	@Resource
    private  MenuMapper  menuMapper;

	public <ModelType> List<ModelType> findById(Map<String, Object> params) throws Exception {
		return menuMapper.selectParams(params);
	}

	public <ModelType> List<ModelType> findByAllId() throws Exception {
		return menuMapper.selectAllParams();
	}
	
}
