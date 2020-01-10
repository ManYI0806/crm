package com.neusoft.crm.entity;

//销售机会执行计划项表
public class SalePlan {

	// 销售机会执行计划编号
	private Integer planId;
	// 所属销售机会编号
	private Integer planChcId;
	// 执行内容
	private String planTodo;
	// 执行结果
	private String planResult;

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public Integer getPlanChcId() {
		return planChcId;
	}

	public void setPlanChcId(Integer planChcId) {
		this.planChcId = planChcId;
	}

	public String getPlanTodo() {
		return planTodo;
	}

	public void setPlanTodo(String planTodo) {
		this.planTodo = planTodo;
	}

	public String getPlanResult() {
		return planResult;
	}

	public void setPlanResult(String planResult) {
		this.planResult = planResult;
	}

}
