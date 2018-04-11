package com.hch.sys.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.authz.permission.WildcardPermission;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.hch.service.baseService.BaseService;
import com.hch.sys.dao.ResourceDao;
import com.hch.sys.entity.Resource;

/*
 * 资源Service层
 */
@Service
public class ResourceService extends BaseService<Resource, ResourceDao> {

	// 通过角色ID查询权限
	public Set<String> findPermissions(List<String> roleIds) {
		Set<String> permissions = new HashSet<String>();
		Set<Resource> resourceList = new HashSet<Resource>();
		for (String roleId : roleIds) {
			resourceList.addAll(dao.findResourceByRoleId(roleId));
		}
		if (!resourceList.isEmpty() && resourceList.size() > 0) {
			for (Resource resource : resourceList) {
				permissions.add(resource.getPermission());
			}
		}
		return permissions;
	}

	// 查询有相应权限的菜单
	public List<Resource> findMenus(Set<String> permissions) {
		List<Resource> allResources = findAll();
		List<Resource> menus = new ArrayList<Resource>();
		for (Resource resource : allResources) {
			if (resource.getType() != Resource.ResourceType.menu) {
				continue;
			}
			if (!hasPermission(permissions, resource)) {
				continue;
			}
			menus.add(resource);
		}
		return menus;
	}

	private boolean hasPermission(Set<String> permissions, Resource resource) {
		if (StringUtils.isEmpty(resource.getPermission())) {
			return true;
		}
		for (String permission : permissions) {
			WildcardPermission p1 = new WildcardPermission(permission);
			WildcardPermission p2 = new WildcardPermission(resource.getPermission());
			if (p1.implies(p2) || p2.implies(p1)) {
				return true;
			}
		}
		return false;
	}

}