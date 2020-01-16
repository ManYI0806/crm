package com.neusoft.crm.mapper.reptxtl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.crm.entity.Orders;



@Mapper
public interface OrdersMapper {
	
	public List<Orders> selectClientInfoAndOrdersAll();
	
	/*//下面两个方法专用于分页
	public int selectOrdersCount(Orders orders);
	public List<Orders> selectOrdersPaging(Orders orders);*/

}
