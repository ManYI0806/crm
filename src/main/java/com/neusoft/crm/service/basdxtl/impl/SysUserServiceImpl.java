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

	@Override
	public List<SysUser> selectSysUserAll() {
		return sysUserMapper.selectSysUserAll();
	}

	@Override
	public int selectSysUserCount(SysUser sysUser) {
		return sysUserMapper.selectSysUserCount(sysUser);
	}

	@Override
	public List<SysUser> selectSysUserPaging(SysUser sysUser) {
		return sysUserMapper.selectSysUserPaging(sysUser);
	}

	@Override
	public int deleteSysUserBatch(int[] sysUserArr) {
		return sysUserMapper.deleteSysUserBatch(sysUserArr);
	}

	@Override
	public int updateSysUser(SysUser sysUser) {
		return sysUserMapper.updateSysUser(sysUser);
	}

	@Override
	public int deleteSysUserById(SysUser sysUser) {
		return sysUserMapper.deleteSysUserById(sysUser);
	}

	@Override
	public int insertSysUser(SysUser sysUser) {
		return sysUserMapper.insertSysUser(sysUser);
	}
	
}
