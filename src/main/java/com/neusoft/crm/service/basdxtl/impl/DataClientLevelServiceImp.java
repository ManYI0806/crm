package com.neusoft.crm.service.basdxtl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.crm.entity.DataClientLevel;
import com.neusoft.crm.mapper.basdxtl.DataClientLevelMapper;
import com.neusoft.crm.service.basdxtl.DataClientLevelService;

@Service
public class DataClientLevelServiceImp implements DataClientLevelService {

	@Autowired
	private DataClientLevelMapper dataClientLevelMapper;

	@Override
	public int insertDataClientLevel(DataClientLevel dataClientLevel) {
		return dataClientLevelMapper.insertDataClientLevel(dataClientLevel);
	}

	@Override
	public int deleteDataClientLevel(DataClientLevel dataClientLevel) {
		return dataClientLevelMapper.deleteDataClientLevel(dataClientLevel);
	}

	@Override
	public int updateNewsType(DataClientLevel dataClientLevel) {
		return dataClientLevelMapper.updateNewsType(dataClientLevel);
	}

	@Override
	public List<DataClientLevel> selectDataClientLevelAll() {
		return dataClientLevelMapper.selectDataClientLevelAll();
	}



}
