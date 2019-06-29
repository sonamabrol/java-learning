package com.syed.learning.abstarct;

public class BankTellerImplSyed extends BankTeller {
   
	/***
	 * notes :   IS-A relationship
	 * 
	 * Here BankTellerImplSyed extends BankTeller(abstract class), that means BankTellerImplSyed is kind of 
	 * BankTeller, that said BankTellerImplSyed is child of the BankTeller class.
	 * 
	 * 
	 */
	
	
	
	@Override
	public double cashAndChecksValue(double b, double a) {
		// TODO Auto-generated method stub
		return b+a;
	}
	
	//@Override
	public int howManyCustomersEntrtained(int i){
		System.out.println("child class method");
		return i+100;
	} 

}
