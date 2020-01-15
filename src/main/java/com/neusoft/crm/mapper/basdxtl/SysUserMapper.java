package com.neusoft.crm.mapper.basdxtl;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neusoft.crm.entity.SysUser;

@Mapper
public interface SysUserMapper {

	@Select("select * from sysuser where userName=#{userName} and userPassword=#{userPassword}")
	public SysUser selectSysUserByNameByPass(SysUser sysUser);

	@Select("select * from sysuser where userId=#{userId}")
	public SysUser selectSysUserById(SysUser sysUser);

	@Select("select * from sysuser where userRoleId=3")
	public List<SysUser> selectSysUserCustMgrAll();

	public List<SysUser> selectSysUserAll();

	public int selectSysUserCount(SysUser sysUser);

	public List<SysUser> selectSysUserPaging(SysUser sysUser);

	public int deleteSysUserBatch(int[] sysUserArr);
	
	@Update("update SysUser set userName=#{userName},userPassword=#{userPassword},userRoleId=#{userRoleId},daId=#{daId} where userId=#{userId}")
	public int updateSysUser(SysUser sysUser);
	
	@Delete("delete from SysUser where userId=#{userId}")
	public int deleteSysUserById(SysUser sysUser);
	
	@Insert("insert into SysUser (userId,userName,userPassword,userRoleId,daId) values(null,#{userName},1234,#{userRoleId},#{daId})")
	public int insertSysUser(SysUser sysUser);
	
	
}
