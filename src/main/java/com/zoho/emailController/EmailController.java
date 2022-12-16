package com.zoho.emailController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class EmailController{
       
	@RequestMapping(value="/compose", method=RequestMethod.POST)
	public String composeEmail(@RequestParam("email") String email, Model model) {
		model.addAttribute("email", "email"); 
		return "compose";
		
	}
}
