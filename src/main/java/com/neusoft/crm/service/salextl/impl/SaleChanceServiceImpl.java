package com.neusoft.crm.service.salextl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.crm.entity.SaleChance;
import com.neusoft.crm.mapper.salextl.SaleChanceMapper;
import com.neusoft.crm.service.salextl.SaleChanceService;

@Service
public class SaleChanceServiceImpl implements SaleChanceService {

	@Autowired
	private SaleChanceMapper saleChanceMapper;

	@Override
	public SaleChance selectSaleChanceById(SaleChance saleChance) {
		return saleChanceMapper.selectSaleChanceById(saleChance);
	}
	
	@Override
	public int dueSaleChance(SaleChance saleChance) {
		return saleChanceMapper.dueSaleChance(saleChance);
	}
	
	@Override
	public int selectSaleChanceCount(SaleChance saleChance) {
		return saleChanceMapper.selectSaleChanceCount(saleChance);
	}

	@Override
	public List<SaleChance> selectSaleChancePaging(SaleChance saleChance) {
		return saleChanceMapper.selectSaleChancePaging(saleChance);
	}
	
	@Override
	public int insertSaleChance(SaleChance saleChance) {
		return saleChanceMapper.insertSaleChance(saleChance);
	}
	
	@Override
	public int deleteSaleChanceById(SaleChance saleChance) {
		return saleChanceMapper.deleteSaleChanceById(saleChance);
	}
	
	@Override
	public int editSaleChance(SaleChance saleChance) {
		return saleChanceMapper.editSaleChance(saleChance);
	}
	
	@Override
	public int updateSaleChanceStatusById(SaleChance saleChance) {
		return saleChanceMapper.updateSaleChanceStatusById(saleChance);
	}
	
}
