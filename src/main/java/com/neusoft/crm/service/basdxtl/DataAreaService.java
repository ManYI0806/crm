package com.neusoft.crm.service.basdxtl;

import java.util.List;

import com.neusoft.crm.entity.DataArea;

public interface DataAreaService {
	
	public int insertDataArea(DataArea dataArea);
	public int deleteDataArea(DataArea dataArea);
	public int updateDataArea(DataArea dataArea);
	public List<DataArea> selectDataAreaAll();
	public DataArea selectDataAreaById(DataArea dataArea);
	public int deleteDataAreaBatch(int[] daIdArr);
}
