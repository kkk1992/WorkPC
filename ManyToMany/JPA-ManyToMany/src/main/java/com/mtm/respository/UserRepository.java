package com.mtm.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtm.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByNameContaining(String name);
}
