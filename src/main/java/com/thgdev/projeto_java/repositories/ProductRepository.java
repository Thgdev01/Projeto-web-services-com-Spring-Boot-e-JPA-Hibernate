package com.thgdev.projeto_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thgdev.projeto_java.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
