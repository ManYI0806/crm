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

	@RequestMapping("/selectClientServerAll")
	public List<ClientServer> selectClientServerAll() {
		return clientServerService.selectClientServerAll();
	}

	@RequestMapping("/selectClientServerByTerm")
	public List<ClientServer> selectClientServerByTerm(@RequestBody ClientServer clientServer) {

		return clientServerService.selectClientServerByTerm(clientServer);
	}

	@RequestMapping("/updateClientServerByAllot")
	public int updateClientServerByAllot(@RequestBody ClientServer clientServer) {
		System.out.println("serverID" + clientServer.getServerId());
		return clientServerService.updateClientServerByAllot(clientServer);
	}

	@RequestMapping("/deleteClientServer")
	public int deleteClientServer(@RequestBody ClientServer clientServer) {
		return clientServerService.deleteClientServer(clientServer);
	}

	@RequestMapping("/selectClientServerCount")
	public int selectClientServerCount() {
		return clientServerService.selectClientServerCount();
	}

	@RequestMapping("/selectClientServerAllInfo")
	public List<ClientServer> selectClientServerAllInfo() {
		return clientServerService.selectClientServerAllInfo();
	}
}
