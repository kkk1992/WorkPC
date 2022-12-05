package com.crud.service;

import java.util.List;

import com.crud.model.User;

public interface UserService {

	//get single user
	User getUser(long id);
	
	//get all users
	List<User> getAllUserList();
	
	//save user
	User saveUser(User user);
	
	//delete user
	void deleteUser (long id);
	
	//update user
	User updateUser(User user, long id);
	
}
