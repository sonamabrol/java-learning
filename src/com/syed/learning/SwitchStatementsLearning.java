package com.syed.learning;

import java.util.Scanner;

public class SwitchStatementsLearning {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);// to get the values from the keyboard

		System.out.println("please enter your number : ");

		int myNumber = scan.nextInt();

		switch(myNumber){
			case 0:{
				System.out.println("my number is "+myNumber);
				break;
			}
	
			case 1:{
				System.out.println("my number is "+myNumber);
				break;
			}
	
			case 110:{
				System.out.println("my number is "+myNumber);
				break;
			}
	
			case 120:{
				System.out.println("my number is "+myNumber);
				break;
			}
			default:{
				System.out.println("My default number is : "+1000);
			}

		}
	}

}
