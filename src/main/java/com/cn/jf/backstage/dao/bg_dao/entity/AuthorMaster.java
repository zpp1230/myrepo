package com.cn.jf.backstage.dao.bg_dao.entity;

public class AuthorMaster {
	private  int    id;
	private  int    roleId;
	private  String menuid;
	private  int    add_;
	private  int    search;
	private  int    update_;
	private  int    delete_;
	private  int    import_;
	private  int    export_;
	private  int    print;
	private  int    menu;
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getRoleId(){
		return roleId;
	}
	public void setRoleId(int roleId){
		this.roleId = roleId;
	}
	public String getMenuid(){
		return menuid;
	}
	public void setMenuid(String menuid){
		this.menuid = menuid;
	}
	public int getAdd_(){
		return add_;
	}
	public void setAdd_(int add_){
		this.add_ = add_;
	}
	public int getSearch(){
		return search;
	}
	public void setSearch(int search){
		this.search = search;
	}
	public int getUpdate_(){
		return update_;
	}
	public void setUpdate_(int update_){
		this.update_ = update_;
	}
	public int getDelete_(){
		return delete_;
	}
	public void setDelete_(int delete_){
		this.delete_ = delete_;
	}
	public int getImport_(){
		return import_;
	}
	public void setImport_(int import_){
		this.import_ = import_;
	}
	public int getExport_(){
		return export_;
	}
	public void setExport_(int export_){
		this.export_ = export_;
	}
	public int getPrint(){
		return print;
	}
	public void setPrint(int print){
		this.print = print;
	}
	public int getMenu(){
		return menu;
	}
	public void setMenu(int menu){
		this.menu = menu;
	}
}
