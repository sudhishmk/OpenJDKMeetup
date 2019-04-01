package com.meetup.meetupdemo.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meetup.meetupdemo.model.Product;

public interface OrderDao extends JpaRepository<Product, Long>{

}
