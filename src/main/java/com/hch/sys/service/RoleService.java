package com.hch.sys.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hch.service.baseService.BaseService;
import com.hch.sys.dao.RoleDao;
import com.hch.sys.entity.Role;

/*
 * ��ɫ�����
 */
@Service
public class RoleService extends BaseService<Role, RoleDao> {

	@Autowired
	private ResourceService resourceService;

	// ͨ����ɫ��ʶ��ѯ��ɫ
	public Role findByRole(String role) {
		return dao.findByRole(role);
	}

	// ����ɫ������Դ
	public void distributionResouces(String roleId, List<String> resourceIds) {
		Role role = dao.get(roleId);
		if (role != null) {
			dao.distributionResouces(role.getId(), resourceIds);
		}
	}

	// ͨ����ɫ����ģ����ѯ
	public List<Role> findByDescription(String description) {
		return dao.findByDescription(description);
	}

	// ͨ��UserId��ѯrole
	public List<Role> findRoleByUserId(String userId) {
		return dao.findRoleByUserId(userId);
	}

	// ͨ���û�ID��ѯ��ɫ
	public Set<String> findRoles(String userId) {
		Set<String> roles = new HashSet<String>();
		List<Role> roleList = dao.findRoleByUserId(userId);
		if (!roleList.isEmpty() && roleList.size() > 0) {
			for (Role role : roleList) {
				roles.add(role.getRole());
			}
		}
		return roles;
	}

	// ͨ���û�ID��ѯȨ��
	public Set<String> findPermissions(String userId) {
		Set<String> resource = new HashSet<String>();
		List<Role> roleList = dao.findRoleByUserId(userId);
		List<String> roleIds = new ArrayList<String>();
		if (!roleList.isEmpty() && roleList.size() > 0) {
			for (Role role : roleList) {
				roleIds.add(role.getId());
			}
		}
		resource = resourceService.findPermissions(roleIds);
		return resource;
	}

}