package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.AllotsDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.AllotsMapper;
@Repository("AllotsDao")
public class AllotsDaoImpl implements AllotsDao{
	@Resource
	private AllotsMapper allotsMapper;

	public List<Integer> getRoleIds(String emplCode) throws Exception {
	
		return allotsMapper.getRoleIds(emplCode);
	}

}
