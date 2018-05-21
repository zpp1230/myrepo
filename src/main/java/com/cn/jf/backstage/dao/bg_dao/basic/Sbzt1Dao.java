package com.cn.jf.backstage.dao.bg_dao.basic;

import com.cn.jf.backstage.dao.bg_dao.entity.Sbzt1;

public interface Sbzt1Dao {

	public int saveSbzt1(Sbzt1 sbzt1) throws Exception;

	public int deleteSbzt1ByMachCode(String machCode) throws Exception;

}
