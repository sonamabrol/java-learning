package com.syed.inheritence;

public class EggPlant extends Vegetable{
	@Override
	public boolean isGoodForCurry(){
		return false;
	}
	
	public String charactersticksOfPotato(){
		return "purple color" +", create famous curry";
	}
	
	public String toString(){
		return "name is : "+this.getName()+", color is : "+this.getColor()+",\n type is : "
				 +this.getType()+", price is : "+this.getPrice() +", is good for curry : " + this.isGoodForCurry();
	}
	
}



 