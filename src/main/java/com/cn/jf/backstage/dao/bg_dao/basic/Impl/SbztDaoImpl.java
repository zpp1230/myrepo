package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.SbztDao;
import com.cn.jf.backstage.dao.bg_dao.entity.Sbzt;
import com.cn.jf.backstage.dao.bg_dao.mapper.SbztMapper;
@Repository("SbztDao")
public class SbztDaoImpl implements SbztDao{
	@Resource
	private SbztMapper sbztMapper;

	public Sbzt getSbztByMachCode(String machCode,String history) throws Exception {
		
		return sbztMapper.getSbztByMachCode(machCode,history);
	}


	public int saveSbzt(Sbzt sbzt) throws Exception {
	
		return sbztMapper.saveSbzt(sbzt);
	}



	public int deleteSbztByMachCode(Timestamp addTime) throws Exception {

		return sbztMapper.deleteSbztByMachCode(addTime);
	}



	public void changeHistory(String machCode) throws Exception {
		sbztMapper.changeHistory(machCode);
		
	}


	
	public List<Sbzt> getSbztByMachCode1(String machCode) throws Exception {
		
		return sbztMapper.getSbztByMachCode1(machCode);
	}



	public Sbzt getSbztByMachCode2(String machCode) throws Exception {
	
		return sbztMapper.getSbztByMachCode2(machCode);
	}



	public List<Sbzt> getSbztByMachCodeAndTime(String machCode, Date date1, Date date2) throws Exception {
		
		return sbztMapper.getSbztByMachCodeAndTime(machCode,date1,date2);
	}


	
	public Sbzt findSbzt(String s) throws Exception {
		
		return sbztMapper.findSbzt(s);
	}

}
