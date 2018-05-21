package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;

/**
 * 运营方dao
 * */
public interface OperatorDao {

	public <ModelType> List<String> findoperatorID() throws Exception;
}
