package com.cn.jf.backstage.dao.bg_dao.mapper;

import org.apache.ibatis.annotations.Param;

import com.cn.jf.backstage.dao.bg_dao.entity.Sbzt1;

public interface Sbzt1Mapper {

	public int saveSbzt1(Sbzt1 sbzt1) throws Exception;

	public int deleteSbzt1ByMachCode(@Param("machCode") String machCode) throws Exception;

}
