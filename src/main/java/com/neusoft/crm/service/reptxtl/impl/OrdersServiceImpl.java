package com.neusoft.crm.service.reptxtl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.crm.entity.Orders;
import com.neusoft.crm.mapper.reptxtl.OrdersMapper;
import com.neusoft.crm.service.reptxtl.OrdersService;


@Service
public class OrdersServiceImpl implements OrdersService {
	
	@Autowired
	private OrdersMapper ordersMapper;

	@Override
	public List<Orders> selectClientInfoAndOrdersAll() {
		return ordersMapper.selectClientInfoAndOrdersAll();
	}

	/*@Override
	public int selectOrdersCount(Orders orders) {
		return ordersMapper.selectOrdersCount(orders);
	}

	@Override
	public List<Orders> selectOrdersPaging(Orders orders) {
		return ordersMapper.selectOrdersPaging(orders);
	}*/

	
}
