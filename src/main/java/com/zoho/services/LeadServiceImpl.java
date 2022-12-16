package com.zoho.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entites.Lead;
import com.zoho.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepo;
	@Override
	public void saveLeadInformation(Lead lead) {
            leadRepo.save(lead);
		
	}
                
	  
}
