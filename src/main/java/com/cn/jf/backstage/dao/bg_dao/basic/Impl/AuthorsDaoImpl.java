package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.AuthorsDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.AuthorsMapper;
import com.cn.jf.backstage.dao.bg_dao.model.Author;
@Repository("AuthorsDao")
public class AuthorsDaoImpl implements AuthorsDao{
	@Resource
	private AuthorsMapper authorsMapper;
	
	
	public Author getAuthor(Integer integer,String menuid) throws Exception {

		return authorsMapper.getAuthor(integer,menuid);
	}
}
