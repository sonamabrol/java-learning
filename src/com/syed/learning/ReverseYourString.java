package com.syed.learning;

public class ReverseYourString {
	
	public static void main(String[] args){
		
		String rs= "I live in Alexenderiad";
		String myReversedString = "";
		for(int i=rs.length()-1;i>=0;i--){
			myReversedString = myReversedString +rs.charAt(i);
		}
		
		System.out.println(myReversedString);
	}

}
