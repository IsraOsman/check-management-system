package check.management.system.isra.osman.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import check.management.system.isra.osman.entity.Payee;
import check.management.system.isra.osman.service.PayeeService;

@Controller
public class PayeeController {
	
	@Autowired
	PayeeService payeeService;
	
	@RequestMapping("/payee-list")
    public ModelAndView payeeList() {
        List<Payee> listPayee = payeeService.listAll();
        ModelAndView mav = new ModelAndView("listpayees");
        mav.addObject("listPayee", listPayee);
        return mav;
    }
	
	@RequestMapping("/add-payee")
    public String newPayee(Map<String, Object> model) {
        Payee payee = new Payee();
        model.put("payee", payee);
        return "add-payee";
    }
	
	
	@RequestMapping(value = "/savePayee", method = RequestMethod.POST)
    public String savePayee(@ModelAttribute("payee") Payee payee) {
        payeeService.save(payee);
        return "redirect:/payee-list";
    }
	
	 @RequestMapping("/deletePayee")
	    public String deletePayee(@RequestParam long id) {
	        payeeService.delete(id);
	        return "redirect:/payee-list";       
	    }
}
