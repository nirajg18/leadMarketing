package com.laedapplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.laedapplication.entities.Lead;


@Controller
public class LeadmarketController {
	
	@Autowired
	
	
	@RequestMapping("/createLead")
	public String viewMarketLead() {
		return "new_lead";
	}
	@RequestMapping("/saveMkt")
	public String saveLeadMarket(@ModelAttribute("hello") Lead lead) {
		System.out.println(lead.getFirstName());
		System.out.println(lead.getLastName());
		System.out.println(lead.getEmail());
		System.out.println(lead.getMobile());
		
		return "new_lead";
	}

}
