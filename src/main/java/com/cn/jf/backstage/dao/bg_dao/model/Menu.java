package com.cn.jf.backstage.dao.bg_dao.model;

import java.util.Map;

import com.cn.jf.backstage.dao.bg_dao.entity.MenuMaster;

public class Menu {
   private  MenuMaster menuMaster;
   private  Map<String,Object> map;
public MenuMaster getMenuMaster() {
	return menuMaster;
}
public void setMenuMaster(MenuMaster menuMaster) {
	this.menuMaster = menuMaster;
}
public Map<String, Object> getMap() {
	return map;
}
public void setMap(Map<String, Object> map) {
	this.map = map;
}
}
