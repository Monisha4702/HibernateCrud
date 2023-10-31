package com.deeptech.hibernate.work2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee 
{
	@Id//responsible for creating constraints as primary key
	@GeneratedValue(strategy=GenerationType.SEQUENCE)//responsible for auto increment
	@Column(name="E_empID")
	private int empid;
	
	@Column(name="E_empName")
   private String empname;
	
	@Column(name="E_empDesig")
   private String designation;
	
	@Column(name="E_empSalary")
	private int salary;
	
	//Generate getter and setter method

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
   
}
