package com.neusoft.crm.mapper.serverxtl;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.neusoft.crm.entity.ClientInfo;


@Mapper
@Repository("serverClientInfoMapper")
public interface ClientInfoMapper {
    
	@Select("select * from clientInfo order by clientCode")
	public List<ClientInfo> selectClientInfoAll();
	

	@Insert("insert into ClientInfo(clientCode,clientName,clientCustId) values(#{clientCode},#{clientName},#{clientCustId})")
	public int insertClientInfo(ClientInfo clientInfo);
}
