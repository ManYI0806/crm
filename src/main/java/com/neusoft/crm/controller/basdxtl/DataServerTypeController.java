package com.neusoft.crm.controller.basdxtl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.crm.entity.ClientServer;
import com.neusoft.crm.entity.DataServerType;
import com.neusoft.crm.service.basdxtl.DataServerTypeService;

@RestController
public class DataServerTypeController {

	@Autowired
	private DataServerTypeService dataServerTypeService;

	@RequestMapping("/insertDataServerType")
	public int insertDataServerType(@RequestBody DataServerType dataServerType) throws Exception {
		return dataServerTypeService.insertDataServerType(dataServerType);
	}

	@RequestMapping("/deleteDataServerType")
	public int deleteDataServerType(@RequestBody DataServerType dataServerType) throws Exception {
		return dataServerTypeService.deleteDataServerTypeById(dataServerType);
	}

	@RequestMapping("/updateDataServerType")
	public int updateDataServerType(@RequestBody DataServerType dataServerType) throws Exception {
		return dataServerTypeService.updateDataServerType(dataServerType);
	}

	@RequestMapping("selectDataServerTypeAll")
	public List<DataServerType> selectDataServerTypeAll() throws Exception {
		return dataServerTypeService.selectDataServerTypeAll();
	}

	@RequestMapping("/selectDataServerTypeById")
	public DataServerType selectDataServerTypeById(@RequestBody DataServerType dataServerType) throws Exception {
		return dataServerTypeService.selectDataServerTypeById(dataServerType);
	}

	@RequestMapping("/deleteDataServerTypeBatch")
	public int deleteDataServerTypeBatch(@RequestBody int[] dstIdArr) throws Exception {
		return dataServerTypeService.deleteDataServerTypeBatch(dstIdArr);
	}
	
    //rept
	@RequestMapping("/selectDataServerTypeAndClientServerAll")
	public List<ClientServer> selectDataServerTypeAndClientServerAll() throws Exception{
		return dataServerTypeService.selectDataServerTypeAndClientServerAll();
	}
}
