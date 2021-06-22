package dev.springboot.cms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.springboot.cms.entity.Cheque;

public interface ChequeRepository extends JpaRepository <Cheque, Long>{

}
