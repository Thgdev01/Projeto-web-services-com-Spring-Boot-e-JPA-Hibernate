package com.thgdev.projeto_java.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thgdev.projeto_java.entities.Order;
import com.thgdev.projeto_java.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> orderId = orderRepository.findById(id);
		return orderId.get();
	}
}
