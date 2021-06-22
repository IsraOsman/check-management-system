package dev.springboot.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.springboot.cms.Repository.PayeeRepository;
import dev.springboot.cms.entity.Payee;

@Service 
public class PayeeService {

	@Autowired
	PayeeRepository repo;
	
	public void save(Payee payee) {
        repo.save(payee);
    }
	
	 public List<Payee> listAll() {
	        return (List<Payee>) repo.findAll();
	 }
	 
	 public Payee get(Long id) {
	        return repo.findById(id).get();
	 }
	     
	    @Transactional
	 public void delete(Long id) {
	     repo.deleteById(id);
	 }
}
