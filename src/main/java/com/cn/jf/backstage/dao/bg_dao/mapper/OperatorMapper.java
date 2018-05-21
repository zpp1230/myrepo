package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

/**
 * 运营商信息ID
 * */
public interface OperatorMapper {

	public <ModelType> List<String> findoperatorID() throws Exception;
}
