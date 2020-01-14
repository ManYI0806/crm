package com.neusoft.crm.controller.basdxtl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.crm.entity.DataArea;
import com.neusoft.crm.service.basdxtl.DataAreaService;

@RestController
public class DataAreaController {

	@Autowired
	private DataAreaService dataAreaService;

	@RequestMapping("/insertDataArea")
	public int insertDataArea(@RequestBody DataArea dataArea) throws Exception {
		return dataAreaService.insertDataArea(dataArea);
	}

	@RequestMapping("/deleteDataArea")
	public int deleteDataArea(@RequestBody DataArea dataArea) throws Exception {
		return dataAreaService.deleteDataArea(dataArea);
	}

	@RequestMapping("/updateDataArea")
	public int updateDataArea(@RequestBody DataArea dataArea) throws Exception {
		return dataAreaService.updateDataArea(dataArea);
	}

	@RequestMapping("selectDataAreaAll")
	public List<DataArea> selectDataAreaAll() throws Exception {
		return dataAreaService.selectDataAreaAll();
	}

	@RequestMapping("/selectDataAreaById")
	public DataArea selectDataAreaById(@RequestBody DataArea dataArea) throws Exception {
		return dataAreaService.selectDataAreaById(dataArea);
	}
	
	@RequestMapping("/deleteDataAreaBatch")
	public int deleteDataAreaBatch(@RequestBody int[] daIdArr) throws Exception {
		return dataAreaService.deleteDataAreaBatch(daIdArr);
	}
}