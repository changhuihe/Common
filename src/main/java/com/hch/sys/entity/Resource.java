package com.hch.sys.entity;

import com.hch.entity.dataEntity.DataEntity;

/*
 * 资源实体类，表示菜单元素、页面按钮元素、数据元素等；
 */
public class Resource extends DataEntity<Resource> {

	private static final long serialVersionUID = 1L;
	private String name; // 资源名称
	private ResourceType type; // 资源类型
	private String url; // 资源路径
	private String permission; // 权限字符串，user:*,user:create
	private int priority;// 显示顺序
	private String code;// 编号,长度为4的数字0000-9999（0000-0999一级目录，1000-1999为二级目录，以此类推 ）（code具有唯一性）
	private String parentCode; // 父编号（所有父编码以/拼接）
	private Boolean available = Boolean.FALSE;// 资源是否可用

	public static enum ResourceType {
		menu("菜单"), button("按钮"), data("数据");

		private final String info;

		private ResourceType(String info) {
			this.info = info;
		}

		public String getInfo() {
			return info;
		}
	}

	public Resource() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ResourceType getType() {
		return type;
	}

	public void setType(ResourceType type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	@Override
	public String toString() {
		return "Resource [name=" + name + ", type=" + type + ", url=" + url + ", permission=" + permission
				+ ", priority=" + priority + ", code=" + code + ", parentCode=" + parentCode + ", available="
				+ available + ", " + super.toString() + "]";
	}

}
