package com.syed.inheritence;

public interface Building extends Parking, Location{
	
	public String buildingType();
	public String color();
	public String shape();
	public Integer price();

}
