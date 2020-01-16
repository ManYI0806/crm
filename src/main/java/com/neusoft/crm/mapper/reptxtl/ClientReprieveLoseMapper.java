package com.neusoft.crm.mapper.reptxtl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.crm.entity.ClientReprieveLose;

@Mapper
public interface ClientReprieveLoseMapper {
	
	public List<ClientReprieveLose> selectClientReprieveLoseAll();

}
