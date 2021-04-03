package com.zuzen4ik.courseNelioAlves.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuzen4ik.courseNelioAlves.entities.Product;
import com.zuzen4ik.courseNelioAlves.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List <Product> findAll() {
		return repository.findAll();
	}
	
	public Product FindById (Integer id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
