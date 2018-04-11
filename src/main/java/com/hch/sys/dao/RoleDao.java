package com.hch.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hch.dao.baseDao.BaseDao;
import com.hch.sys.entity.Role;

/*
 * 角色DAO层
 */
@Repository
public interface RoleDao extends BaseDao<Role> {

	// 通过角色标识查询角色
	public Role findByRole(String role);

	// 通过角色描述模糊查询
	public List<Role> findByDescription(String description);

	// 通过UserId查询role
	List<Role> findRoleByUserId(String userId);

	// 给角色分配资源
	void distributionResouces(@Param("roleId") String roleId, @Param("resourceIds") List<String> resourceIds);
}
