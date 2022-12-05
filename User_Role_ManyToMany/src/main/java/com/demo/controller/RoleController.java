package com.demo.controller;

import java.util.ArrayList;
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

import com.demo.model.Role;
import com.demo.model.User;
import com.demo.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Role> getRoleById(@PathVariable long id){
		
		return new ResponseEntity<Role>(this.roleService.getRoleById(id), HttpStatus.OK);
	}
	
	@GetMapping("/getall")
	public List<Role> getAllRoles(){
		List<Role> roleList= new ArrayList<>();
		roleList= roleService.getAllRoles();
		
		return roleList;
	}
	
	@PostMapping("/save")
	public ResponseEntity<Role> saveRole(@RequestBody Role role){
		
		return new ResponseEntity<Role>(this.roleService.saveRole(role), HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Role> updateRole(@RequestBody Role role, @PathVariable long id){
		
		return new ResponseEntity<Role>(this.roleService.updateRole(role, id), HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deleteRole(@PathVariable long id){
		this.roleService.deleteRole(id);
		return new ResponseEntity<String>("Role deleted successfully",HttpStatus.OK);
		
	}
}
