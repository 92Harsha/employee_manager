package com.employee.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import com.openxava.naviox.model.*;

@Entity
public class Notes extends Identifiable {
	
	@Column(length=100)
	private String name;
	
	@ManyToOne(optional=false, fetch=FetchType.LAZY)
	@DescriptionsList
	@DefaultValueCalculator(CurrentUserCalculator.class)
	private User user;
	
	@ReadOnly
	@DefaultValueCalculator(CurrentDateCalculator.class)
	private Date createdDate;
	
	@Stereotype("SIMPLE_HTML_TEXT")
	@Column(columnDefinition="TEXT")
	private String remarks;

	@ManyToOne
	private Employees employees;

   // Getter and Setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Employees getEmployees() {
		return employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}
}
