package com.employee.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Experiences extends Identifiable {

	private String companyName;
	
	private Date startDate;
	
	private Date endDate;
	
	private String designation;
	
	@ManyToOne
	private Employees employees;

	//Getter and Setter
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Employees getEmployees() {
		return employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}
	
	
}
