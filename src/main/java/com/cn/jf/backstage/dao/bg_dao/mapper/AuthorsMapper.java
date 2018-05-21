package com.cn.jf.backstage.dao.bg_dao.mapper;

import org.apache.ibatis.annotations.Param;

import com.cn.jf.backstage.dao.bg_dao.model.Author;

public interface AuthorsMapper {

	public Author getAuthor(@Param("roleId") Integer integer,@Param("menuid") String menuid) throws Exception;

}
