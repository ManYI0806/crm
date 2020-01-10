package com.neusoft.crm.entity;

//系统用户表
public class SysUser {

	// 用户编号
	private Integer userId;
	// 用户名称
	private String userName;
	// 用户密码
	private String userPassword;
	// 用户所属地区
	private Integer userRoleId;
	// 用户职责ID
	private Integer daId;
	// 用户标识(留用)
	private Integer userFlag;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public Integer getDaId() {
		return daId;
	}

	public void setDaId(Integer daId) {
		this.daId = daId;
	}

	public Integer getUserFlag() {
		return userFlag;
	}

	public void setUserFlag(Integer userFlag) {
		this.userFlag = userFlag;
	}

}
