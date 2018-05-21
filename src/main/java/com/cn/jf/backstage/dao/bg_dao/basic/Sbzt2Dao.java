package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;

import com.cn.jf.backstage.dao.bg_dao.entity.Sbzt2;

public interface Sbzt2Dao {

	public int saveSbzt2(Sbzt2 sbzt2) throws Exception;

	public List<Sbzt2> getSbzt2ByMachCode(String machCode) throws Exception;

	public int deleteSbzt2ByMachCode(String machCode) throws Exception;

}
