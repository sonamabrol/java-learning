package com.sun.employee;

public class Employee {
	
	private String name;
	private Integer grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
	public String toString(){
		return this.name+" grade is : " +this.grade;
		
		
	}
	
	
	
	
	
	
	

}
