package com.neusoft.crm.service.basdxtl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.crm.entity.DataServerType;
import com.neusoft.crm.mapper.basdxtl.DataServerTypeMapper;
import com.neusoft.crm.service.basdxtl.DataServerTypeService;

@Service
public class DataServerTypeServiceImpl implements DataServerTypeService {
	
	@Autowired
	private DataServerTypeMapper dataServerTypeMapper;

	@Override
	public int insertDataServerType(DataServerType dataServerType) {
		return dataServerTypeMapper.insertDataServerType(dataServerType);
	}

	@Override
	public int deleteDataServerTypeById(DataServerType dataServerType) {
		return dataServerTypeMapper.deleteDataServerTypeById(dataServerType);
	}

	@Override
	public int updateDataServerType(DataServerType dataServerType) {
		return dataServerTypeMapper.updateDataServerType(dataServerType);
	}

	@Override
	public List<DataServerType> selectDataServerTypeAll() {
		return dataServerTypeMapper.selectDataServerTypeAll();
	}

	@Override
	public DataServerType selectDataServerTypeById(DataServerType dataServerType) {
		return dataServerTypeMapper.selectDataServerTypeById(dataServerType);
	}

	@Override
	public int deleteDataServerTypeBatch(int[] dstIdArr) {
		return dataServerTypeMapper.deleteDataServerTypeBatch(dstIdArr);
	}

}
