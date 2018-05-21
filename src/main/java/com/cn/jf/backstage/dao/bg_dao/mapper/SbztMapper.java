package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.jf.backstage.dao.bg_dao.entity.Sbzt;

public interface SbztMapper {

	public Sbzt getSbztByMachCode(@Param("machCode") String machCode,@Param("history") String history) throws Exception;

	public int saveSbzt(Sbzt sbzt) throws Exception;

	public int deleteSbztByMachCode(@Param("addTime")Timestamp addTime) throws Exception;

	public void changeHistory(@Param("machCode") String machCode) throws Exception;

	public List<Sbzt> getSbztByMachCode1(@Param("machCode") String machCode) throws Exception;

	public Sbzt getSbztByMachCode2(@Param("machCode") String machCode) throws Exception;

	public List<Sbzt> getSbztByMachCodeAndTime(String machCode,Date date1,Date date2) throws Exception;

	public Sbzt findSbzt(@Param("machCode") String s) throws Exception;

}
