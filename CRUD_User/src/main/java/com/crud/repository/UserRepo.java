package com.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

	User findByEmail(String username);

}
