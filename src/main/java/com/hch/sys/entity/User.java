package com.hch.sys.entity;

import java.util.Date;
import java.util.List;

import com.hch.entity.dataEntity.DataEntity;

/*
 * 用户实体类
 */
public class User extends DataEntity<User> {

	private static final long serialVersionUID = 1L;
	private String username;// 用户名
	private String password;// 密码
	private Date birthDate;// 出生日期，生日和年龄根据出生日期推导
	private String email;// 邮箱
	private String address;// 住址
	private String contactWay;// 联系方式
	private Boolean loginFlag;// 是否可以登录,false不可以，true可以，默认true
	private Integer errorCount;// 登录错误次数，错误3次，锁定用户不能登录，默认0
	private String salt; // 加密密码的盐
	private List<Role> roles;// 拥有的角色

	public User() {
		super();
		this.loginFlag = true;
		this.errorCount = 0;
	}

	// 获得盐
	public String getCredentialsSalt() {
		return username + salt;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactWay() {
		return contactWay;
	}

	public void setContactWay(String contactWay) {
		this.contactWay = contactWay;
	}

	public Boolean getLoginFlag() {
		return loginFlag;
	}

	public void setLoginFlag(Boolean loginFlag) {
		this.loginFlag = loginFlag;
	}

	public Integer getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(Integer errorCount) {
		this.errorCount = errorCount;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", birthDate=" + birthDate + ", email=" + email
				+ ", address=" + address + ", contactWay=" + contactWay + ", loginFlag=" + loginFlag + ", errorCount="
				+ errorCount + ", salt=" + salt + "]";
	}

}
