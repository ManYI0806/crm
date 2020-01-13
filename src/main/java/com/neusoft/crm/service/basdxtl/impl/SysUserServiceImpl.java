package com.neusoft.crm.service.basdxtl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.crm.entity.SysUser;
import com.neusoft.crm.mapper.basdxtl.SysUserMapper;
import com.neusoft.crm.service.basdxtl.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public SysUser selectSysUserByNameByPass(SysUser sysUser) {
		return sysUserMapper.selectSysUserByNameByPass(sysUser);
	}
	
	@Override
	public SysUser selectSysUserById(SysUser sysUser) {
		return sysUserMapper.selectSysUserById(sysUser);
	}
	
	@Override
	public List<SysUser> selectSysUserCustMgrAll() {
		return sysUserMapper.selectSysUserCustMgrAll();
	}
	
}
