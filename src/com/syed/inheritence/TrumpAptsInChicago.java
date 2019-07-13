package com.syed.inheritence;

public class TrumpAptsInChicago implements Building{

	@Override
	public String buildingType() {
		String floors = "10 Floors Apartment";	
		return floors;
	}

	@Override
	public String color() {
		String color = "this is multi color building";
		return color;
	}

	@Override
	public String shape() {
		String shapeOfTheApartmentBuilding = "rectangle";
		return shapeOfTheApartmentBuilding;
	}

	@Override
	public Integer price() {
		Integer price = 10000;
		return price;
	}
/*
	@Override
	public String parkingType(String type) {
		return "Vallet";
	}

	@Override
	public String spaceType(String spaceType) {
		return "Garrage";
	}
*/

	@Override
	public String parkingType(String type) {
		return "Garrage";
	}

	@Override
	public String spaceType(String spaceType) {
		// TODO Auto-generated method stub
		return "1 car space";
	}

	@Override
	public Integer parkingPrice() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String locationAddress() {
		// TODO Auto-generated method stub
		return "5th street Washington D.C";
	}

	@Override
	public String countryName() {
		// TODO Auto-generated method stub
		return "USA";
	}

}
