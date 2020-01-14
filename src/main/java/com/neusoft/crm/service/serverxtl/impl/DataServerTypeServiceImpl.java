package com.neusoft.crm.service.serverxtl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.neusoft.crm.entity.DataServerType;
import com.neusoft.crm.mapper.serverxtl.DataServerTypeMapper;
import com.neusoft.crm.service.serverxtl.DataServerTypeService;


@Service("serverDataServerTypeService")
public class DataServerTypeServiceImpl implements DataServerTypeService {
    
	@Autowired
	@Qualifier("serverDataServerTypeMapper")
	private DataServerTypeMapper dataServerTypeMapper;
	
	@Override
	public List<DataServerType> selectDataServerTypeAll() {
		return dataServerTypeMapper.selectDataServerTypeAll();
	}

}
