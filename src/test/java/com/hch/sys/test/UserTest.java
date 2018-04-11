package com.hch.sys.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.hch.sys.dao.UserDao;
import com.hch.sys.entity.Role;
import com.hch.sys.entity.User;
import com.hch.sys.service.RoleService;
import com.hch.sys.service.UserService;
import com.hch.test.baseTest.BaseTest;

/*
 * User≤‚ ‘¿‡
 */
public class UserTest extends BaseTest {
	UserDao userDao = null;
	UserService userService = null;
	RoleService roleService = null;

	@Before
	public void Before() {
		userDao = ac.getBean("userDao", UserDao.class);
		userService = ac.getBean("userService", UserService.class);
		roleService = ac.getBean("roleService", RoleService.class);
	}

	// @Test
	public void insert() {
		User user = new User();
		user.setUsername("admin");
		user.setPassword("123");
		user.setLoginFlag(true);
		userService.insert(user);
	}

	// @Test
	public void get() {
		System.out.println(userService.get("d0c8b866-3c04-11e8-8fda-208984e4020a"));
		List<User> userList = userService.findAll();
		for (User user : userList) {
			System.out.println(user);
		}
	}

	// @Test
	public void distributionRoles() {
		List<Role> roleList = roleService.findByDescription("π‹¿Ì");
		List<String> roleIds = new ArrayList<String>();
		for (Role role : roleList) {
			roleIds.add(role.getId());
		}
		User user = userService.findByUsername("admin");
		userService.distributionRoles(user.getId(), roleIds);
	}

	// @Test
	public void findRoleByUserId() {
		User user = userService.findByUsername("admin");
		user = userService.findRoleByUserId(user.getId());
		for (Role role : user.getRoles()) {
			System.out.println(role);
		}
	}

	// @Test
	public void findRoles() {
		Set<String> roles = userService.findRoles("admin");
		for (String role : roles) {
			System.out.println(role);
		}
	}

	@Test
	public void findPermissions() {
		Set<String> permissions = userService.findPermissions("admin");
		for (String permission : permissions) {
			System.out.println(permission);
		}
	}

}
