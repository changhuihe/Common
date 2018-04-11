package com.hch.service.baseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.hch.dao.baseDao.BaseDao;
import com.hch.entity.baseEntity.BaseEntity;

/*
 * ҵ��������
 */
public abstract class BaseService<E extends BaseEntity<E>, D extends BaseDao<E>> {
	/*
	 * ע��־ò����
	 */
	@Autowired
	protected D dao;

	// ����
	public void insert(E entity) {
		dao.insert(entity);
	}

	// ��������
	public void batchInsert(List<E> list) {
		dao.batchInsert(list);
	}

	// �޸�
	public void update(E entity) {
		dao.update(entity);
	}

	// ͨ��IDɾ��
	public void deleteById(String id) {
		dao.deleteById(id);
	}

	// ͨ��id��ѯ
	public E get(String id) {
		return dao.get(id);
	}

	// ��ѯ����
	public List<E> findAll() {
		return dao.findAll();
	}

}
