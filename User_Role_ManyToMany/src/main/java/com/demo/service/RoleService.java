package com.demo.service;

import java.util.List;

import com.demo.model.Role;

public interface RoleService {

	Role getRoleById(long id);
	
	List<Role> getAllRoles();
	
	Role saveRole(Role role);
	
	void deleteRole(long id);
	
	Role updateRole(Role role, long id);
}
