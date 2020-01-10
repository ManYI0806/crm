package com.neusoft.crm.entity;

//订单信息表
public class Orders {

	// 订单编号
	private Integer ordersId;
	// 订购日期
	private String ordersDate;
	// 送货地址
	private String address;
	// 订单状态
	private Integer ordersState;
	// 所属客户编号
	private String clientCode;
	// 订单总金额
	private Integer ordersTotal;
	// 备注
	private String remark;

	public Integer getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(Integer ordersId) {
		this.ordersId = ordersId;
	}

	public String getOrdersDate() {
		return ordersDate;
	}

	public void setOrdersDate(String ordersDate) {
		this.ordersDate = ordersDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getOrdersState() {
		return ordersState;
	}

	public void setOrdersState(Integer ordersState) {
		this.ordersState = ordersState;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public Integer getOrdersTotal() {
		return ordersTotal;
	}

	public void setOrdersTotal(Integer ordersTotal) {
		this.ordersTotal = ordersTotal;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
