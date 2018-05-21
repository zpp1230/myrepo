package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;

public interface AllotsDao {

	List<Integer> getRoleIds(String emplCode) throws Exception;

}
