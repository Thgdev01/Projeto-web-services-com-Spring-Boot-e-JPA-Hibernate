package com.thgdev.projeto_java.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thgdev.projeto_java.entities.Category;
import com.thgdev.projeto_java.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	
	public Category findById(Long id){
		Optional<Category> categoryId = categoryRepository.findById(id);
		return categoryId.get();
	}
}
