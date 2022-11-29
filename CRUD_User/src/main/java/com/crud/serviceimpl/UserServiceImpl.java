package com.crud.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.exceptions.ResourceNotFoundException;
import com.crud.model.User;
import com.crud.repository.UserRepo;
import com.crud.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	//get single product
	@Override
	public User getUser(long id) {

		return userRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("User", "Id", id));
		
	}

	//get all products
	@Override
	public List<User> getAllUserList() {
		List<User> list = new ArrayList<>();
		
		list= userRepo.findAll();
		
		return list;
	}
	
	//save product
	@Override
	public User saveUser(User user) {
	
		return userRepo.save(user);
	}

	//delete product
	@Override
	public void deleteUser(long id) {
		
		userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Product", "Id", id));
		
		userRepo.deleteById(id);
	}

	//update product
	@Override
	public User updateUser(User newUser, long id) {
	
		User oldUser= userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Product", "Id", id));
		
		oldUser.setUserName(newUser.getUsername());
		oldUser.setEmail(newUser.getEmail());
		oldUser.setPassword(newUser.getPassword());
		
		userRepo.save(oldUser);
		
		return oldUser;
		
	}



}
