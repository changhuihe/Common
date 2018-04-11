package com.hch.sys.entity;

import java.util.List;
import com.hch.entity.dataEntity.DataEntity;

/*
 * 角色实体类
 */
public class Role extends DataEntity<Role> {

	private static final long serialVersionUID = 1L;
	private String role; // 角色标识 程序中判断使用,如"admin"
	private String description; // 角色描述,UI界面显示使用
	private List<Resource> resources; // 拥有的资源
	private Boolean available = Boolean.FALSE; // 是否可用,如果不可用将不会添加给用户

	public Role() {
		super();
	}

	public Role(String role, String description, Boolean available) {
		super();
		this.role = role;
		this.description = description;
		this.available = available;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResource(List<Resource> resources) {
		this.resources = resources;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Role [role=" + role + ", description=" + description + ", available=" + available + ", "
				+ super.toString() + "]";
	}

}
