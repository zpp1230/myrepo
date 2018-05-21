package com.cn.jf.backstage.dao.bg_dao.basic.Impl;


import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.JxlDao;

import com.cn.jf.backstage.dao.bg_dao.entity.Jxl;

import com.cn.jf.backstage.dao.bg_dao.mapper.JxlMapper;
import com.cn.jf.backstage.dao.bg_dao.mapper.YyzdMapper;
@Repository("JxlDao")
public class JxlDaoImpl implements JxlDao{
	@Resource
	private YyzdMapper yyzdMapper;
	@Resource
	private JxlMapper jxlMapper;
	

	public int addJxl(Jxl jxl) throws Exception {
		
		return jxlMapper.addJxl(jxl);
	}


	
	public List<Jxl> find(String s_jxlName, int start, int size) throws Exception {
		
		return jxlMapper.find(s_jxlName,start,size);
	}


	
	public Long getTotal(String s_jxlName) throws Exception {
		
		return jxlMapper.getTotal(s_jxlName);
	}



	public Jxl getJxlByJxlId(String jxlId) throws Exception {
		
		return jxlMapper.getJxlByJxlId(jxlId);
	}



	public int updateJxl(Jxl jxl) throws Exception {
		
		return jxlMapper.updateJxl(jxl);
	}



	public int deleteJxl(String jxlId) throws Exception {
		
		return jxlMapper.deleteJxl(jxlId);
	}


/*
	public List<String> getJxls() throws Exception {
		
		return jxlMapper.getJxls();
	}




	public String getJxlCode(String jxlName) throws Exception {
		
		return jxlMapper.getJxlCode(jxlName);
	}*/




}
