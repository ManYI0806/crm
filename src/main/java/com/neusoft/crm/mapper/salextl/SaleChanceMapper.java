package com.neusoft.crm.mapper.salextl;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neusoft.crm.entity.SaleChance;

@Mapper
public interface SaleChanceMapper {

	@Select("select * from SaleChance where chanceId=#{chanceId}")
	public SaleChance selectSaleChanceById(SaleChance saleChance);
	
	//模糊查询分页的记录数
	public int selectSaleChanceCount(SaleChance saleChance);
	
	//模糊查询的分页的结果集
	public List<SaleChance> selectSaleChancePaging(SaleChance saleChance);
	
	public int insertSaleChance(SaleChance saleChance);

	@Update("update SaleChance set chanceDueId=#{chanceDueId},chanceDueDate=#{chanceDueDate},chanceStatus=1 where chanceId=#{chanceId}")
	public int dueSaleChance(SaleChance saleChance);
	
	public int editSaleChance(SaleChance saleChance);
	
	@Update("update SaleChance set chanceStatus=#{chanceStatus} where chanceId=#{chanceId}")
	public int updateSaleChanceStatusById(SaleChance saleChance);
	
	@Delete("delete from SaleChance where chanceId=#{chanceId}")
	public int deleteSaleChanceById(SaleChance saleChance);
}
