package com.neusoft.crm.mapper.serverxtl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.neusoft.crm.entity.ClientServer;
import com.neusoft.crm.entity.DataServerType;


@Mapper
@Repository("serverDataServerTypeMapper")
public interface DataServerTypeMapper {
    
	@Select("select * from dataServerType order by dstId")
	public List<DataServerType> selectDataServerTypeAll();
	
	
    //rept
	public List<ClientServer> selectDataServerTypeAndClientServerAll();
}
