package com.hch.entity.baseEntity;

import java.io.Serializable;

/*
 * 实体抽象类
 */
public abstract class BaseEntity<E> implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;// 唯一标志
	private Integer deletedFlag;// 删除标志，0:未删除，1：删除（可在回收站回收），2：彻底删除，默认0
	private Boolean checkedFlag;// 审核标志，false:未审核，true:审核，默认false

	public BaseEntity() {
		this.deletedFlag = 0;
		this.checkedFlag = false;
	}

	/*
	 * 插入数据前实现的方法
	 */
	public abstract void preInsert();

	/*
	 * 更新数据前实现的方法
	 */
	public abstract void preUpdate();

	/*
	 * 删除数据前实现的方法
	 */
	public abstract void preDeleted();

	/*
	 * 审核数据前实现的方法
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
