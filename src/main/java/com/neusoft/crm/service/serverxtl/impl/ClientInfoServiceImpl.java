package com.neusoft.crm.service.serverxtl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.neusoft.crm.entity.ClientInfo;
import com.neusoft.crm.mapper.serverxtl.ClientInfoMapper;
import com.neusoft.crm.service.serverxtl.ClientInfoService;


@Service("serverClientInfoService")
public class ClientInfoServiceImpl implements ClientInfoService {

	@Autowired
	@Qualifier("serverClientInfoMapper")
	private ClientInfoMapper clientInfoMapper;
	
	@Override
	public List<ClientInfo> selectClientInfoAll() {
		return clientInfoMapper.selectClientInfoAll();
	}

}
