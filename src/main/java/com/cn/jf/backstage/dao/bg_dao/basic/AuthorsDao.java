package com.cn.jf.backstage.dao.bg_dao.basic;

import com.cn.jf.backstage.dao.bg_dao.model.Author;

public interface AuthorsDao {

	public Author getAuthor(Integer integer,String menuid) throws Exception;

}
