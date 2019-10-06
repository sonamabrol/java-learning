package my.practice.javamethods;

import java.util.Scanner;

public class MathodsPractice {
    public static void main(String[] args) {
        double result = toGetTheSmallestNumber(25,37,29);
        System.out.println(result);

        double result1 =toGetTheAverage(8,2,6);
        System.out.println(result1);

        double result2= toGetTheRandom(8,8,9);
        System.out.println(result2);

        System.out.println(count("The quick brown fox jumps over the lazy dog."));
        /*Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The smallest value is " + toGetTheSmallestNumber(x, y, z)+"\n" );*/
          }
          public static double toGetTheSmallestNumber(double x, double y, double z){
            return Math.min(Math.min(x,y), z);
          }

          public static double toGetTheAverage (double x, double y, double z){
            return x+y+z /3;
          }

          public static double toGetTheRandom (double x, double y, double z) {
              return Math.random();
          }


          public static int count(String str){
        return str.length();
          }
}
