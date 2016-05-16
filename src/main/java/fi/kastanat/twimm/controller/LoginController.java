package fi.kastanat.twimm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping (value="/kirjaudu")
public class LoginController {
	
	@RequestMapping(value="/loginpage", method = RequestMethod.GET)
	public String login(Model model) {
 
		return "kirjaudu";
 
	}
 
	@RequestMapping(value="/loginfail", method = RequestMethod.GET)
	public String loginerror(Model model) {
 
		model.addAttribute("loginerror", "true");
		return "kirjaudu";
 
	}
 
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(Model model) {

		model.addAttribute("loggedout", "true");
		return "kirjaudu";
 
	}

}
