package com.zuzen4ik.courseNelioAlves.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuzen4ik.courseNelioAlves.entities.User;
import com.zuzen4ik.courseNelioAlves.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List <User> findAll() {
		return repository.findAll();
	}
	
	public User FindById (Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}