package com.neusoft.crm.controller.serverxtl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.crm.entity.ClientInfo;
import com.neusoft.crm.service.serverxtl.ClientInfoService;



@RestController("serverClientInfoController")
public class ClientInfoController {
    
	@Autowired
	@Qualifier("serverClientInfoService")
	private ClientInfoService clientInfoService;
	
	@RequestMapping("/selectClientInfoAlljh")
	public List<ClientInfo> selectClientInfoAll() {
		return clientInfoService.selectClientInfoAll();
	}
	
}
