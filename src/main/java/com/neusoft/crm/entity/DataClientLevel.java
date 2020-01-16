package com.neusoft.crm.entity;

//数据字典-企业客户等级表
public class DataClientLevel {

	// 企业客户等级编号
	private Integer dclId;
	// 企业客户等级名称
	private String dclName;
	//rept
	private ClientInfo clientInfo;

	public Integer getDclId() {
		return dclId;
	}

	public void setDclId(Integer dclId) {
		this.dclId = dclId;
	}

	public String getDclName() {
		return dclName;
	}

	public void setDclName(String dclName) {
		this.dclName = dclName;
	}

	public ClientInfo getClientInfo() {
		return clientInfo;
	}

	public void setClientInfo(ClientInfo clientInfo) {
		this.clientInfo = clientInfo;
	}
	

}
