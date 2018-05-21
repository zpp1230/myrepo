package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.Sbzt1Dao;
import com.cn.jf.backstage.dao.bg_dao.entity.Sbzt1;
import com.cn.jf.backstage.dao.bg_dao.mapper.Sbzt1Mapper;

@Repository("Sbzt1Dao")
public class Sbzt1DaoImpl implements Sbzt1Dao {
	@Resource
	private Sbzt1Mapper sbzt1Mapper;

	public int saveSbzt1(Sbzt1 sbzt1) throws Exception {
		
		return sbzt1Mapper.saveSbzt1(sbzt1);
	}


	public int deleteSbzt1ByMachCode(String machCode) throws Exception {
		
		return sbzt1Mapper.deleteSbzt1ByMachCode(machCode);
	}

}
