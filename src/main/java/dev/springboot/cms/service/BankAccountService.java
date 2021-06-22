package dev.springboot.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.springboot.cms.Repository.BankAccountRepository;
import dev.springboot.cms.entity.BankAccount;


@Service
public class BankAccountService {

	@Autowired BankAccountRepository repo;
     
    public void save(BankAccount account) {
        repo.save(account);
    }
     
    public List<BankAccount> listAll() {
        return (List<BankAccount>) repo.findAll();
    }
     
    public BankAccount get(Long id) {
        return repo.findById(id).get();
    }
     
    @Transactional
    public void delete(Long id) {
        repo.deleteById(id);
    }
    
    
}
