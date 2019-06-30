package com.syed.learning;

public class ArrayLearning {
	
	public static void main(String[] args){
		
		int[] myNums = {1,3,2};
		
		int[] myNumbers = new int[8];
		
		myNumbers[0] = 5;
		myNumbers[1] = 4;
		myNumbers[3] = 3;
		myNumbers[1] = 2;
		myNumbers[4] = 1;
		//myNumbers[5] = 0;
		
		System.out.println(myNumbers[1]);
		
		//default value of int is 0
		
		System.out.println(myNumbers[6]);
		
		String[] myStrings = new String[7];
		myStrings[0] = "first";
		myStrings[1] = "Second";
		myStrings[2] = "Third";
		myStrings[3] = "Fourth";
		
		System.out.println(myStrings[2]);
		
		// default value of String is null
		System.out.println(myStrings[6]);
 	}

}
