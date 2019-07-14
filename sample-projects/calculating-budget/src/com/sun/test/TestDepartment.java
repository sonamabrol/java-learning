package com.sun.test;

import com.sun.employee.Employee;
import com.sun.empoyee.Department;

public class TestDepartment {

	public static void main(String[]args){
	Employee emp1 = new Employee();
	
	emp1.setName("Alex");
	emp1.setGrade(4);
	
	Employee emp2= new Employee();
	
	emp2.setName("Linda");
	emp2.setGrade(5);
	
	Employee emp3= new Employee();
	
	emp3.setName("Joe");
	emp3.setGrade(6);
	
	Employee emp4= new Employee();
	
	emp4.setName("James");
	emp4.setGrade(5);
	
	Employee emp5 = new Employee();
	
	emp5.setName("Heggy");
	emp5.setGrade(4);
	
	Department sales = new Department();
	sales.setName("Sales Department");
	sales.addEmployees(emp1);
	sales.addEmployees(emp2);
	sales.addEmployees(emp3);
	
	Department It = new Department();
	It.setName("IT Department");
	It.addEmployees(emp4);
	It.addEmployees(emp5);
	
	System.out.println(sales);
	System.out.println(It);
	
	
	
	
	
	
	
	
	}
	
	
}
