package com.mtm.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtm.entity.User;
import com.mtm.respository.RoleRepository;
import com.mtm.respository.UserRepository;

@RestController
@RequestMapping("/user/role")
public class UserRoleController {

    private UserRepository userRepository;

    private RoleRepository roleRepository;

 

    public UserRoleController(UserRepository userRepository, RoleRepository roleRepository) {
		super();
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
	}

	@PostMapping("/save")
    public User saveUserWithRole(@RequestBody User user){
      return   userRepository.save(user);
    }

    @GetMapping
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/{userId}")
    public User findUser(@PathVariable Long userId){
        return userRepository.findById(userId).orElse(null);
    }
    
  

}
