package com.laedapplication.services;

import org.springframework.stereotype.Service;

import com.laedapplication.entities.Lead;
import com.laedapplication.repositries.LeadmarketRepository;
@Service
public class LeadMarketServiceImpl implements LeadMarketService {
	
	private LeadmarketRepository leadrepo;

	@Override
	public void saveLead(Lead lead) {

		leadrepo.save(lead);
	}

}
