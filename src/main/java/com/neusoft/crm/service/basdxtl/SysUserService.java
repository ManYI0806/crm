package com.neusoft.crm.service.basdxtl;

import java.util.List;

import com.neusoft.crm.entity.SysUser;

public interface SysUserService {

	public SysUser selectSysUserByNameByPass(SysUser sysUser);
	
	public SysUser selectSysUserById(SysUser sysUser);

	public List<SysUser> selectSysUserCustMgrAll();
}
