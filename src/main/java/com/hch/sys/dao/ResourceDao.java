package com.hch.sys.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hch.dao.baseDao.BaseDao;
import com.hch.sys.entity.Resource;

/*
 * ��ԴDAO��
 */
@Repository
public interface ResourceDao extends BaseDao<Resource> {

	// ͨ����ɫID��ѯ��Դ
	List<Resource> findResourceByRoleId(String roleId);
}
