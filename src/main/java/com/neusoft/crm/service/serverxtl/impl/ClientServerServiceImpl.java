package com.neusoft.crm.service.serverxtl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.neusoft.crm.entity.ClientServer;
import com.neusoft.crm.mapper.serverxtl.ClientServerMapper;
import com.neusoft.crm.service.serverxtl.ClientServerService;


@Service("serverClientServerService")
public class ClientServerServiceImpl implements ClientServerService {
    
	@Autowired
	@Qualifier("serverClientServerMapper")
	private ClientServerMapper clientServerMapper;

	@Override
	public int insertClientServer(ClientServer clientServer) {
		return clientServerMapper.insertClientServer(clientServer);
	}

	@Override
	public List<ClientServer> selectClientServerAll() {
		// TODO Auto-generated method stub
		return clientServerMapper.selectClientServerAll();
	}

	@Override
	public List<ClientServer> selectClientServerByTerm(ClientServer clientServer) {
		// TODO Auto-generated method stub
		return clientServerMapper.selectClientServerByTerm(clientServer);
	}

	@Override
	public int updateClientServerByAllot(ClientServer clientServer) {
		// TODO Auto-generated method stub
		return clientServerMapper.updateClientServerByAllot(clientServer);
	}

	@Override
	public int deleteClientServer(ClientServer clientServer) {
		// TODO Auto-generated method stub
		return clientServerMapper.deleteClientServer(clientServer);
	}

	@Override
	public int selectClientServerCount() {
		// TODO Auto-generated method stub
		return clientServerMapper.selectClientServerCount();
	}

	@Override
	public List<ClientServer> selectClientServerAllInfo() {
		// TODO Auto-generated method stub
		return clientServerMapper.selectClientServerAllInfo();
	}
}
