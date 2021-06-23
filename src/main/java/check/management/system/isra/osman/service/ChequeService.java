package check.management.system.isra.osman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import check.management.system.isra.osman.entity.Cheque;
import check.management.system.isra.osman.repository.ChequeRepository;


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
