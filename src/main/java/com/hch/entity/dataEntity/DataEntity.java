package com.hch.entity.dataEntity;

import java.util.Date;

import com.hch.entity.baseEntity.BaseEntity;
import com.hch.sys.entity.User;

/*
 * ���ݳ���ʵ����
 */
public abstract class DataEntity<T> extends BaseEntity<T> {

	private static final long serialVersionUID = 1L;
	private User creator;// ������
	private Date createDate;// ��������
	private User editor;// �޸���
	private Date editorDate;// �޸�����
	private User deleteUser;// ɾ����
	private Date deleteDate;// ɾ������
	private User checker;// �����
	private Date checkDate;// �������

	public DataEntity() {
		super();
	}

	/*
	 * ��������ǰʵ�ֵķ���
	 */
	@Override
	public void preInsert() {
	}

	/*
	 * ��������ǰʵ�ֵķ���
	 */
	@Override
	public void preUpdate() {

	}

	/*
	 * ɾ������ǰʵ�ֵķ���
	 */
	@Override
	public void preDeleted() {

	}

	/*
	 * �������ǰʵ�ֵķ���
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
