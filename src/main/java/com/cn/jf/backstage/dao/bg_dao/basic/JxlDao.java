package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;

import com.cn.jf.backstage.dao.bg_dao.entity.Jxl;

public interface JxlDao {
		
	public int addJxl(Jxl jxl) throws Exception;

	public List<Jxl> find(String s_jxlName, int start, int size) throws Exception;

	public Long getTotal(String s_jxlName) throws Exception;

	public Jxl getJxlByJxlId(String jxlId) throws Exception;

	public int updateJxl(Jxl jxl) throws Exception;

	public int deleteJxl(String jxlId) throws Exception;

	/*public List<String> getJxls() throws Exception;

	public String getJxlCode(String jxlName) throws Exception;*/

	
}
