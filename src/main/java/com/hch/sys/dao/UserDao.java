package com.hch.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hch.dao.baseDao.BaseDao;
import com.hch.sys.entity.User;

/*
 * �û�DAO��
 */
@Repository
public interface UserDao extends BaseDao<User> {

	// ͨ�����Ʋ�ѯ
	User findByUsername(String name);

	// ���û������ɫ
	void distributionRoles(@Param("userId") String userId, @Param("roleIds") List<String> roleIds);

}
