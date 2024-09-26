package com.thgdev.projeto_java.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thgdev.projeto_java.entities.Order;
import com.thgdev.projeto_java.repositories.OrderRepository;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderRepository orderRepository;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> obj = orderRepository.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Order>> findById(@PathVariable Long id){
		Optional<Order> obj = orderRepository.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
