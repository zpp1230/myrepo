package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.Hdpz1Dao;
import com.cn.jf.backstage.dao.bg_dao.entity.Hdpz1;
import com.cn.jf.backstage.dao.bg_dao.mapper.Hdpz1Mapper;

@Repository("Hdpz1Dao")
public class Hdpz1DaoImpl implements Hdpz1Dao{
	@Resource
	private Hdpz1Mapper hdpz1Mapper;

	public <ModelType> int save(Hdpz1 hdpz1) throws Exception {
		
		return hdpz1Mapper.save(hdpz1);
	}

	public int deleteHdpz1(String id) throws Exception {
		
		return hdpz1Mapper.deleteHdpz1(id);
	}


	public List<Hdpz1> getHdpz1ByMachCode(String machCode) throws Exception {
		
		return hdpz1Mapper.getHdpz1ByMachCode(machCode);
	}


	public int updateHdpz1(Hdpz1 hdpz1) throws Exception {
		
		return hdpz1Mapper.updateHdpz1(hdpz1);
	}


	public int getSize1(String machCode) throws Exception {
		
		return hdpz1Mapper.getSize1(machCode);
	}


	public int getSize2(String machCode) throws Exception {
		return hdpz1Mapper.getSize2(machCode);
	}


	public int getSize3(String machCode) throws Exception {
		
		return hdpz1Mapper.getSize3(machCode);
	}


	public List<String> getTier1(String machCode) throws Exception {
		
		return hdpz1Mapper.getTier1(machCode);
	}


	public List<String> getTier2(String machCode) throws Exception {
	
		return hdpz1Mapper.getTier2(machCode);
	}


	public List<String> getTier3(String machCode) throws Exception {
		
		return hdpz1Mapper.getTier3(machCode);
	}
	
    public List<String> getTier1sz(String machCode) throws Exception {
		
		return hdpz1Mapper.getTier1sz(machCode);
	}


	public List<String> getTier2sz(String machCode) throws Exception {
	
		return hdpz1Mapper.getTier2sz(machCode);
	}


	public List<String> getTier3sz(String machCode) throws Exception {
		
		return hdpz1Mapper.getTier3sz(machCode);
	}


	public int getSizesz1(String machCode) throws Exception {
		
		return hdpz1Mapper.getSizesz1(machCode);
	}

	
	public int getSizesz2(String machCode) throws Exception {
		
		return hdpz1Mapper.getSizesz2(machCode);
	}

	
	public int getSizesz3(String machCode) throws Exception {
		
		return hdpz1Mapper.getSizesz3(machCode);
	}

}
