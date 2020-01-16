package com.neusoft.crm.entity;

//数据字典-服务类别表
public class DataServerType {

	// 服务类别编号
	private Integer dstId;
	// 服务类别名称
	private String dstName;
	//rept
	private ClientServer ClientServer;

	public Integer getDstId() {
		return dstId;
	}

	public void setDstId(Integer dstId) {
		this.dstId = dstId;
	}

	public String getDstName() {
		return dstName;
	}

	public void setDstName(String dstName) {
		this.dstName = dstName;
	}

	public ClientServer getClientServer() {
		return ClientServer;
	}

	public void setClientServer(ClientServer clientServer) {
		ClientServer = clientServer;
	}
	

}
