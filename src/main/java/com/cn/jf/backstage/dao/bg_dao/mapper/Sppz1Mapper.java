package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.jf.backstage.dao.bg_dao.entity.Sppz1;

public interface Sppz1Mapper {

	public int deleteSppz1(@Param("machCode") String machCode) throws Exception;

	public List<Sppz1> getSppz1ByMachCode(@Param("machCode") String machCode) throws Exception;

	public int save(Sppz1 sppz1) throws Exception;

	public int deletesSppz1(@Param("type")String string6, @Param("machCode")String machCode) throws Exception;

}
