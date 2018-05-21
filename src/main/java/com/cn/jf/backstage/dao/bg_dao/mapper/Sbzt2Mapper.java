package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.jf.backstage.dao.bg_dao.entity.Sbzt2;

public interface Sbzt2Mapper {

	public int saveSbzt2(Sbzt2 sbzt2) throws Exception;

	public List<Sbzt2> getSbzt2ByMachCode(@Param("machCode") String machCode) throws Exception;

	public int deleteSbzt2ByMachCode(@Param("machCode") String machCode) throws Exception;
	

}
