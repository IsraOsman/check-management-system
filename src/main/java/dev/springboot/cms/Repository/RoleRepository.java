package dev.springboot.cms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.springboot.cms.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}