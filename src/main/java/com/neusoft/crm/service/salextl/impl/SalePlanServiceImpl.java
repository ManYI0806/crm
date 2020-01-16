package com.neusoft.crm.service.salextl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.crm.entity.SalePlan;
import com.neusoft.crm.mapper.salextl.SalePlanMapper;
import com.neusoft.crm.service.salextl.SalePlanService;

@Service
public class SalePlanServiceImpl implements SalePlanService {
	
	@Autowired
	private SalePlanMapper salePlanMapper;

	@Override
	public List<SalePlan> selectSalePlanAllByPlanChcId(SalePlan salePlan) {
		return salePlanMapper.selectSalePlanAllByPlanChcId(salePlan);
	}
	
	@Override
	public int insertSalePlan(SalePlan salePlan) {
		return salePlanMapper.insertSalePlan(salePlan);
	}
	
	@Override
	public int updateSalePlanByPlanId(SalePlan salePlan) {
		return salePlanMapper.updateSalePlanByPlanId(salePlan);
	}
	
	@Override
	public int updateSalePlanResultById(SalePlan salePlan) {
		return salePlanMapper.updateSalePlanResultById(salePlan);
	}
	
	@Override
	public int deleteSalePlanByPlanId(SalePlan salePlan) {
		return salePlanMapper.deleteSalePlanByPlanId(salePlan);
	}
	
}
