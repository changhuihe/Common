package com.hch.entity.baseEntity;

import java.io.Serializable;

/*
 * ʵ�������
 */
public abstract class BaseEntity<E> implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;// Ψһ��־
	private Integer deletedFlag;// ɾ����־��0:δɾ����1��ɾ�������ڻ���վ���գ���2������ɾ����Ĭ��0
	private Boolean checkedFlag;// ��˱�־��false:δ��ˣ�true:��ˣ�Ĭ��false

	public BaseEntity() {
		this.deletedFlag = 0;
		this.checkedFlag = false;
	}

	/*
	 * ��������ǰʵ�ֵķ���
	 */
	public abstract void preInsert();

	/*
	 * ��������ǰʵ�ֵķ���
	 */
	public abstract void preUpdate();

	/*
	 * ɾ������ǰʵ�ֵķ���
	 */
	public abstract void preDeleted();

	/*
	 * �������ǰʵ�ֵķ���
	 */
	public abstract void preChecked();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getDeletedFlag() {
		return deletedFlag;
	}

	public void setDeletedFlag(Integer deletedFlag) {
		this.deletedFlag = deletedFlag;
	}

	public Boolean getCheckedFlag() {
		return checkedFlag;
	}

	public void setCheckedFlag(Boolean checkedFlag) {
		this.checkedFlag = checkedFlag;
	}

	@Override
	public String toString() {
		return " id=" + id + ", deletedFlag=" + deletedFlag + ", checkedFlag=" + checkedFlag;
	}

}
