package com.neusoft.crm.service.basdxtl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.crm.entity.DataArea;
import com.neusoft.crm.mapper.basdxtl.DataAreaMapper;
import com.neusoft.crm.service.basdxtl.DataAreaService;

@Service
public class DataAreaServiceImpl implements DataAreaService {

	@Autowired
	public DataAreaMapper dataAreaMapper;
	
	@Override
	public int insertDataArea(DataArea dataArea) {
		return dataAreaMapper.insertDataArea(dataArea);
	}

	@Override
	public int deleteDataArea(DataArea dataArea) {
		return dataAreaMapper.deleteDataArea(dataArea);
	}

	@Override
	public int updateDataArea(DataArea dataArea) {
		return dataAreaMapper.updateDataArea(dataArea);
	}

	@Override
	public List<DataArea> selectDataAreaAll() {
		return dataAreaMapper.selectDataAreaAll();
	}

	@Override
	public DataArea selectDataAreaById(DataArea dataArea) {
		return dataAreaMapper.selectDataAreaById(dataArea);
	}

	@Override
	public int deleteDataAreaBatch(int[] daIdArr) {
		return dataAreaMapper.deleteDataAreaBatch(daIdArr);
	}

}
