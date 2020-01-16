package com.neusoft.crm.controller.reptxtl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.crm.entity.Orders;
import com.neusoft.crm.service.reptxtl.OrdersService;

@RestController
public class OrdersController {

	@Autowired
	private OrdersService ordersService;

	@RequestMapping("/selectClientInfoAndOrdersAll")
	public List<Orders> selectClientInfoAndOrdersAll() throws Exception {
		return ordersService.selectClientInfoAndOrdersAll();
	}

	/*
	 * @RequestMapping("selectOrdersCount") public int selectOrdersCount(Orders
	 * orders) throws Exception{ return ordersService.selectOrdersCount(orders); }
	 * 
	 * @RequestMapping("") public List<Orders> selectOrdersPaging(Orders orders)
	 * throws Exception{ return ordersService.selectOrdersPaging(orders); }
	 */
}
