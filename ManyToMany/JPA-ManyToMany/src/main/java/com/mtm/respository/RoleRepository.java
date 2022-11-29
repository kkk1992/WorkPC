package com.mtm.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtm.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    //List<Role> findByFeeLessThan(double fee);
}
