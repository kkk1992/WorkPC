package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.User;
import com.crud.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	//get single user
	@GetMapping("/{id}")
	public ResponseEntity<User> getUser(@PathVariable(value="id") long id){
		return new ResponseEntity<User>(userService.getUser(id),HttpStatus.OK);
	}
	
	//get all users
	@GetMapping("/getall")
	public List<User> getAllUsers(){
		List<User> listUser =userService.getAllUserList();
		
		return listUser;
	}
	
	//save product
	@PostMapping("/save")
	public ResponseEntity<User> saveProduct( @RequestBody User user){
		
		return new ResponseEntity<User>(userService.saveUser(user),HttpStatus.CREATED);
	}
	
	//update product
	@PutMapping("/update/{id}")
		public ResponseEntity<User> updateProduct(@PathVariable long id, @RequestBody User user){
			
			return new ResponseEntity<User>(userService.updateUser(user, id), HttpStatus.OK);
		}
	
	
	//delete user
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable(value="id") long userId){
		
		userService.deleteUser(userId);
		
		return new ResponseEntity<>("User Deleted Successfully", HttpStatus.OK);
	}
}
