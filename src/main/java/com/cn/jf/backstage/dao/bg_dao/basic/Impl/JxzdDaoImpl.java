package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.JxzdDao;
import com.cn.jf.backstage.dao.bg_dao.entity.Jxzd;
import com.cn.jf.backstage.dao.bg_dao.mapper.JxzdMapper;

@Repository("jxzdDao1")
public class JxzdDaoImpl implements JxzdDao {
	@Resource
	private JxzdMapper jxzdMapper;

	public <ModelType> Jxzd getJxzdByModelNum(String modelNum) throws Exception {
		return jxzdMapper.getJxzdByModelNum(modelNum);

	}

	public <ModelType> int addJxzd(Jxzd jxzd) throws Exception {
		return jxzdMapper.addJxzd(jxzd);

	}

	public <ModelType> int deleteJxzd(String modelNum) throws Exception {

		return jxzdMapper.deleteJxzd(modelNum);
	}

	public <ModelType> int updateJxzd(Jxzd jxzd) throws Exception {

		return jxzdMapper.updateJxzd(jxzd);
	}

	public <ModelType> List<Jxzd> find(String s_model, String s_coolType, String s_hotType, String s_environment,
			int start, int size) throws Exception {

		return jxzdMapper.find(s_model, s_coolType, s_hotType, s_environment, start, size);
	}

	public <ModelType> List<Jxzd> selects(String s_model, String s_coolType, String s_hotType, String s_environment)
			throws Exception {

		return jxzdMapper.selects(s_model, s_coolType, s_hotType, s_environment);

	}

	public <ModelType> Long getTotal(String s_model, String s_coolType, String s_hotType, String s_environment)
			throws Exception {

		return jxzdMapper.getTotal(s_model, s_coolType, s_hotType, s_environment);
	}

	public List<String> searchModels() throws Exception {

		return jxzdMapper.searchModels();
	}

}
