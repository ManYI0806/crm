package com.neusoft.crm.controller.serverxtl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.crm.entity.DataServerType;
import com.neusoft.crm.service.serverxtl.DataServerTypeService;



@RestController("serverDataServerTypeController")
public class DataServerTypeController {
    
	@Autowired
	@Qualifier("serverDataServerTypeService")
	private DataServerTypeService dataServerTypeService;
	
	@RequestMapping("/selectDataServerTypeAlljh")
	public List<DataServerType> selectDataServerTypeAllServer() {
		return dataServerTypeService.selectDataServerTypeAll();
	}
	
}
