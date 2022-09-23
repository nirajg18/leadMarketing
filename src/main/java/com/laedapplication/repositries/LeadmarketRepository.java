package com.laedapplication.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laedapplication.entities.Lead;

public interface LeadmarketRepository extends JpaRepository<Lead, Long> {

}
