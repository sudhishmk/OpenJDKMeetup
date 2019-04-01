package com.meetup.meetupdemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meetup.meetupdemo.dataaccess.OrderDao;
import com.meetup.meetupdemo.model.Product;

@Service
public class OrderService {
	
	private OrderDao orderDao;

	@Autowired
	public OrderService(OrderDao orderDao) {
		super();
		this.orderDao = orderDao;
	}

	public List findAll() {
		// TODO Auto-generated method stub
		
		return orderDao.findAll();
	}

	public Product save(Product product) {
		// TODO Auto-generated method stub
		return orderDao.save(product);
	}

	public void remove(Long productId) {
		// TODO Auto-generated method stub
		 orderDao.deleteById(productId);
	}

}
