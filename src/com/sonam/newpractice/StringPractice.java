package com.sonam.newpractice;

public class StringPractice {

    public static void main(String[] args) {
//Java program to get the character (Unicode code point) before the specified index within the String

        String b4uni ="w3resource.com";
        System.out.println("This is the orignal String :"+ b4uni);

        int val1 = b4uni.codePointBefore(1);
        int val2 = b4uni.codePointBefore(9);

        System.out.println("Code point before index1 : " + val1);
        System.out.println("code point before index2 : " +val2);


/*//Java program to get the character (Unicode code point) at the given index within the String. check unicode table for this.

            String unico ="w3source.com";
        System.out.println("This is the Original String :" +unico);

        int at1 = unico.codePointAt(1);
        int at2 = unico.codePointAt(9);
        System.out.println("Character(unicode point" + at1);
        System.out.println("Character(unicode point" +at2);*/


        //the below code is to get character at a posistion

       /* String stone = "Java Exercises!";
        System.out.println("Orignal String =" +stone);
        // to get the character at postions 0 and 10
        int index1 = stone.charAt(0);
        int index2 = stone.charAt(10);
        System.out.println("The character at Position 0 is "+(char)index1);
        System.out.println("The Character at postion 10 is " + (char)index2);*/


        //System.out.println(stone.replace("Stone","Sonam"));
        //System.out.println(stone.getBytes());
        //System.out.println(stone.replaceFirst("Stone","Sunny"));

    }
}
