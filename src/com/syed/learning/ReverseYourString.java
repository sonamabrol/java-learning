package com.syed.learning;

public class ReverseYourString {
	
	public static void main(String[] args){
		
String sa ="I am Sonam";
String newsa = "";

		for (int i= sa.length()-1;i>=0; i--) {
			newsa=newsa+sa.charAt(i);



		}
		System.out.println(newsa);

	}

}
