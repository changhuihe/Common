package com.hch.sys.credentials;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;

/*
 * 密码重试次数限制
 * HashedCredentialsMatcher提供了对AuthenticationToken凭证进行散列的支持，然后与AuthenticationInfo中的数据进行对比
 */
public class RetryLimitHashedCredentialsMatcher extends HashedCredentialsMatcher {

	private Cache<String, AtomicInteger> passwordRetryCache;

	/*
	 * CacheManager缓存管理器，维护Cache实例的生命周期
	 */
	public RetryLimitHashedCredentialsMatcher(CacheManager cacheManager) {
		// 获取指定的缓存,passwordRetryCache为ehcache.xml文件中配置的登录记录缓存
		passwordRetryCache = cacheManager.getCache("passwordRetryCache");
	}

	/*
	 * token：用户提交的身份认证令牌;info:存储在数据库中与令牌主体匹配的数据
	 */
	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		String username = (String) token.getPrincipal();// 获取身份
		AtomicInteger retryCount = passwordRetryCache.get(username);
		if (retryCount == null) {
			retryCount = new AtomicInteger(0);
			passwordRetryCache.put(username, retryCount);// 在缓存中增加登录次数
		}
		// incrementAndGet以原子的方式将当前值+1
		if (retryCount.incrementAndGet() > 5) {
			throw new ExcessiveAttemptsException();
		}
		boolean matches = super.doCredentialsMatch(token, info);
		if (matches) {
			passwordRetryCache.remove(username);// 删除与指定键相对应的缓存条目
		}
		return matches;
	}
}
