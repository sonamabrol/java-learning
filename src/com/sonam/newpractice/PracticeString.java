package com.sonam.newpractice;

public class PracticeString {

    public static void main(String[] args) {
        try {
            System.out.println(prac1(null));
        } catch(Exception ex){
            //logs the exceptions to the log file.
        }
        System.out.println(prac1("I am learning java"));
    }

    public static String prac1(String string) {


        if (string != null) {
            String retuPrac1 = "";
            for (int i = string.length() - 1; i >= 0; i--) {

                retuPrac1 = retuPrac1 + string.charAt(i);
            }

            return retuPrac1;
        }
        //return null;

        throw new IllegalArgumentException("Null reference is passed!");
    }


}



