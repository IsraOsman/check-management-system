package dev.springboot.cms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.springboot.cms.entity.Payee;

public interface PayeeRepository extends JpaRepository<Payee, Long>{

}