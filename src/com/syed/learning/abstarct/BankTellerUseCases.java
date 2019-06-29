package com.syed.learning.abstarct;

public class BankTellerUseCases {
	
	/***
	 * notes :  HAS-A relationship
	 * 
	 * Here we have created syedBankTeller  object of BankTellerImplSyed class in below main method, 
	 * so now this class (BankTellerUseCases) contains this object(syedBankTeller) of the another class (i.e BankTellerImplSyed),this establishes HAS-A relationship between 
	 * these 2 different classes  BankTellerUseCases and BankTellerImplSyed
	 * 
	 * 
	 * 
	 * Object means copy of the class
	 */
	
	
	public static void main(String[] args){
	    
		BankTeller syedBankTeller = new BankTellerImplSyed();
		System.out.println(	syedBankTeller.dailyReport("I had amazing day and got lot of customers"));
		System.out.println(syedBankTeller.howManyCustomersEntrtained(200));
		System.out.println(syedBankTeller.cashAndChecksValue(8291.21, 3392.21));
		
		
		
		
	}
	

}
