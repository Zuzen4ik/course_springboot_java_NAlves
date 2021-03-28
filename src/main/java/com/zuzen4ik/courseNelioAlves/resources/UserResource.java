package com.zuzen4ik.courseNelioAlves.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zuzen4ik.courseNelioAlves.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1,"maria", "maria@gmail.com", "111111", "12345");
		return ResponseEntity.ok().body(u);
	}

}
