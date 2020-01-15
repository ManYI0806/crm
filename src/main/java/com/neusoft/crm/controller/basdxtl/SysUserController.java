package com.neusoft.crm.controller.basdxtl;

import java.util.List;

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
	
	@RequestMapping("/selectSysUserById")
	public SysUser selectSysUserById(@RequestBody SysUser sysUser) throws Exception {
		return sysUserService.selectSysUserById(sysUser);
	}
	
	@RequestMapping("/selectSysUserCustMgrAll")
	public List<SysUser> selectSysUserCustMgrAll() throws Exception{
		return sysUserService.selectSysUserCustMgrAll();
	}
	
	@RequestMapping("/selectSysUserAll")
	public List<SysUser> selectSysUserAll() throws Exception{
		return sysUserService.selectSysUserAll();
	}
	
	@RequestMapping("/selectSysUserCount")
	public int selectSysUserCount(@RequestBody SysUser sysUser) throws Exception{
		return sysUserService.selectSysUserCount(sysUser);
	}
	
	@RequestMapping("/selectSysUserPaging")
	public List<SysUser> selectSysUserPaging(@RequestBody SysUser sysUser) throws Exception{
		System.out.println(sysUser.getUserName());
		return sysUserService.selectSysUserPaging(sysUser);
	}
	
	@RequestMapping("/deleteSysUserBatch")
	public int deleteSysUserBatch(@RequestBody int[] sysUserArr) throws Exception{
		return sysUserService.deleteSysUserBatch(sysUserArr);
	}
	
	@RequestMapping("/updateSysUser")
	public int updateSysUser(@RequestBody SysUser sysUser) throws Exception{
		return sysUserService.updateSysUser(sysUser);
	}
	
	@RequestMapping("/deleteSysUserById")
	public int deleteSysUserById(@RequestBody SysUser sysUser) throws Exception{
		return sysUserService.deleteSysUserById(sysUser);
	}
	
	@RequestMapping("/insertSysUser")
	public int insertSysUser(@RequestBody SysUser sysUser) throws Exception{
		return sysUserService.insertSysUser(sysUser);
	}

}
