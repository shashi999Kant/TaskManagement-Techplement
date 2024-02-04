package com.task.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.task.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
