package com.hch.service.baseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.hch.dao.baseDao.BaseDao;
import com.hch.entity.baseEntity.BaseEntity;

/*
 * 业务层抽象类
 */
public abstract class BaseService<E extends BaseEntity<E>, D extends BaseDao<E>> {
	/*
	 * 注入持久层对象
	 */
	@Autowired
	protected D dao;

	// 插入
	public void insert(E entity) {
		dao.insert(entity);
	}

	// 批量插入
	public void batchInsert(List<E> list) {
		dao.batchInsert(list);
	}

	// 修改
	public void update(E entity) {
		dao.update(entity);
	}

	// 通过ID删除
	public void deleteById(String id) {
		dao.deleteById(id);
	}

	// 通过id查询
	public E get(String id) {
		return dao.get(id);
	}

	// 查询所有
	public List<E> findAll() {
		return dao.findAll();
	}

}
