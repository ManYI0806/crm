package com.neusoft.crm.service.basdxtl;

import java.util.List;

import com.neusoft.crm.entity.SysUser;

public interface SysUserService {

	public SysUser selectSysUserByNameByPass(SysUser sysUser);
	
	public SysUser selectSysUserById(SysUser sysUser);

	public List<SysUser> selectSysUserCustMgrAll();
	
	public List<SysUser> selectSysUserAll();
	   
    public int selectSysUserCount(SysUser sysUser);
	
    public List<SysUser> selectSysUserPaging(SysUser sysUser);

	public int deleteSysUserBatch(int[] sysUserArr);
	
	public int updateSysUser(SysUser sysUser);
	
	public int deleteSysUserById(SysUser sysUser);
	
	public int insertSysUser(SysUser sysUser);
}
