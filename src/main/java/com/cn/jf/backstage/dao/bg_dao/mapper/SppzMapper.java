package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.cn.jf.backstage.dao.bg_dao.entity.Sppz;

public interface SppzMapper {
	public Sppz getSppzByMach(@Param("mach") String mach);

	public int addSppz(Sppz sppz);

	public int updateSppz(Sppz sppz);

	public List<Sppz> find(@Param("machCode") String s_machCode,@Param("tier") String s_tier, @Param("columns") String s_columns, @Param("start")int start,@Param("size") int size);

	public Long getTotal(@Param("machCode") String s_machCode,@Param("tier") String s_tier, @Param("columns") String s_columns);

	public int deleteSppz(@Param("mach") String mach);
}
