package check.management.system.isra.osman.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import check.management.system.isra.osman.entity.BankAccount;
import check.management.system.isra.osman.entity.User;
import check.management.system.isra.osman.service.BankAccountService;
import check.management.system.isra.osman.service.UserService;
import check.management.system.isra.osman.service.UserServiceImpl;

//controller class for my Bankaaccount handling methods 
@Controller
public class BankAccountController {

	@Autowired
	BankAccountService accountService;
	
	@Autowired 
	UserServiceImpl userService;
	
	//this annotation map the incoming url /accounts request to this method 
	//and the method use the accountService to listAll accounts in the database and return add-aacount jsp page 
	@RequestMapping("/accounts")
    public ModelAndView accountList() {
        List<BankAccount> listAccount = accountService.listAll();
        ModelAndView mav = new ModelAndView("add-account");
        mav.addObject("listAccount", listAccount);
        return mav;
    }
	
	//this annotation map the incoming url /accounts request to this method 
	//and this method call the put method from the account service class and save the account to the database 
	@RequestMapping("/add-new-account")
    public String newAccountForm(Map<String, Object> model) {
        BankAccount account = new BankAccount();
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = ((UserDetails)principal).getUsername();
        User user = userService.findByUsername(username);
        account.setUser(user);
        model.put("account", account);
        return "new-account";
    }
	
	//presist new account to the database 
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveAccount(@ModelAttribute("account") BankAccount account) {
        accountService.save(account);
        return "redirect:/accounts";
    }
	
	//delete an exisitng account from the database 

	 @RequestMapping("/delete")
	    public String deleteAccount(@RequestParam long id) {
	        accountService.delete(id);
	        return "redirect:/accounts";       
	  }
	
	 
	 //update an existing account infos
	 @RequestMapping("/edit")
	    public ModelAndView editAccount(@RequestParam long id) {
	        ModelAndView mav = new ModelAndView("edit-account");
	        BankAccount account = accountService.get(id);
	        mav.addObject("account", account);
	        return mav;
	  }
	 
}
