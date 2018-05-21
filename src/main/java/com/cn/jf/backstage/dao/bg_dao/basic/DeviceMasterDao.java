package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;
import java.util.Map;
public interface DeviceMasterDao {
    public <ModelType> int deleteById(ModelType modelType) throws Exception;
	public <ModelType> int add(ModelType modelType) throws Exception;
	public <ModelType> ModelType findById(ModelType modelType)throws Exception;
	public <ModelType> List<ModelType> findByParams(Map<String,Object> params)throws Exception;
	public <ModelType> List<ModelType> findByBiz(ModelType modelType,Map<String,Object> params)throws Exception;
	public <ModelType> int modifyById(ModelType modelType)throws Exception;
	public int findCount(Map<String,Object> params)throws Exception;
	public <ModelType> List<ModelType> findByPage(String orderByField,String orderBy,Map<String,Object> params)throws Exception;
	public <ModelType> List<ModelType> findByParamsOper()throws Exception;
	public <ModelType> List<ModelType> findByParamsModel()throws Exception;
}


