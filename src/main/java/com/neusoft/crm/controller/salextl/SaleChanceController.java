package com.neusoft.crm.controller.salextl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.crm.entity.SaleChance;
import com.neusoft.crm.service.salextl.SaleChanceService;

@RestController
public class SaleChanceController {

	@Autowired
	private SaleChanceService saleChanceService;

	@RequestMapping("/selectSaleChanceById")
	public SaleChance selectSaleChanceById(@RequestBody SaleChance saleChance) throws Exception {
		return saleChanceService.selectSaleChanceById(saleChance);
	}

	@RequestMapping("/selectSaleChanceCount")
	public int selectSaleChanceCount(@RequestBody SaleChance saleChance) throws Exception {
		System.out.println(saleChance);
		return saleChanceService.selectSaleChanceCount(saleChance);
	}

	@RequestMapping("/selectSaleChancePaging")
	public List<SaleChance> selectSaleChancePaging(@RequestBody SaleChance saleChance) throws Exception {
		System.out.println(saleChance);
		return saleChanceService.selectSaleChancePaging(saleChance);
	}

	@RequestMapping("/insertSaleChance")
	public int insertSaleChance(@RequestBody SaleChance saleChance) throws Exception {
		return saleChanceService.insertSaleChance(saleChance);
	}

	@RequestMapping("/dueSaleChance")
	public int dueSaleChance(@RequestBody SaleChance saleChance) throws Exception {
		return saleChanceService.dueSaleChance(saleChance);
	}

	@RequestMapping("/editSaleChance")
	public int editSaleChance(@RequestBody SaleChance saleChance) throws Exception {
		return saleChanceService.editSaleChance(saleChance);
	}

	@RequestMapping("/updateSaleChanceStatusById")
	public int updateSaleChanceStatusById(@RequestBody SaleChance saleChance) throws Exception {
		return saleChanceService.updateSaleChanceStatusById(saleChance);
	}

	@RequestMapping("/deleteSaleChanceById")
	public int deleteSaleChanceById(@RequestBody SaleChance saleChance) throws Exception {
		return saleChanceService.deleteSaleChanceById(saleChance);
	}

}
