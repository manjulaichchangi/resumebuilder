package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.EmployeeProject;
import com.example.repository.EmployeeProjectRepository;

@Service
public class EmployeeProjectService {

	@Autowired
	private EmployeeProjectRepository prorepo;
	
	public void save(EmployeeProject project) {
	prorepo.save(project);
	}
	
}
