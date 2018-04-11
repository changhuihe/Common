package com.hch.sys.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.hch.sys.dao.ResourceDao;
import com.hch.sys.entity.Resource;
import com.hch.sys.entity.Resource.ResourceType;
import com.hch.sys.service.ResourceService;
import com.hch.test.baseTest.BaseTest;

/*
 * Resource测试类
 */
public class ResourceTest extends BaseTest {
	ResourceDao resourceDao = null;
	ResourceService resourceService = null;

	@Before
	public void Before() {
		resourceDao = ac.getBean("resourceDao", ResourceDao.class);
		resourceService = ac.getBean("resourceService", ResourceService.class);
	}

	// @Test
	public void insert() {
		Resource resource = new Resource();
		resource.setName("管控中心");
		resource.setType(ResourceType.menu);
		resource.setUrl("/management");
		resource.setPermission("management:*");
		resource.setAvailable(true);
		resource.setPriority(1);
		resource.setCode("0000");
		resource.setCheckedFlag(true);
		resourceDao.insert(resource);
	}

	// @Test
	public void batchInsert() {
		Resource resource = new Resource();
		resource.setName("资源管理");
		resource.setType(ResourceType.menu);
		resource.setUrl("/resource");
		resource.setPermission("resource:*");
		resource.setAvailable(true);
		resource.setPriority(1);
		resource.setCode("1000");
		resource.setParentCode("0000");
		resource.setCheckedFlag(true);

		Resource resource1 = new Resource();
		Resource resource2 = new Resource();
		Resource resource3 = new Resource();
		Resource resource4 = new Resource();
		resource1.setName("新增");
		resource1.setType(ResourceType.button);
		resource1.setPermission("resource:add");
		resource1.setAvailable(true);
		resource1.setPriority(1);
		resource1.setCode("2000");
		resource1.setParentCode("0000/1000");
		resource1.setCheckedFlag(true);

		resource2.setName("删除");
		resource2.setType(ResourceType.button);
		resource2.setPermission("resource:delete");
		resource2.setAvailable(true);
		resource2.setPriority(2);
		resource2.setCode("3000");
		resource2.setParentCode("0000/1000");
		resource2.setCheckedFlag(true);

		resource3.setName("修改");
		resource3.setType(ResourceType.button);
		resource3.setPermission("resource:update");
		resource3.setAvailable(true);
		resource3.setPriority(3);
		resource3.setCode("4000");
		resource3.setParentCode("0000/1000");
		resource3.setCheckedFlag(true);

		resource4.setName("查看");
		resource4.setType(ResourceType.button);
		resource4.setPermission("resource:view");
		resource4.setAvailable(true);
		resource4.setPriority(4);
		resource4.setCode("5000");
		resource4.setParentCode("0000/1000");
		resource4.setCheckedFlag(true);
		List<Resource> list = new ArrayList<Resource>();
		list.add(resource);
		list.add(resource1);
		list.add(resource2);
		list.add(resource3);
		list.add(resource4);
		resourceDao.batchInsert(list);

	}

	@Test
	public void find() {
		List<Resource> resourceList = resourceService.findAll();
		for (Resource resource : resourceList) {
			System.out.println(resource);
		}
		Resource resource = resourceService.get("3184ff5c-3bf6-11e8-8fda-208984e4020a");
		System.out.println(resource);
	}
}
