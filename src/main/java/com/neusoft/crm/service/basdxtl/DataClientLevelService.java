package com.neusoft.crm.service.basdxtl;

import java.util.List;

import com.neusoft.crm.entity.DataClientLevel;

public interface DataClientLevelService {
               
	public int insertDataClientLevel(DataClientLevel dataClientLevel);
	public int deleteDataClientLevel(DataClientLevel dataClientLevel);
	public int updateNewsType(DataClientLevel dataClientLevel);
	public List<DataClientLevel> selectDataClientLevelAll();
}
