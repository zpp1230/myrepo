package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.Sppz2Dao;
import com.cn.jf.backstage.dao.bg_dao.entity.Sppz2;
import com.cn.jf.backstage.dao.bg_dao.mapper.Sppz2Mapper;

@Repository("Sppz2Dao")
public class Sppz2DaoImpl implements Sppz2Dao {
	@Resource
	private Sppz2Mapper sppz2Mapper;

	public List<Sppz2> getSppz2ByMachCode(String string5, String machCode) throws Exception {

		return sppz2Mapper.getSppz2ByMachCode(string5, machCode);
	}

	public int save1(Sppz2 sppz2) throws Exception {

		return sppz2Mapper.save1(sppz2);
	}

	public int deletesSppz2(String string6, String machCode) throws Exception {

		return sppz2Mapper.deletesSppz2(string6, machCode);
	}

	public List<Sppz2> getSppz2ByGoodType(String machCode, String goodsType) throws Exception {

		return sppz2Mapper.getSppz2ByGoodType(machCode, goodsType);
	}

	public int deleteSppz2(String machCode) throws Exception {

		return sppz2Mapper.deleteSppz2(machCode);
	}

	public List<String> getNum1(String machCode) throws Exception {

		return sppz2Mapper.getNum1(machCode);
	}

	public List<String> getNum2(String machCode) throws Exception {

		return sppz2Mapper.getNum2(machCode);
	}

	public List<String> getNum3(String machCode) throws Exception {

		return sppz2Mapper.getNum3(machCode);
	}

	public List<String> getNumsz1(String machCode) throws Exception {

		return sppz2Mapper.getNumsz1(machCode);
	}

	public List<String> getNumsz2(String machCode) throws Exception {

		return sppz2Mapper.getNumsz2(machCode);
	}

	public List<String> getNumsz3(String machCode) throws Exception {

		return sppz2Mapper.getNumsz3(machCode);
	}

	public List<Sppz2> getSppz2ByMachCodeOn(String machCode) throws Exception {

		return sppz2Mapper.getSppz2ByMachCodeOn(machCode);
	}

}
