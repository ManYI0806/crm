package com.neusoft.crm.service.basdxtl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.crm.entity.DataClientLevel;
import com.neusoft.crm.mapper.basdxtl.DataClientLevelMapper;
import com.neusoft.crm.service.basdxtl.DataClientLevelService;

@Service
public class DataClientLevelServiceImpl implements DataClientLevelService {

	@Autowired
	private DataClientLevelMapper dataClientLevelMapper;

	@Override
	public int insertDataClientLevel(DataClientLevel dataClientLevel) {
		return dataClientLevelMapper.insertDataClientLevel(dataClientLevel);
	}

	@Override
	public int deleteDataClientLevelById(DataClientLevel dataClientLevel) {
		return dataClientLevelMapper.deleteDataClientLevelById(dataClientLevel);
	}

	@Override
	public int updateDataClientLevel(DataClientLevel dataClientLevel) {
		return dataClientLevelMapper.updateDataClientLevel(dataClientLevel);
	}

	@Override
	public List<DataClientLevel> selectDataClientLevelAll() {
		return dataClientLevelMapper.selectDataClientLevelAll();
	}

	@Override
	public DataClientLevel selectDataClientLevelById(DataClientLevel dataClientLevel) {
		return dataClientLevelMapper.selectDataClientLevelById(dataClientLevel);
	}

	@Override
	public int deleteDataClientLevelBatch(int[] dclIdArr) {
		return dataClientLevelMapper.deleteDataClientLevelBatch(dclIdArr);
	}

    //rept
	@Override
	public List<DataClientLevel> selectClientInfoAndDataClientLevelAll() {
		return dataClientLevelMapper.selectClientInfoAndDataClientLevelAll();
	}

}
