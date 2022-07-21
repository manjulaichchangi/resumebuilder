package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.model.EmployeeProject;

public interface EmployeeProjectRepository extends JpaRepository<EmployeeProject,String> {

	

}
