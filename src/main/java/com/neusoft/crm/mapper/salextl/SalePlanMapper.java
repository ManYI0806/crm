package com.neusoft.crm.mapper.salextl;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neusoft.crm.entity.SalePlan;

@Mapper
public interface SalePlanMapper {

	@Select("select * from salePlan where planChcId=#{planChcId}")
	public List<SalePlan> selectSalePlanAllByPlanChcId(SalePlan salePlan);
	
	@Insert("insert into salePlan values(null,#{planChcId},#{planTodo},null)")
	public int insertSalePlan(SalePlan salePlan);
	
	@Update("update salePlan set planChcId=#{planChcId}, planTodo=#{planTodo} where planId=#{planId}")
	public int updateSalePlanByPlanId(SalePlan salePlan);
	
	@Update("update salePlan set planResult=#{planResult} where planId=#{planId}")
	public int updateSalePlanResultById(SalePlan salePlan);
	
	@Delete("delete from salePlan where planId=#{planId}")
	public int deleteSalePlanByPlanId(SalePlan salePlan);
	
}
