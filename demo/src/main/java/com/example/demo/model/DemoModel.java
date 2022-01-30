package com.example.demo.model;
import com.example.demo.model.Address;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Entity
@Component
public class DemoModel {
	@Id
	private int empid;
	private String empname;
	private String Department;
	private int salary;
	private Address address;
	
	
	public DemoModel(int empid, String empname, String department, int salary,Address address) {
		super();
		this.empid = empid;
		this.empname = empname;
		Department = department;
		this.salary = salary;
		this.address=address;
		
	}
	
	public DemoModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DemoModel [empid=" + empid + ", empname=" + empname + ", Department=" + Department + ", salary="
				+ salary + "]";
	}

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
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAdress() {
		return address;
	}

	public void setAdress(Address adress) {
		this.address = adress;
	}


}
