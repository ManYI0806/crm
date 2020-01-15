package com.neusoft.crm.mapper.basdxtl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.crm.entity.SysUser;

@Mapper
public interface SysUserMapper {

	@Select("select * from sysuser where userName=#{userName} and userPassword=#{userPassword}")
	public SysUser selectSysUserByNameByPass(SysUser sysUser);
	
	@Select("select * from sysuser where userId=#{userId}")
	public SysUser selectSysUserById(SysUser sysUser);
	
	@Select("select * from sysuser where userRoleId=3")
	public List<SysUser> selectSysUserCustMgrAll();
	
	@Select("select * from sysuser")
	public List<SysUser> selectSysUserAll();
}
