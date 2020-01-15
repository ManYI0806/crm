package com.neusoft.crm.controller.salextl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.crm.entity.SalePlan;
import com.neusoft.crm.service.salextl.SalePlanService;

@RestController
public class SalePlanController {

	@Autowired
	private SalePlanService salePlanService;

	@RequestMapping("/selectSalePlanAllByPlanChcId")
	public List<SalePlan> selectSalePlanAllByPlanChcId(@RequestBody SalePlan salePlan) throws Exception {
		return salePlanService.selectSalePlanAllByPlanChcId(salePlan);
	}

	@RequestMapping("/insertSalePlan")
	public int insertSalePlan(@RequestBody SalePlan salePlan) throws Exception {
		return salePlanService.insertSalePlan(salePlan);
	}

	@RequestMapping("/updateSalePlanByPlanId")
	public int updateSalePlanByPlanId(@RequestBody SalePlan salePlan) throws Exception {
		return salePlanService.updateSalePlanByPlanId(salePlan);
	}
	
	@RequestMapping("/updateSalePlanResultById")
	public int updateSalePlanResultById(@RequestBody SalePlan salePlan) throws Exception {
		return salePlanService.updateSalePlanResultById(salePlan);
	}

	@RequestMapping("/deleteSalePlanByPlanId")
	public int deleteSalePlanByPlanId(@RequestBody SalePlan salePlan) throws Exception {
		return salePlanService.deleteSalePlanByPlanId(salePlan);
	}

}
