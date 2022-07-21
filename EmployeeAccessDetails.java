package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeAccessDetails {
	@Id
	private String accessid;
	private String token;
	private String username;
	private String password;
	private String empid;
	@Override
	public String toString() {
		return "EmployeeAccessDetails [accessid=" + accessid + ", token=" + token + ", username=" + username
				+ ", password=" + password + ", empid=" + empid + "]";
	}
	
}
