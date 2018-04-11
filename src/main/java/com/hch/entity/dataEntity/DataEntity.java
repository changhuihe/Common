package com.hch.entity.dataEntity;

import java.util.Date;

import com.hch.entity.baseEntity.BaseEntity;
import com.hch.sys.entity.User;

/*
 * 数据抽象实体类
 */
public abstract class DataEntity<T> extends BaseEntity<T> {

	private static final long serialVersionUID = 1L;
	private User creator;// 创建人
	private Date createDate;// 创建日期
	private User editor;// 修改人
	private Date editorDate;// 修改日期
	private User deleteUser;// 删除人
	private Date deleteDate;// 删除日期
	private User checker;// 审核人
	private Date checkDate;// 审核日期

	public DataEntity() {
		super();
	}

	/*
	 * 插入数据前实现的方法
	 */
	@Override
	public void preInsert() {
	}

	/*
	 * 更新数据前实现的方法
	 */
	@Override
	public void preUpdate() {

	}

	/*
	 * 删除数据前实现的方法
	 */
	@Override
	public void preDeleted() {

	}

	/*
	 * 审核数据前实现的方法
	 */
	@Override
	public void preChecked() {

	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public User getEditor() {
		return editor;
	}

	public void setEditor(User editor) {
		this.editor = editor;
	}

	public Date getEditorDate() {
		return editorDate;
	}

	public void setEditorDate(Date editorDate) {
		this.editorDate = editorDate;
	}

	public User getDeleteUser() {
		return deleteUser;
	}

	public void setDeleteUser(User deleteUser) {
		this.deleteUser = deleteUser;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public User getChecker() {
		return checker;
	}

	public void setChecker(User checker) {
		this.checker = checker;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	@Override
	public String toString() {
		return " creator=" + creator + ", createDate=" + createDate + ", editor=" + editor + ", editorDate="
				+ editorDate + ", deleteUser=" + deleteUser + ", deleteDate=" + deleteDate + ", checker=" + checker
				+ ", checkDate=" + checkDate + ", " + super.toString();
	}

}
