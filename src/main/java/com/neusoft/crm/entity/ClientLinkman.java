package com.neusoft.crm.entity;

//客户联系人表
public class ClientLinkman {

	// 客户联系人编号
	private Integer clientLinkmanId;
	// 客户联系人姓名
	private String clientLinkmanName;
	// 客户联系人性别
	private Integer clientLinkmanSex;
	// 客户联系人职位
	private String clientLinkmanJob;
	// 客户联系人办公电话
	private String clientLinkmanTel;
	// 客户联系人手机
	private String clientLinkmanMobile;
	// 备注
	private String remark;
	// 客户编号
	private String clientCode;

	public Integer getClientLinkmanId() {
		return clientLinkmanId;
	}

	public void setClientLinkmanId(Integer clientLinkmanId) {
		this.clientLinkmanId = clientLinkmanId;
	}

	public String getClientLinkmanName() {
		return clientLinkmanName;
	}

	public void setClientLinkmanName(String clientLinkmanName) {
		this.clientLinkmanName = clientLinkmanName;
	}

	public Integer getClientLinkmanSex() {
		return clientLinkmanSex;
	}

	public void setClientLinkmanSex(Integer clientLinkmanSex) {
		this.clientLinkmanSex = clientLinkmanSex;
	}

	public String getClientLinkmanJob() {
		return clientLinkmanJob;
	}

	public void setClientLinkmanJob(String clientLinkmanJob) {
		this.clientLinkmanJob = clientLinkmanJob;
	}

	public String getClientLinkmanTel() {
		return clientLinkmanTel;
	}

	public void setClientLinkmanTel(String clientLinkmanTel) {
		this.clientLinkmanTel = clientLinkmanTel;
	}

	public String getClientLinkmanMobile() {
		return clientLinkmanMobile;
	}

	public void setClientLinkmanMobile(String clientLinkmanMobile) {
		this.clientLinkmanMobile = clientLinkmanMobile;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

}
