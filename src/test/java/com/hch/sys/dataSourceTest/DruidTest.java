package com.hch.sys.dataSourceTest;

import org.junit.Test;

import com.alibaba.druid.pool.DruidDataSource;
import com.hch.test.baseTest.BaseTest;

/*
 * �������ݿ����
 */
public class DruidTest extends BaseTest {

	@Test
	public void test() {
		DruidDataSource dataSource = ac.getBean("dataSource", DruidDataSource.class);
		System.out.println(dataSource);
		System.out.println(dataSource.getPassword());
	}

}
