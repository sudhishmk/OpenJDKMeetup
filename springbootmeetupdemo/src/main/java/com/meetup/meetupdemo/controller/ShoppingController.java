package com.meetup.meetupdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meetup.meetupdemo.model.Product;
import com.meetup.meetupdemo.services.OrderService;

@RestController
public class ShoppingController {
	
	private OrderService orderService;

	@Autowired
	public ShoppingController(OrderService orderService) {
		this.orderService = orderService;
	}

	@GetMapping("/products")
	public List getProducts() {
		return orderService.findAll();
	}

	@PostMapping("/products")
	public Product save(@RequestBody Product product) {
		return (Product) orderService.save(product);
	}
	
	@DeleteMapping("/products/{productId}")
	public void remove(@PathVariable Long productId) {
		 orderService.remove(productId);
		
	}

}
