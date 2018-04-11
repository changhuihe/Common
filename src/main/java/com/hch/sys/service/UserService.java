package com.hch.sys.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hch.service.baseService.BaseService;
import com.hch.sys.dao.UserDao;
import com.hch.sys.entity.Role;
import com.hch.sys.entity.User;

@Service
public class UserService extends BaseService<User, UserDao> {

	@Autowired
	private PasswordHelper passwordHelper;
	@Autowired
	private RoleService roleService;

	// 给用户分配角色
	public void distributionRoles(String userId, List<String> roleIds) {
		User user = dao.get(userId);
		if (user != null) {
			dao.distributionRoles(user.getId(), roleIds);
		}
	}

	// 通过UserId查询role
	public User findRoleByUserId(String userId) {
		User user = dao.get(userId);
		if (user == null) {
			return user;
		} else {
			List<Role> roleList = roleService.findRoleByUserId(user.getId());
			user.setRoles(roleList);
		}
		return user;
	}

	// 新增
	public void insert(User user) {
		// 加密密码
		passwordHelper.encryptPassword(user);
		dao.insert(user);
	}

	// 修改密码
	public void changePassword(String userId, String newPassword) {
		User user = dao.get(userId);
		user.setPassword(newPassword);
		passwordHelper.encryptPassword(user);
		dao.update(user);
	}

	// 根据用户名查找用户
	public User findByUsername(String userName) {
		return dao.findByUsername(userName);
	}

	// 通过用户名查询角色
	public Set<String> findRoles(String userName) {
		User user = dao.findByUsername(userName);
		if (user == null) {
			return new HashSet<String>();
		}
		return roleService.findRoles(user.getId());
	}

	// 通过用户名查询权限
	public Set<String> findPermissions(String userName) {
		User user = dao.findByUsername(userName);
		if (user == null) {
			return new HashSet<String>();
		}
		return roleService.findPermissions(user.getId());
	}

}