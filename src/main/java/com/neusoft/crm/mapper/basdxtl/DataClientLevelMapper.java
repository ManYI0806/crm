package com.neusoft.crm.mapper.basdxtl;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neusoft.crm.entity.DataClientLevel;

@Mapper
public interface DataClientLevelMapper {

	@Insert("insert into dataClientLevel values(null,#{dclName})")
	public int insertDataClientLevel(DataClientLevel dataClientLevel);

	@Delete("delete from dataClientLevel where dclId=#{dclId}")
	public int deleteDataClientLevelById(DataClientLevel dataClientLevel);

	@Update("update dataClientLevel set dclName=#{dclName} where dclId=#{dclId}")
	public int updateDataClientLevel(DataClientLevel dataClientLevel);

	@Select("select * from dataClientLevel order by dclId")
	public List<DataClientLevel> selectDataClientLevelAll();

	@Select("select * from dataClientLevel where dclId=#{dclId}")
	public DataClientLevel selectDataClientLevelById(DataClientLevel dataClientLevel);
	
	public int deleteDataClientLevelBatch(int [] dclIdArr); 
}
