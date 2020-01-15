package com.neusoft.crm.service.serverxtl;

import java.util.List;

import com.neusoft.crm.entity.ClientServer;

public interface ClientServerService {

	public int insertClientServer(ClientServer clientServer);

	public List<ClientServer> selectClientServerAll();

	public List<ClientServer> selectClientServerByTerm(ClientServer clientServer);

	public int updateClientServerByAllot(ClientServer clientServer);

	public int deleteClientServer(ClientServer clientServer);

	public int selectClientServerCount();

	public List<ClientServer> selectClientServerAllInfo();
}
