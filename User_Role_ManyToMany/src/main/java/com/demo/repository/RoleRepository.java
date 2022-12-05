package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
