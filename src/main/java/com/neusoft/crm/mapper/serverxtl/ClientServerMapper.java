package com.neusoft.crm.mapper.serverxtl;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.neusoft.crm.entity.ClientServer;

@Mapper
@Repository("serverClientServerMapper")
public interface ClientServerMapper {
	
	public int insertClientServer(ClientServer clientServer);
public List<ClientServer> selectClientServerAll();
	
	//模糊查询客户服务表
	public List<ClientServer> selectClientServerByTerm(ClientServer clientServer);
	
	//分配
	@Update("update clientServer set serverDueId=#{serverDueId} where serverId=#{serverId} ")
	public int updateClientServerByAllot(ClientServer clientServer);
	
	//删除
	@Delete("delete from clientServer where serverId=#{serverId}")
	public int deleteClientServer(ClientServer clientServer);
	
	//查询clientServer的数据总数
    @Select("select count(*) from clientServer")
    public int selectClientServerCount();
    
    //服务处理第二个全查询界面
    public List<ClientServer> selectClientServerAllInfo();
}
