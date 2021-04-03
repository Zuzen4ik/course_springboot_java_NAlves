package com.zuzen4ik.courseNelioAlves.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuzen4ik.courseNelioAlves.entities.Category;
import com.zuzen4ik.courseNelioAlves.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List <Category> findAll() {
		return repository.findAll();
	}
	
	public Category FindById (Integer id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
