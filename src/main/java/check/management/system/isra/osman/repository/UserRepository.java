package check.management.system.isra.osman.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import check.management.system.isra.osman.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}