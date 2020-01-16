package com.neusoft.crm.service.salextl;

import java.util.List;

import com.neusoft.crm.entity.SaleChance;

public interface SaleChanceService {
	
	public SaleChance selectSaleChanceById(SaleChance saleChance);
	
	public int selectSaleChanceCount(SaleChance saleChance);

	public List<SaleChance> selectSaleChancePaging(SaleChance saleChance);
	
	public int insertSaleChance(SaleChance saleChance);
	
	public int dueSaleChance(SaleChance saleChance);
	
	public int editSaleChance(SaleChance saleChance);
	
	public int updateSaleChanceStatusById(SaleChance saleChance);
	
	public int deleteSaleChanceById(SaleChance saleChance);
	
}
