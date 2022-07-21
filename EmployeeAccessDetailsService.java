package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.EmployeeAccessDetailsRepository;

@Service
public class EmployeeAccessDetailsService {

	@Autowired
	private EmployeeAccessDetailsRepository accessrepo;
}
