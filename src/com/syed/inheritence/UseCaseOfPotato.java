package com.syed.inheritence;

public class UseCaseOfPotato {
	
	public static void main(String[] args){
		
		Potato potato = new Potato();
		
		potato.setName("POTATO");
		potato.setColor("Yellow");
		potato.setPrice(2);
		potato.setType("regular");
		
		Potato pt2 = new Potato();		

		pt2.setName("POTATO 2");
		pt2.setColor("White");
		pt2.setPrice(6);
		pt2.setType("seasonal");		
		
				
		System.out.println(pt2+", charactersticks are : "+pt2.charactersticksOfPotato());

		System.out.println(potato+", charactersticks are : "+potato.charactersticksOfPotato());
		

		
		
		
	}

}
