package com.demo.service;

import java.util.List;

import com.demo.model.User;

public interface UserService {

	User registerNewUser(User user);
	
	User getUserById(long id);
	
	List<User> getAllUsers();
	
	User saveUser(User user);
	
	void deleteUser(long id);
	
	User updateUser(User user, long id);
}




