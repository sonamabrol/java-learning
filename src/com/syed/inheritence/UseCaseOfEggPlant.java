package com.syed.inheritence;

public class UseCaseOfEggPlant{
	
	public static void main(String[]args){
		
		Vegetable ep = new EggPlant();
		
		ep.setColor("Purple");
		ep.setName("EggPl");
		ep.setPrice(12);
		ep.setType("regular");
		
		System.out.println(ep);
		
	}
	
	

}
