package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.Sbzt2Dao;
import com.cn.jf.backstage.dao.bg_dao.entity.Sbzt2;
import com.cn.jf.backstage.dao.bg_dao.mapper.Sbzt2Mapper;
@Repository("Sbzt2Dao")
public class Sbzt2DaoImpl implements Sbzt2Dao {
	@Resource
	private Sbzt2Mapper sbzt2Mapper;

	public int saveSbzt2(Sbzt2 sbzt2) throws Exception {
		
		return sbzt2Mapper.saveSbzt2(sbzt2);
	}

	
	public List<Sbzt2> getSbzt2ByMachCode(String machCode) throws Exception {
		
		return sbzt2Mapper.getSbzt2ByMachCode(machCode);
	}



	public int deleteSbzt2ByMachCode(String machCode) throws Exception {
		
		return sbzt2Mapper.deleteSbzt2ByMachCode(machCode);
	}

}
