package com.thgdev.projeto_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thgdev.projeto_java.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
