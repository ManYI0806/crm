package com.neusoft.crm.controller.basdxtl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.crm.entity.DataClientLevel;
import com.neusoft.crm.service.basdxtl.DataClientLevelService;

@RestController
public class DataClientLevelController {

	@Autowired
	private DataClientLevelService dataClientLevelService;

	@RequestMapping("/insertDataClientLevel")
	public int insertDataClientLevel(@RequestBody DataClientLevel dataClientLevel) throws Exception {
		return dataClientLevelService.insertDataClientLevel(dataClientLevel);
	}

	@RequestMapping("/deleteDataClientLevel")
	public int deleteDataClientLevel(@RequestBody DataClientLevel dataClientLevel) throws Exception {
		return dataClientLevelService.deleteDataClientLevelById(dataClientLevel);
	}

	@RequestMapping("/updateDataClientLevel")
	public int updateDataClientLevel(@RequestBody DataClientLevel dataClientLevel) throws Exception {
		return dataClientLevelService.updateDataClientLevel(dataClientLevel);
	}

	@RequestMapping("selectDataClientLevelAll")
	public List<DataClientLevel> selectDataClientLevelAll() throws Exception {
		return dataClientLevelService.selectDataClientLevelAll();
	}

	@RequestMapping("/selectDataClientLevelById")
	public DataClientLevel selectDataClientLevelById(@RequestBody DataClientLevel dataClientLevel) throws Exception {
		return dataClientLevelService.selectDataClientLevelById(dataClientLevel);
	}
	
	@RequestMapping("/deleteDataClientLevelBatch")
	public int deleteDataClientLevelBatch(@RequestBody int[] dclIdArr) throws Exception {
		return dataClientLevelService.deleteDataClientLevelBatch(dclIdArr);
	}
}