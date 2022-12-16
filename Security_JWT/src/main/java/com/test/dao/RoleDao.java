package com.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.test.entity.Role;

public interface RoleDao extends CrudRepository<Role, String>{

}
