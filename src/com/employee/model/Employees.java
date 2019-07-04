package com.employee.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import com.openxava.naviox.model.*;

@Entity
@View(members="employeeId;"
        + "employeeName;"
		+ "employeeDesignation;"
        + "employeeSalary;"
		+ "Experiences {"
		+ 	 "experiences;"
		+ " };"
		+ "Notes {"
		+ 	 "notes;"
		+ " };"
	)	
public class Employees extends Identifiable {

	private String employeeId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@DescriptionsList
	private User employeeName;
	
	private String employeeDesignation;
	
	private Double employeeSalary;
	
	@OneToMany(orphanRemoval=true, fetch=FetchType.LAZY)
	@ListProperties("companyName, startDate, endDate, designation")
	private Collection<Experiences> experiences = new ArrayList<Experiences>();
	
	@OneToMany(orphanRemoval=true, fetch=FetchType.LAZY)
	@ListProperties("name, createdDate, remarks")
	private Collection<Notes> notes = new ArrayList<Notes>();

	// Getter and Setter
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public User getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(User employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public Double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Collection<Experiences> getExperiences() {
		return experiences;
	}

	public void setExperiences(Collection<Experiences> experiences) {
		this.experiences = experiences;
	}

	public Collection<Notes> getNotes() {
		return notes;
	}

	public void setNotes(Collection<Notes> notes) {
		this.notes = notes;
	}
}
