package com.zuzen4ik.courseNelioAlves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zuzen4ik.courseNelioAlves.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
