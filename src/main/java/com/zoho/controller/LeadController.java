package com.zoho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zoho.entites.Lead;
import com.zoho.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	LeadService leadService;
	
	 //http://localhost:8080/create
     @RequestMapping(value="/create", method=RequestMethod.GET)
	public String viewCreateLeadForm() {
		return "create_lead";
     }
		
		@RequestMapping(value="/save", method=RequestMethod.POST)
		public String SaveOneLead(@ModelAttribute("lead")Lead lead) {
			leadService.saveLeadInformation(lead);
			return "lead_info";
			
		}
	}

