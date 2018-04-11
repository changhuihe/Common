package com.hch.sys.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.springframework.beans.factory.annotation.Autowired;

import com.hch.sys.constants.Constants;
import com.hch.sys.service.UserService;
/*
 * 用于根据当前登录用户身份获取User信息方法request
 */
public class SysUserFilter extends PathMatchingFilter {

	@Autowired
	private UserService userService;

	@Override
	protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue)
			throws Exception {

		String username = (String) SecurityUtils.getSubject().getPrincipal();
		request.setAttribute(Constants.CURRENT_USER, userService.findByUsername(username));
		return true;
	}
}
