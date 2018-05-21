package com.cn.jf.backstage.dao.bg_dao.mapper;

import org.apache.ibatis.annotations.Param;

public interface AuthorRoleModelMapper {

	public <ModelType> ModelType findByRoleId(@Param("roleId") int roleId,
			@Param("menuid") String menuid) throws Exception;
}
