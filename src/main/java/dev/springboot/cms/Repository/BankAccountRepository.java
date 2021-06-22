package dev.springboot.cms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.springboot.cms.entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

}
