package com.demo.controller;

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

import com.demo.model.User;
import com.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/get/{id}")
	public ResponseEntity<User> getUserById(@PathVariable long id){
		
		return new ResponseEntity<User>(this.userService.getUserById(id), HttpStatus.OK);
	}
	
	@GetMapping("/getall")
	public List<User> getAllUsers(){
		List<User> userList= this.userService.getAllUsers();
		return userList;
	}
	
	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		
		return new ResponseEntity<User>(this.userService.saveUser(user), HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable long id){
		
		return new ResponseEntity<User>(this.userService.updateUser(user, id), HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable long id){
		this.userService.deleteUser(id);
		return new ResponseEntity<String>("User deleted successfully",HttpStatus.OK);
		
	}
	@PostMapping("/register")
	public ResponseEntity<User> registerNewUser(@RequestBody User user){
		
		return new ResponseEntity<>(this.userService.registerNewUser(user),HttpStatus.OK);
	}
}
