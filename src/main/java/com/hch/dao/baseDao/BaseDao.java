package com.hch.dao.baseDao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/*
 * DAO�����CRUD����
 */
public interface BaseDao<E> {
	/*
	 * ����
	 */
	public void insert(E entity);

	/*
	 * ��������
	 */

	public void batchInsert(@Param("entityList") List<E> entityList);

	/*
	 * ͨ��Idɾ��
	 */
	public void deleteById(String id);

	/*
	 * ͨ��Id����ɾ��
	 */
	public void batchDelete(List<String> idList);

	/*
	 * �޸�
	 */
	public void update(E entity);

	/*
	 * ��ѯ��������
	 */
	public List<E> findAll();

	/*
	 * ͨ��Id��ȡ��������
	 */
	public E get(String id);

	/*
	 * ͨ��ʵ����ֶλ�ȡ����
	 */
	public List<E> findByEntity(E entity);

}
