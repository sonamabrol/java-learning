package com.syed.learning.interfaces;

public class CalculatorUseCases {
	
	  public static void main(String[] args){
    	
		  Calculator cal = new CalculatorImplWithExtra20();
		  
		  int g = 2, t=4;
		  
		  System.out.println("multiply : " +cal.multiply(g,t)+" "+
				  "addition : " +cal.sum(g,t));
   
    }

}
