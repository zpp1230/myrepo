package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import com.cn.jf.backstage.dao.bg_dao.basic.HdlbsDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.HdlbsMapper;

@Repository("hdlbsDao")
public class HdlbsDaoImpl implements HdlbsDao {
	@Resource
	private HdlbsMapper hdlbsMapper;

	public <ModelType> List<String> searchGoods() throws Exception {
		return hdlbsMapper.searchGoods();
	}

}
