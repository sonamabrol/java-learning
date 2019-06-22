package com.syed.conditions;

import java.util.Scanner;

public class IfelseWithTernoryOperator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String name = scan.nextLine();
		//if else
		String result = name.equals("Joe")? "yes" : "no";
		System.out.println("does input match : "+result);
		// if else ternory Operator

		// functional programming
		String res = name.equals("Jones")? "yes" : name.equals("Arlington") ? "Arlington" : "none";
		System.out.println(res);
	}

}
