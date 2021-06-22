package dev.springboot.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.springboot.cms.Repository.ChequeRepository;
import dev.springboot.cms.entity.Cheque;


@Service
public class ChequeService {

	@Autowired ChequeRepository repo; 
	
	 public void save(Cheque cheque) {
	        repo.save(cheque);
	    }
	     
	    public List<Cheque> listAll() {
	        return (List<Cheque>) repo.findAll();
	    }
	     
	    public Cheque get(Long id) {
	        return repo.findById(id).get();
	    }
	     
	    @Transactional
	    public void delete(Long id) {
	        repo.deleteById(id);
	    }
	
	
}
