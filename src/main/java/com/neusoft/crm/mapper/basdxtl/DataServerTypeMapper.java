package com.neusoft.crm.mapper.basdxtl;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neusoft.crm.entity.DataServerType;

@Mapper
public interface DataServerTypeMapper {
	@Insert("insert into dataServerType values(null,#{dstName})")
	public int insertDataServerType(DataServerType dataServerType);

	@Delete("delete from dataServerType where dstId=#{dstId}")
	public int deleteDataServerTypeById(DataServerType dataServerType);

	@Update("update dataServerType set dstName=#{dstName} where dstId=#{dstId}")
	public int updateDataServerType(DataServerType dataServerType);

	@Select("select * from dataServerType order by dstId")
	public List<DataServerType> selectDataServerTypeAll();

	@Select("select * from dataServerType where dstId=#{dstId}")
	public DataServerType selectDataServerTypeById(DataServerType dataServerType);

	public int deleteDataServerTypeBatch(int[] dstIdArr);
}
