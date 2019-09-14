package com.sonam.newpractice;

import java.io.Serializable;
import java.util.Scanner;

public class Conditionspractice {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        int input = 0;
        while (input != 100) {
            System.out.println("Input Number: ");
            input = keyboard.nextInt();

            int  result = input > 0 ? 1 : input < 0 ? -1 : 0;

            System.out.println(result);

            /*if (input > 0) {
                System.out.println("Number is positive");
            } else if (input < 0) {
                System.out.println("Number is Negative");
            } else {
                System.out.println("Number is zero");
            }*/
        }


    }
}
