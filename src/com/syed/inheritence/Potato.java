package com.syed.inheritence;

public class Potato extends Vegetable{
	
	public String charactersticksOfPotato(){
		return "yellow color" +", create famous potato chips";
	}
	
	public String toString(){
		return "name is : "+this.getName()+", color is : "+this.getColor()+", type is : "+this.getType()+", price is : "+this.getPrice();
	}

}
 