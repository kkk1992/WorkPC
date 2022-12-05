package com.test.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.RoleDao;
import com.test.entity.Role;
import com.test.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleDao roleDao;
	
	@Override
	public Role createNewRole(Role role) {
		
	return roleDao.save(role); 
	}
	
	
}
