package com.syed.learning.abstarct;

public abstract class BankTeller {
	
	public String dailyReport(String str){
		return str;
	}
	
	public int howManyCustomersEntrtained(int i){
		System.out.println("parent class method");
		return i;
	}
	
	public abstract double cashAndChecksValue(double b, double a);

}
