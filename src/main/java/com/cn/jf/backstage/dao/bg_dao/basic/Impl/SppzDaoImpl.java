package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.SppzDao;
import com.cn.jf.backstage.dao.bg_dao.entity.Sppz;

import com.cn.jf.backstage.dao.bg_dao.mapper.SppzMapper;

@Repository("sppzDao")
public class SppzDaoImpl implements SppzDao{
	@Resource
	private SppzMapper sppzMapper;


	public Sppz getSppzByMach(String mach) {
		
		return sppzMapper.getSppzByMach(mach);
	}


	public int addSppz(Sppz sppz) {
		
		return sppzMapper.addSppz(sppz);
	}


	public int updateSppz(Sppz sppz)  {
		
		return sppzMapper.updateSppz(sppz);
	}


	public List<Sppz> find(String s_machCode, String s_tier, String s_columns, int start, int size) {
		
		return sppzMapper.find(s_machCode,s_tier,s_columns,start,size);
	}


	public Long getTotal(String s_machCode, String s_tier, String s_columns) {
	
		return sppzMapper.getTotal(s_machCode,s_tier,s_columns);
	}


	public int deleteSppz(String mach) {
		
		return sppzMapper.deleteSppz(mach);
	}

}
