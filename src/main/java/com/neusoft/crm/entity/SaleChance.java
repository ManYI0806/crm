package com.neusoft.crm.entity;

//销售机会表
public class SaleChance {

	// 销售机会编号
	private Integer chanceId;
	// 机会来源
	private String chanceSource;
	// 客户名称
	private String chanceCustName;
	// 概要
	private String chanceTitle;
	// 成功机率(从0到100的数字)
	private Integer chanceRate;
	// 联系人
	private String chanceLinkman;
	// 联系人电话
	private String chanceTel;
	// 机会描述
	private String chanceDesc;
	// 创建人编号
	private Integer chanceCreateId;
	// 创建日期
	private String chanceCreateDate;
	// 指派人编号
	private Integer chanceDueId;
	// 指派日期
	private String chanceDueDate;
	// 销售机会状态
	private Integer chanceStatus;

	public Integer getChanceId() {
		return chanceId;
	}

	public void setChanceId(Integer chanceId) {
		this.chanceId = chanceId;
	}

	public String getChanceSource() {
		return chanceSource;
	}

	public void setChanceSource(String chanceSource) {
		this.chanceSource = chanceSource;
	}

	public String getChanceCustName() {
		return chanceCustName;
	}

	public void setChanceCustName(String chanceCustName) {
		this.chanceCustName = chanceCustName;
	}

	public String getChanceTitle() {
		return chanceTitle;
	}

	public void setChanceTitle(String chanceTitle) {
		this.chanceTitle = chanceTitle;
	}

	public Integer getChanceRate() {
		return chanceRate;
	}

	public void setChanceRate(Integer chanceRate) {
		this.chanceRate = chanceRate;
	}

	public String getChanceLinkman() {
		return chanceLinkman;
	}

	public void setChanceLinkman(String chanceLinkman) {
		this.chanceLinkman = chanceLinkman;
	}

	public String getChanceTel() {
		return chanceTel;
	}

	public void setChanceTel(String chanceTel) {
		this.chanceTel = chanceTel;
	}

	public String getChanceDesc() {
		return chanceDesc;
	}

	public void setChanceDesc(String chanceDesc) {
		this.chanceDesc = chanceDesc;
	}

	public Integer getChanceCreateId() {
		return chanceCreateId;
	}

	public void setChanceCreateId(Integer chanceCreateId) {
		this.chanceCreateId = chanceCreateId;
	}

	public String getChanceCreateDate() {
		return chanceCreateDate;
	}

	public void setChanceCreateDate(String chanceCreateDate) {
		this.chanceCreateDate = chanceCreateDate;
	}

	public Integer getChanceDueId() {
		return chanceDueId;
	}

	public void setChanceDueId(Integer chanceDueId) {
		this.chanceDueId = chanceDueId;
	}

	public String getChanceDueDate() {
		return chanceDueDate;
	}

	public void setChanceDueDate(String chanceDueDate) {
		this.chanceDueDate = chanceDueDate;
	}

	public Integer getChanceStatus() {
		return chanceStatus;
	}

	public void setChanceStatus(Integer chanceStatus) {
		this.chanceStatus = chanceStatus;
	}

}
