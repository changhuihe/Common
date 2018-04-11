package com.hch.sys.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.hch.sys.dao.RoleDao;
import com.hch.sys.entity.Resource;
import com.hch.sys.entity.Role;
import com.hch.sys.service.ResourceService;
import com.hch.sys.service.RoleService;
import com.hch.test.baseTest.BaseTest;

/*
 * Role测试类
 */
public class RoleTest extends BaseTest {
	RoleDao roleDao = null;
	RoleService roleService = null;
	ResourceService resourceService = null;

	@Before
	public void Before() {
		roleDao = ac.getBean("roleDao", RoleDao.class);
		roleService = ac.getBean("roleService", RoleService.class);
		resourceService = ac.getBean("resourceService", ResourceService.class);
	}

	// @Test
	public void insert() {
		Role role1 = new Role("superAdmin", "超级管理员", true);
		Role role2 = new Role("admin", "管理员", true);
		Role role3 = new Role("ordinaryUser", "普通用户", true);
		Role role4 = new Role("visitor", "游客", true);
		role1.setCheckedFlag(true);
		role2.setCheckedFlag(true);
		role3.setCheckedFlag(true);
		role4.setCheckedFlag(true);
		// 单条插入
		roleService.insert(role1);
		List<Role> list = new ArrayList<Role>();
		list.add(role2);
		list.add(role3);
		list.add(role4);
		// 批量插入
		roleService.batchInsert(list);
	}

	//@Test
	public void distributionResouces() {
		Role role = roleService.findByRole("superAdmin");
		List<Resource> resourceList = resourceService.findAll();
		List<String> resourceIds = new ArrayList<String>();
		for (Resource resource : resourceList) {
			resourceIds.add(resource.getId());
		}
		roleService.distributionResouces(role.getId(), resourceIds);
	}
	
	@Test
	public void find() {
		System.out.println(roleService.get("c0c361de-3c06-11e8-8fda-208984e4020a"));
		System.out.println(roleService.findByRole("admin"));
		List<Role> list = new ArrayList<Role>();
		list = roleService.findAll();
		for (Role role : list) {
			System.out.println(role);
		}
		list = roleService.findByDescription("管理");
		for (Role role : list) {
			System.out.println(role);
		}

	}

}
