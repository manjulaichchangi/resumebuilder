package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.model.EmployeeAccessDetails;

public interface EmployeeAccessDetailsRepository extends JpaRepository<EmployeeAccessDetails,String> {

}
