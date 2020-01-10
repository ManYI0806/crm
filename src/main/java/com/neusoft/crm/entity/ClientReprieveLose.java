package com.neusoft.crm.entity;

//客户暂缓流失措施记录表
public class ClientReprieveLose {

	// 客户暂缓流失记录编号
	private Integer clientReprieveLoseId;
	// 暂缓措施项
	private String reprieveStep;
	// 客户编号
	private String clientCode;

	public Integer getClientReprieveLoseId() {
		return clientReprieveLoseId;
	}

	public void setClientReprieveLoseId(Integer clientReprieveLoseId) {
		this.clientReprieveLoseId = clientReprieveLoseId;
	}

	public String getReprieveStep() {
		return reprieveStep;
	}

	public void setReprieveStep(String reprieveStep) {
		this.reprieveStep = reprieveStep;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

}
