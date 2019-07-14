package com.sun.empoyee;

import java.util.ArrayList;
import java.util.List;

import com.sun.employee.Employee;

public class Department {

	private String name;
	private Integer budget;
	private List<Employee> listOfEmployees = new ArrayList<>();
	
	public Department(){
		this.budget=50000;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getBudget() {
		return budget;
	}
    
	public void addEmployees(Employee employee){
		
		if(employee.getGrade()>=5){
			this.budget=this.budget +100000;
		}else if(employee.getGrade()<5){
			this.budget += 75000;
		}
		this.listOfEmployees.add(employee);
	
	}
	
	@Override
	public String toString(){
		
		return "Department name is :"+this.name + ",  budget is : "+this.budget
				+", Employees in this department are : "+this.listOfEmployees;
		
	}
	
	
	
}








