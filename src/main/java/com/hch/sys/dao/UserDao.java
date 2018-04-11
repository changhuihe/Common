package com.hch.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hch.dao.baseDao.BaseDao;
import com.hch.sys.entity.User;

/*
 * 用户DAO层
 */
@Repository
public interface UserDao extends BaseDao<User> {

	// 通过名称查询
	User findByUsername(String name);

	// 给用户分配角色
	void distributionRoles(@Param("userId") String userId, @Param("roleIds") List<String> roleIds);

}
