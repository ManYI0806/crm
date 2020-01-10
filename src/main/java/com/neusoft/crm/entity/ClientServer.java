package com.neusoft.crm.entity;

//客户服务信息表
public class ClientServer {

	// 服务编号
	private Integer serverId;
	// 服务类型编号
	private Integer serverTypeId;
	// 概要
	private String serverTitle;
	// 客户编号
	private String clientCode;
	// 服务状态
	private Integer serverStatus;
	// 服务请求的内容
	private String serverContent;
	// 创建人编号
	private Integer serverCreateId;
	// 创建日期
	private String serverCreateDate;
	// 指派人编号
	private Integer serverDueId;
	// 指派日期
	private String serverDueDate;
	// 服务处理内容
	private String serverProcessing;
	// 处理日期
	private String processingDate;
	// 处理结果
	private String processingResult;
	// 处理结果满意度
	private Integer clientContentment;

	public Integer getServerId() {
		return serverId;
	}

	public void setServerId(Integer serverId) {
		this.serverId = serverId;
	}

	public Integer getServerTypeId() {
		return serverTypeId;
	}

	public void setServerTypeId(Integer serverTypeId) {
		this.serverTypeId = serverTypeId;
	}

	public String getServerTitle() {
		return serverTitle;
	}

	public void setServerTitle(String serverTitle) {
		this.serverTitle = serverTitle;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public Integer getServerStatus() {
		return serverStatus;
	}

	public void setServerStatus(Integer serverStatus) {
		this.serverStatus = serverStatus;
	}

	public String getServerContent() {
		return serverContent;
	}

	public void setServerContent(String serverContent) {
		this.serverContent = serverContent;
	}

	public Integer getServerCreateId() {
		return serverCreateId;
	}

	public void setServerCreateId(Integer serverCreateId) {
		this.serverCreateId = serverCreateId;
	}

	public String getServerCreateDate() {
		return serverCreateDate;
	}

	public void setServerCreateDate(String serverCreateDate) {
		this.serverCreateDate = serverCreateDate;
	}

	public Integer getServerDueId() {
		return serverDueId;
	}

	public void setServerDueId(Integer serverDueId) {
		this.serverDueId = serverDueId;
	}

	public String getServerDueDate() {
		return serverDueDate;
	}

	public void setServerDueDate(String serverDueDate) {
		this.serverDueDate = serverDueDate;
	}

	public String getServerProcessing() {
		return serverProcessing;
	}

	public void setServerProcessing(String serverProcessing) {
		this.serverProcessing = serverProcessing;
	}

	public String getProcessingDate() {
		return processingDate;
	}

	public void setProcessingDate(String processingDate) {
		this.processingDate = processingDate;
	}

	public String getProcessingResult() {
		return processingResult;
	}

	public void setProcessingResult(String processingResult) {
		this.processingResult = processingResult;
	}

	public Integer getClientContentment() {
		return clientContentment;
	}

	public void setClientContentment(Integer clientContentment) {
		this.clientContentment = clientContentment;
	}

}
