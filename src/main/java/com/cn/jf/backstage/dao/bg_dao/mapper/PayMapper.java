package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.jf.backstage.dao.bg_dao.entity.Pay;

public interface PayMapper {

	int save(Pay pay) throws Exception;

	List<Pay> find(@Param("user") String s_user, @Param("start") int start, @Param("size") int size, @Param("operatorID") String operatorID) throws Exception;

	Long getTotal(@Param("user") String s_user, @Param("operatorID") String operatorID) throws Exception;

	int detetePay(@Param("id") Integer id) throws Exception;

	Pay getPayById(@Param("id") Integer id) throws Exception;

	int updateById(Pay pay) throws Exception;

	int updateById1(Pay pay) throws Exception;


}
