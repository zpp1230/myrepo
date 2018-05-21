package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;

import com.cn.jf.backstage.dao.bg_dao.entity.Sppz;

public interface SppzDao {

	public Sppz getSppzByMach(String mach);

	public int addSppz(Sppz sppz);

	public int updateSppz(Sppz sppz);

	public List<Sppz> find(String s_machCode, String s_tier, String s_columns, int start, int size);

	public Long getTotal(String s_machCode, String s_tier, String s_columns);

	public int deleteSppz(String mach);
	

}
