package com.neusoft.crm.controller.reptxtl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.crm.entity.ClientReprieveLose;
import com.neusoft.crm.service.reptxtl.ClientReprieveLoseService;

@RestController
public class ClientReprieveLoseController {

	@Autowired
	private ClientReprieveLoseService clientReprieveLoseService;

	@RequestMapping("/selectClientReprieveLoseAll")
	public List<ClientReprieveLose> selectClientReprieveLoseAll() throws Exception {
		return clientReprieveLoseService.selectClientReprieveLoseAll();
	}

}
