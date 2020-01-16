package com.neusoft.crm.service.reptxtl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.crm.entity.ClientReprieveLose;
import com.neusoft.crm.mapper.reptxtl.ClientReprieveLoseMapper;
import com.neusoft.crm.service.reptxtl.ClientReprieveLoseService;

@Service
public class ClientReprieveLoseServiceImpl implements ClientReprieveLoseService {

	@Autowired
	private ClientReprieveLoseMapper clientReprieveLoseMapper;

	@Override
	public List<ClientReprieveLose> selectClientReprieveLoseAll() {
		return clientReprieveLoseMapper.selectClientReprieveLoseAll();
	}

}
