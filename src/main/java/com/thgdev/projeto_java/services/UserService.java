package com.thgdev.projeto_java.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thgdev.projeto_java.entities.User;
import com.thgdev.projeto_java.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> userId = repository.findById(id);
		return userId.get();
	}
	
	
}
