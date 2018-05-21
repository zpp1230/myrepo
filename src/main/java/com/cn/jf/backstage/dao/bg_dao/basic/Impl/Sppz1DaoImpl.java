package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import com.cn.jf.backstage.dao.bg_dao.basic.Sppz1Dao;
import com.cn.jf.backstage.dao.bg_dao.entity.Sppz1;
import com.cn.jf.backstage.dao.bg_dao.mapper.Sppz1Mapper;

@Repository("Sppz1Dao")
public class Sppz1DaoImpl implements Sppz1Dao{

	@Resource
	private Sppz1Mapper sppz1Mapper;
	
	public int deleteSppz1(String machCode) throws Exception {

		return sppz1Mapper.deleteSppz1(machCode);
	}

	public List<Sppz1> getSppz1ByMachCode(String machCode) throws Exception {
		
		return sppz1Mapper.getSppz1ByMachCode(machCode);
	}


	public int save(Sppz1 sppz1) throws Exception {
	
		return sppz1Mapper.save(sppz1);
	}


	public int deletesSppz1(String string6, String machCode) throws Exception {
		
		return sppz1Mapper.deletesSppz1(string6,machCode);
	}

}
