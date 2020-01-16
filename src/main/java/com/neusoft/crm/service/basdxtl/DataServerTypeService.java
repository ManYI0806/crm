package com.neusoft.crm.service.basdxtl;

import java.util.List;

import com.neusoft.crm.entity.ClientServer;
import com.neusoft.crm.entity.DataServerType;

public interface DataServerTypeService {
	public int insertDataServerType(DataServerType dataServerType);
	public int deleteDataServerTypeById(DataServerType dataServerType);
	public int updateDataServerType(DataServerType dataServerType);
	public List<DataServerType> selectDataServerTypeAll();
	public DataServerType selectDataServerTypeById(DataServerType dataServerType);
	public int deleteDataServerTypeBatch(int [] dstIdArr); 
	//	rept
	public List<ClientServer> selectDataServerTypeAndClientServerAll();
}
