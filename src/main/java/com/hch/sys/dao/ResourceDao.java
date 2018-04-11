package com.hch.sys.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hch.dao.baseDao.BaseDao;
import com.hch.sys.entity.Resource;

/*
 * 资源DAO层
 */
@Repository
public interface ResourceDao extends BaseDao<Resource> {

	// 通过角色ID查询资源
	List<Resource> findResourceByRoleId(String roleId);
}
