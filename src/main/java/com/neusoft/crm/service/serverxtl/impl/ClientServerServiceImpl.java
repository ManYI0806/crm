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

	// rept 
	@Override
	public List<ClientServer> selectClientInfoAndClientServerAll() {
		return clientServerMapper.selectClientInfoAndClientServerAll();
	}
}