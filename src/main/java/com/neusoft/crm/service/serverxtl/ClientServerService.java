package com.neusoft.crm.service.serverxtl;

import java.util.List;

import com.neusoft.crm.entity.ClientServer;

public interface ClientServerService {
    
	public int insertClientServer(ClientServer clientServer);
	
    //	rept
	public List<ClientServer> selectClientInfoAndClientServerAll();
}
