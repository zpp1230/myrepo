package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.jf.backstage.dao.bg_dao.entity.Sppz2;

public interface Sppz2Mapper {

	List<Sppz2> getSppz2ByMachCode(@Param("goodsType") String string5, @Param("machCode") String machCode)
			throws Exception;

	int save1(Sppz2 sppz2) throws Exception;

	int deletesSppz2(@Param("goodsType") String string6, @Param("machCode") String machCode) throws Exception;

	List<Sppz2> getSppz2ByGoodType(@Param("machCode") String machCode, @Param("goodsType") String goodsType);

	int deleteSppz2(@Param("machCode") String machCode) throws Exception;

	List<String> getNum1(@Param("machCode") String machCode) throws Exception;

	List<String> getNum2(@Param("machCode") String machCode) throws Exception;

	List<String> getNum3(@Param("machCode") String machCode) throws Exception;

	List<String> getNumsz1(@Param("machCode") String machCode) throws Exception;

	List<String> getNumsz2(@Param("machCode") String machCode) throws Exception;

	List<String> getNumsz3(@Param("machCode") String machCode) throws Exception;

	List<Sppz2> getSppz2ByMachCodeOn(@Param("machCode") String machCode) throws Exception;

}
