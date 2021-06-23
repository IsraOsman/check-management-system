package check.management.system.isra.osman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import check.management.system.isra.osman.entity.Payee;
import check.management.system.isra.osman.repository.PayeeRepository;

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
