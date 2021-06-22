package dev.springboot.cms.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dev.springboot.cms.entity.BankAccount;
import dev.springboot.cms.entity.Cheque;
import dev.springboot.cms.entity.Payee;
import dev.springboot.cms.service.BankAccountService;
import dev.springboot.cms.service.ChequeService;
import dev.springboot.cms.service.PayeeService;

@Controller
public class ChequeController {

	
	@Autowired ChequeService chequeService;
	
	@Autowired PayeeService payeeService;
	
	@Autowired BankAccountService accountService;
	
	
	 @GetMapping("/write-check")
	    public String writeCheck(Map<String, Object> model) {
		 Cheque cheque = new Cheque();
		 List<Payee> payeeList = payeeService.listAll();
		 List<BankAccount> accountList = accountService.listAll();
		 model.put("accountList", accountList);
		 model.put("payeeList", payeeList);
		 model.put("cheque", cheque);
	    	return "write-check";
	  }
	 
		@RequestMapping("/cheques")
	    public ModelAndView accountList() {
	        List<Cheque> listCheque = chequeService.listAll();
	        ModelAndView mav = new ModelAndView("add-account");
	        mav.addObject("listCheque", listCheque);
	        return mav;
	    }
		
		
		@RequestMapping("/checks")
		public String printCheck(Cheque checkModel) {
			return "check";
		}
		
}
