package com.neusoft.crm.controller.basdxtl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.crm.entity.SysUser;
import com.neusoft.crm.service.basdxtl.SysUserService;

@RestController
public class SysUserController {

	@Autowired
	private SysUserService sysUserService;

	@RequestMapping("/selectSysUserByNameByPass")
	public SysUser selectSysUserByNameByPass(@RequestBody SysUser sysUser) throws Exception {
		return sysUserService.selectSysUserByNameByPass(sysUser);
	}
}
