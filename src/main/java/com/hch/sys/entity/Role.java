package com.hch.sys.entity;

import java.util.List;
import com.hch.entity.dataEntity.DataEntity;

/*
 * ��ɫʵ����
 */
public class Role extends DataEntity<Role> {

	private static final long serialVersionUID = 1L;
	private String role; // ��ɫ��ʶ �������ж�ʹ��,��"admin"
	private String description; // ��ɫ����,UI������ʾʹ��
	private List<Resource> resources; // ӵ�е���Դ
	private Boolean available = Boolean.FALSE; // �Ƿ����,��������ý�������Ӹ��û�

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
