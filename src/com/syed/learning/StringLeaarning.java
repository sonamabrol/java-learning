package com.syed.learning;

public class StringLeaarning {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is set of characters( ex: "12345 my street name")
		
		String myString = "I Am Developer"; // This is string literal
		
		String myNewString = new String("I Am Developer");// This is string object (do not use in production)This is less efficient and consume more memory space
		
		//compare 2 Strings using equals method
		System.out.println(myString.equals(myNewString));
		
		//convert String to lower case
		System.out.println(myString.toLowerCase());
		
		System.out.println(myString); //shows String is immutable class, the value would be in lower case
		
		myString = myString.toLowerCase(); //changing the value to lower case
		
		System.out.println(myString);
		
		System.out.println(myString.toUpperCase()); // to print in upper case
		
		System.out.println(myString.equals(myNewString));
		
		myString = "      I am an Engineer ";
		//trim method to remove the trailing spaces
		System.out.println(myString.toLowerCase().trim());
		
		myString = "I am doctor";
		//equalsIgnoreCase(), just to check if 2 strings are equal regardless of case
		System.out.println(myString.toUpperCase().equalsIgnoreCase("I am doctor"));
		
		
		// subString() will provide part of the String from the index
		System.out.println("my subString is : "+myString.substring(8));
		
		// lets look up more string methods
		// concat method in string class
		System.out.println(myString.concat(" , I work in Ashburn."));
		
		System.out.println(myString);
		// concatination is adding more strings / words to existing string
		System.out.println(myString+" I work in Arlington, VA");
          
		
		
		
		

	}

}
