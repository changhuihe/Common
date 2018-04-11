package com.hch.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hch.dao.baseDao.BaseDao;
import com.hch.sys.entity.Role;

/*
 * ��ɫDAO��
 */
@Repository
public interface RoleDao extends BaseDao<Role> {

	// ͨ����ɫ��ʶ��ѯ��ɫ
	public Role findByRole(String role);

	// ͨ����ɫ����ģ����ѯ
	public List<Role> findByDescription(String description);

	// ͨ��UserId��ѯrole
	List<Role> findRoleByUserId(String userId);

	// ����ɫ������Դ
	void distributionResouces(@Param("roleId") String roleId, @Param("resourceIds") List<String> resourceIds);
}
