package dev.springboot.cms.controller;

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

import dev.springboot.cms.entity.BankAccount;
import dev.springboot.cms.entity.User;
import dev.springboot.cms.service.BankAccountService;
import dev.springboot.cms.service.UserService;
import dev.springboot.cms.service.UserServiceImpl;

@Controller
public class BankAccountController {

	@Autowired
	BankAccountService accountService;
	
	@Autowired 
	UserServiceImpl userService;
	
	@RequestMapping("/accounts")
    public ModelAndView accountList() {
        List<BankAccount> listAccount = accountService.listAll();
        ModelAndView mav = new ModelAndView("add-account");
        mav.addObject("listAccount", listAccount);
        return mav;
    }
	
	@RequestMapping("/add-new-account")
    public String newAccountForm(Map<String, Object> model) {
        BankAccount account = new BankAccount();
        
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
          String username = ((UserDetails)principal).getUsername();
          User user = userService.findByUsername(username);
          account.setUser(user);
  
        } else {
          String username = principal.toString();
          
        }
        model.put("account", account);
        return "new-account";
    }
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveAccount(@ModelAttribute("account") BankAccount account) {
        accountService.save(account);
        return "redirect:/accounts";
    }
	
	 @RequestMapping("/delete")
	    public String deleteAccount(@RequestParam long id) {
	        accountService.delete(id);
	        return "redirect:/accounts";       
	    }
	
}
