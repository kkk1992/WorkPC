package com.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.demo.exception.ResourceNotFoundException;
import com.demo.model.Role;
import com.demo.model.User;
import com.demo.payload.AppConstants;
import com.demo.repository.RoleRepository;
import com.demo.repository.UserRepository;
import com.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;

	
	@Override
	public User getUserById(long id) {
	
		return this.userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User", "User Id", id));
	}

	@Override
	public List<User> getAllUsers() {
	
		List<User> listUsers= new ArrayList<>();
		
		return this.userRepository.findAll();
	}

	@Override
	public User saveUser(User user) {
		
		return this.userRepository.save(user);
	}

	@Override
	public void deleteUser(long id) {
		this.userRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User", "User Id", id));
		
		this.userRepository.deleteById(id);
		
		
	}

	@Override
	public User updateUser(User user, long id) {
		
		User existingUser = this.userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User", "User Id", id));
		
		existingUser.setUserName(user.getUserName());
		existingUser.setEmail(user.getEmail());
		existingUser.setPassword(user.getPassword());
		existingUser.setRoles(user.getRoles());
	
		userRepository.save(existingUser);
		
		return existingUser;
	}

	@Override
	public User registerNewUser(User user) {
		
		
		Role role = this.roleRepository.findById(AppConstants.NORMAL_USER).get();

		user.getRoles().add(role);

		User newUser = this.userRepository.save(user);

		return newUser;
	}

}
