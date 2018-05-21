package com.cn.jf.backstage.dao.bg_dao.basic;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.cn.jf.backstage.dao.bg_dao.entity.Sbzt;

public interface SbztDao {

	public Sbzt getSbztByMachCode(String machCode,String history) throws Exception;

	public int saveSbzt(Sbzt sbzt) throws Exception;

	public int deleteSbztByMachCode(Timestamp addTime) throws Exception;

	public void changeHistory(String machCode) throws Exception;

	public List<Sbzt> getSbztByMachCode1(String machCode) throws Exception;

	public Sbzt getSbztByMachCode2(String machCode) throws Exception;

	public List<Sbzt> getSbztByMachCodeAndTime(String machCode, Date date1, Date date2) throws Exception;

	public Sbzt findSbzt(String s) throws Exception;
	

}
