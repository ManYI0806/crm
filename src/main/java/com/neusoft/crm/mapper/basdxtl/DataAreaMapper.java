package com.neusoft.crm.mapper.basdxtl;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neusoft.crm.entity.DataArea;

@Mapper
public interface DataAreaMapper {
	

		@Insert("insert into dataArea values(null,#{daName})")
		public int insertDataArea(DataArea dataArea);

		@Delete("delete from dataArea where daId=#{daId}")
		public int deleteDataArea(DataArea dataArea);

		@Update("update dataArea set daName=#{daName} where daId=#{daId}")
		public int updateDataArea(DataArea dataArea);

		@Select("select * from dataArea order by daId")
		public List<DataArea> selectDataAreaAll();

		@Select("select * from dataArea where daId=#{daId}")
		public DataArea selectDataAreaById(DataArea dataArea);

		public int deleteDataAreaBatch(int[] daIdArr);
	}


