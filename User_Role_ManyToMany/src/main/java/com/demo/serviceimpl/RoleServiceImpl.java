package com.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.exception.ResourceNotFoundException;
import com.demo.model.Role;
import com.demo.model.User;
import com.demo.repository.RoleRepository;
import com.demo.repository.UserRepository;
import com.demo.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public Role getRoleById(long id) {
	
		return this.roleRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Role", "Role Id", id));
	}

	@Override
	public List<Role> getAllRoles() {
	
		List<Role> listRole= new ArrayList<Role>();
		
		listRole=roleRepository.findAll();
		
		return listRole;
	}

	@Override
	public Role saveRole(Role role) {
		
		return roleRepository.save(role);
	}

	@Override
	public void deleteRole(long id) {
		
		this.roleRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Role", "Role Id", id));
	}

	@Override
	public Role updateRole(Role role, long id) {
		
		Role existingRole= this.roleRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Role", "Role Id", id));
		
		existingRole.setRoleName(role.getRoleName());
		
		this.roleRepository.save(existingRole);
		
		return existingRole;
		
		
	}

	

}
