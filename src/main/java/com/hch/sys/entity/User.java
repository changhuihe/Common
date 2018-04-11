package com.hch.sys.entity;

import java.util.Date;
import java.util.List;

import com.hch.entity.dataEntity.DataEntity;

/*
 * �û�ʵ����
 */
public class User extends DataEntity<User> {

	private static final long serialVersionUID = 1L;
	private String username;// �û���
	private String password;// ����
	private Date birthDate;// �������ڣ����պ�������ݳ��������Ƶ�
	private String email;// ����
	private String address;// סַ
	private String contactWay;// ��ϵ��ʽ
	private Boolean loginFlag;// �Ƿ���Ե�¼,false�����ԣ�true���ԣ�Ĭ��true
	private Integer errorCount;// ��¼�������������3�Σ������û����ܵ�¼��Ĭ��0
	private String salt; // �����������
	private List<Role> roles;// ӵ�еĽ�ɫ

	public User() {
		super();
		this.loginFlag = true;
		this.errorCount = 0;
	}

	// �����
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
