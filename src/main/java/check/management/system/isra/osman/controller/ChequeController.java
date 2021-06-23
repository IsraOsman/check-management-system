package check.management.system.isra.osman.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import check.management.system.isra.osman.entity.BankAccount;
import check.management.system.isra.osman.entity.Cheque;
import check.management.system.isra.osman.entity.Payee;
import check.management.system.isra.osman.entity.User;
import check.management.system.isra.osman.service.BankAccountService;
import check.management.system.isra.osman.service.ChequeService;
import check.management.system.isra.osman.service.PayeeService;
import check.management.system.isra.osman.service.UserService;

@Controller
public class ChequeController {

	
	@Autowired ChequeService chequeService;
	
	@Autowired PayeeService payeeService;
	
	@Autowired BankAccountService accountService;
	
	@Autowired UserService userService;
	
	
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
	     ModelAndView mav = new ModelAndView("history");
	     mav.addObject("listCheque", listCheque);
	     return mav;
	 }
	
	@RequestMapping("/check")
	public String printCheck(Cheque checkModel) {
		return "check";
	}
	
	@RequestMapping(value = "/saveCheque", method = RequestMethod.POST)
	public String saveAccount(@ModelAttribute("cheque") Cheque cheque) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = ((UserDetails)principal).getUsername();
        User user = userService.findByUsername(username);
        cheque.setUser(user);
		chequeService.save(cheque);
	    return "redirect:/check";
	 }
		
}
