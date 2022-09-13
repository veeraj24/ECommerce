
package com.ecommerce.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.dao.OrdersDao;
import com.ecommerce.entities.Orders;

@Service
public class OrdersServiceImpl implements OrdersService{
	
	@Autowired
	private OrdersDao ordersDao;

	@Override
	public Orders createOrders(Orders orders) {
		ordersDao.save(orders);
		return orders;
	}

	@Override
	public List<Orders> getOrders() {
		return ordersDao.findAll();
	}


	@Override
	public void deleteOrders(int order_id) {
		Orders ord=ordersDao.getOne(order_id);
		ordersDao.delete(ord);
	}

	@Override
	public Orders updateOrders(Orders orders) {
		ordersDao.save(orders);
		return orders;
	}

	@Override
	public Orders getOrderByID(int order_id) {
		return ordersDao.getOne(order_id);
	}

	@Override
	public Orders addOrders(Orders orders) {
		ordersDao.save(orders);
		return orders;
	}


	
}
