package com.neusoft.crm.mapper.serverxtl;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.neusoft.crm.entity.ClientServer;

@Mapper
@Repository("serverClientServerMapper")
public interface ClientServerMapper {
	
	public int insertClientServer(ClientServer clientServer);
}
