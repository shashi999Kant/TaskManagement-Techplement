package com.task.service;

import com.task.entities.User;

public interface UserService {
    User findByUsername(String username);
    User createUser(User user);
    User findUserById(Long id);
}
