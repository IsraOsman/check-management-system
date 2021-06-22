package dev.springboot.cms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.springboot.cms.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}