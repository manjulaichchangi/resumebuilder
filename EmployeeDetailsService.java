package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.EmployeeDetailsRepository;

@Service
public class EmployeeDetailsService {

	@Autowired
	private EmployeeDetailsRepository emprepo;
}
