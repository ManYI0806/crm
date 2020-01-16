package com.neusoft.crm.service.salextl;

import java.util.List;

import com.neusoft.crm.entity.SalePlan;

public interface SalePlanService {
	
	public List<SalePlan> selectSalePlanAllByPlanChcId(SalePlan salePlan);
	
	public int insertSalePlan(SalePlan salePlan);
	
	public int updateSalePlanByPlanId(SalePlan salePlan);
	
	public int updateSalePlanResultById(SalePlan salePlan);
	
	public int deleteSalePlanByPlanId(SalePlan salePlan);
	
}
