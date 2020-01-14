package com.neusoft.crm.service.basdxtl;

import java.util.List;

import com.neusoft.crm.entity.DataClientLevel;

public interface DataClientLevelService {
               
	public int insertDataClientLevel(DataClientLevel dataClientLevel);
	public int deleteDataClientLevelById(DataClientLevel dataClientLevel);
	public int updateDataClientLevel(DataClientLevel dataClientLevel);
	public List<DataClientLevel> selectDataClientLevelAll();
	public DataClientLevel selectDataClientLevelById(DataClientLevel dataClientLevel);
	public int deleteDataClientLevelBatch(int [] dclIdArr); 
}
