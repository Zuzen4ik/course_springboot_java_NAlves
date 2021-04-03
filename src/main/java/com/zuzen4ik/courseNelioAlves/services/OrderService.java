package com.zuzen4ik.courseNelioAlves.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuzen4ik.courseNelioAlves.entities.Order;
import com.zuzen4ik.courseNelioAlves.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List <Order> findAll() {
		return repository.findAll();
	}
	
	public Order FindById (Integer id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
