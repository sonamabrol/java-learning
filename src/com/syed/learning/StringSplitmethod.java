package com.syed.learning;

public class StringSplitmethod {

	public static void main(String[] args) {
		String city = "I live sun in Ashburn";
		
		String [] myStringArray = city.split("sun");
		System.out.println(myStringArray.length);
		
		for (int i=0;i<myStringArray.length;i++){
			System.out.println(myStringArray[i]);
		}
				
				
				

	}

}
