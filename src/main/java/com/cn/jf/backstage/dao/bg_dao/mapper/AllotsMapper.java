package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AllotsMapper {

	List<Integer> getRoleIds( @Param("emplCode") String emplCode) throws Exception;

}
