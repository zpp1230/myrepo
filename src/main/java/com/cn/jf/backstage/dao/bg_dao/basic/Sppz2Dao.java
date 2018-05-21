package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;

import com.cn.jf.backstage.dao.bg_dao.entity.Sppz2;

public interface Sppz2Dao {

	List<Sppz2> getSppz2ByMachCode(String string5, String machCode) throws Exception;

	int save1(Sppz2 sppz2) throws Exception;

	int deletesSppz2(String string6, String machCode) throws Exception;

	List<Sppz2> getSppz2ByGoodType(String machCode, String goodsType) throws Exception;

	int deleteSppz2(String machCode) throws Exception;

	List<String> getNum1(String machCode) throws Exception;

	List<String> getNum2(String machCode) throws Exception;

	List<String> getNum3(String machCode) throws Exception;

	List<String> getNumsz1(String machCode) throws Exception;

	List<String> getNumsz2(String machCode) throws Exception;

	List<String> getNumsz3(String machCode) throws Exception;

	List<Sppz2> getSppz2ByMachCodeOn(String machCode) throws Exception;

}
