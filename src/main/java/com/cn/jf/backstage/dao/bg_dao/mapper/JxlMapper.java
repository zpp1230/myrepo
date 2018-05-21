package com.cn.jf.backstage.dao.bg_dao.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.jf.backstage.dao.bg_dao.entity.Jxl;


public interface JxlMapper {

	public int addJxl(Jxl jxl) throws Exception;

	public List<Jxl> find(@Param("jxlName") String s_jxlName, @Param("start") int start, @Param("size") int size) throws Exception;

	public Long getTotal(@Param("jxlName") String s_jxlName) throws Exception;

	public Jxl getJxlByJxlId(@Param("jxlId") String jxlId) throws Exception;

	public int updateJxl(Jxl jxl) throws Exception;

	public int deleteJxl(@Param("jxlId") String jxlId) throws Exception;

	/*public List<String> getJxls() throws Exception;

	public String getJxlCode(@Param("jxlName") String jxlName) throws Exception;*/

}
