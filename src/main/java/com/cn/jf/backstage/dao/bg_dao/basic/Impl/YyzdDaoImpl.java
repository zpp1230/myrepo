package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import com.cn.jf.backstage.dao.bg_dao.basic.YyzdDao;
import com.cn.jf.backstage.dao.bg_dao.entity.Yyzd;
import com.cn.jf.backstage.dao.bg_dao.mapper.YyzdMapper;
@Repository("YyzdDao")
public class YyzdDaoImpl implements YyzdDao{
	@Resource
	private YyzdMapper yyzdMapper;
	

	public <ModelType> Yyzd getYyzdByOperatorID(String operatorID) throws Exception {
		
		return yyzdMapper.getYyzdByOperatorID(operatorID);
	}


	public int addYyzd(Yyzd yyzd) throws Exception {
		
		return yyzdMapper.addYyzd(yyzd);
	}


	public int updateYyzd(Yyzd yyzd) throws Exception {
		
		return yyzdMapper.updateYyzd(yyzd);
	}



	public List<Yyzd> find(String s_operator, int start, int size) throws Exception {

		return yyzdMapper.find(s_operator,start,size);
	}



	public Long getTotal(String s_operator) throws Exception {

		return yyzdMapper.getTotal(s_operator);
	}



	public int deleteYyzd(String operatorID) throws Exception {
		
		return yyzdMapper.deleteYyzd(operatorID);
	}

}
