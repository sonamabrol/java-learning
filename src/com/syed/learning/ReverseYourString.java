package com.syed.learning;

import java.util.Scanner;

public class ReverseYourString {

	public static void main(String[] args) {
		Integer result = myMath(3,4,2);
		System.out.println(result);
	}


	public static String pracMyString5 (String string){
	if( string !=null){
		String prac6= "";
		for(int i= string.length()-1;i>=0;i--){
			prac6= prac6+string.charAt(i);
		}
			return prac6;

	}
	throw  new IllegalArgumentException("null reference is passed!");

	}

	static Integer myMath(Integer i, Integer y, Integer x){
		Integer result = i+y+x;
		return result;
	}




}