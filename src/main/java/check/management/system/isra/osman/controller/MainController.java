package check.management.system.isra.osman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	  @GetMapping("/")
	    public String home() {
	    	return "home";
	    }
	  
	   @GetMapping({"/welcome"})
	    public String welcome(Model model) {
	        return "welcome";
	    }
	   
}
