package dev.springboot.cms.service;

import dev.springboot.cms.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}