package com.hch.sys.entity;

import com.hch.entity.dataEntity.DataEntity;

/*
 * ��Դʵ���࣬��ʾ�˵�Ԫ�ء�ҳ�水ťԪ�ء�����Ԫ�صȣ�
 */
public class Resource extends DataEntity<Resource> {

	private static final long serialVersionUID = 1L;
	private String name; // ��Դ����
	private ResourceType type; // ��Դ����
	private String url; // ��Դ·��
	private String permission; // Ȩ���ַ�����user:*,user:create
	private int priority;// ��ʾ˳��
	private String code;// ���,����Ϊ4������0000-9999��0000-0999һ��Ŀ¼��1000-1999Ϊ����Ŀ¼���Դ����� ����code����Ψһ�ԣ�
	private String parentCode; // ����ţ����и�������/ƴ�ӣ�
	private Boolean available = Boolean.FALSE;// ��Դ�Ƿ����

	public static enum ResourceType {
		menu("�˵�"), button("��ť"), data("����");

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
