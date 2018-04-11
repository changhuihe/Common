package com.hch.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hch.sys.dao.OrganizationDao;
import com.hch.sys.entity.Organization;

@Service
public class OrganizationServiceImpl implements OrganizationService {
	@Autowired
	private OrganizationDao organizationDao;

	public Organization createOrganization(Organization organization) {
		return organizationDao.createOrganization(organization);
	}

	public Organization updateOrganization(Organization organization) {
		return organizationDao.updateOrganization(organization);
	}

	public void deleteOrganization(Long organizationId) {
		organizationDao.deleteOrganization(organizationId);
	}

	public Organization findOne(Long organizationId) {
		return organizationDao.findOne(organizationId);
	}

	public List<Organization> findAll() {
		return organizationDao.findAll();
	}

	public List<Organization> findAllWithExclude(Organization excludeOraganization) {
		return organizationDao.findAllWithExclude(excludeOraganization);
	}

	public void move(Organization source, Organization target) {
		organizationDao.move(source, target);
	}
}