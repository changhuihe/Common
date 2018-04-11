package com.hch.test.baseTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * ª˘±æ≤‚ ‘¿‡
 */
public abstract class BaseTest {

	public ApplicationContext ac = null;

	public BaseTest() {
		ac = (ApplicationContext) new ClassPathXmlApplicationContext(
				new String[] { "spring-config.xml", "spring-mvc.xml" });
	}
}
