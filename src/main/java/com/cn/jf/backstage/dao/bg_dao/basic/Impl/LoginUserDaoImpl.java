package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.LoginUserDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.LoginUserMapper;

@Repository("loginUserDao")
public class LoginUserDaoImpl implements LoginUserDao{

	@Resource
    private  LoginUserMapper  loginUserMapper;
	public <ModelType> ModelType findById(Map<String, Object> params) throws Exception {
		return loginUserMapper.selectParams(params);
	}
	public <ModelType> int modifyById(Map<String, Object> params) throws Exception {
		// TODO Auto-generated method stub
		return loginUserMapper.updateByPrimaryKey(params);
	}
}
