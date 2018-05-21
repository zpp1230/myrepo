package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PayOrderDao {
    public <ModelType> int insert(ModelType record);
    public <ModelType> List<ModelType> selectParams(@Param("params")Map<String,Object> params);
    public int selectCount(@Param("params")Map<String,Object> params);
    public int updateByPrimaryKey(@Param("params")Map<String,Object> params);
    public int updateByPrimaryCargo(@Param("params")Map<String,Object> params);
    public <ModelType> int insert_pm_wares(ModelType record);
    public <ModelType> int insert_pm_refund(ModelType record);
}
