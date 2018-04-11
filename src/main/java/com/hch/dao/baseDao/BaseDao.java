package com.hch.dao.baseDao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/*
 * DAO层基本CRUD操作
 */
public interface BaseDao<E> {
	/*
	 * 新增
	 */
	public void insert(E entity);

	/*
	 * 批量新增
	 */

	public void batchInsert(@Param("entityList") List<E> entityList);

	/*
	 * 通过Id删除
	 */
	public void deleteById(String id);

	/*
	 * 通过Id批量删除
	 */
	public void batchDelete(List<String> idList);

	/*
	 * 修改
	 */
	public void update(E entity);

	/*
	 * 查询所有数据
	 */
	public List<E> findAll();

	/*
	 * 通过Id获取单条数据
	 */
	public E get(String id);

	/*
	 * 通过实体多字段获取数据
	 */
	public List<E> findByEntity(E entity);

}
