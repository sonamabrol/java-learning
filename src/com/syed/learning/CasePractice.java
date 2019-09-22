package com.syed.learning;

import java.util.Scanner;

public class CasePractice extends ReverseYourString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int myNumber = 0;
        while(myNumber != 4){
             System.out.println("Please enter your number: ");
             myNumber = scan.nextInt();
        switch (myNumber) {
            case 2: {
                System.out.println("My number is " + myNumber);
                break;
            }
            case 60: {
                System.out.println("My number is " + myNumber);
                break;
            }

            case 90: {
                System.out.println("My number is  " + myNumber);
                break;

            }
            case 110: {
                System.out.println("my number is " + myNumber);
                break;
            }

            default: {
                System.out.println("my number is " + 1000
                );
            }

        }
        }
    }
}
