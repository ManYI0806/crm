package com.neusoft.crm.controller.serverxtl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.neusoft.crm.entity.ClientServer;
import com.neusoft.crm.service.serverxtl.ClientServerService;



@RestController("serverClientServerController")
public class ClientServerController {
    
	@Autowired
	@Qualifier("serverClientServerService")
	private ClientServerService clientServerService;
	
	@RequestMapping("/insertClientServerjh")
	public int insertClientServer(@RequestBody ClientServer clientServer) {
		return clientServerService.insertClientServer(clientServer);
	}
    
    //rept
	@RequestMapping("/selectClientInfoAndClientServerAll")
	public List<ClientServer> selectClientInfoAndClientServerAll() throws Exception{
		return clientServerService.selectClientInfoAndClientServerAll();
	}
}
