package com.sonam.newpractice;

public class ReverseString {

    public static void main(String[] args) {
        try {
            prac2(null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

       String myReverse = prac2("I am learning reverse string method");
        System.out.println(myReverse);

    }
    public static String prac2(String string){
        if (string != null){
            String prac3 = "";
            for(int i = string.length()-1; i>=0; i--){
                prac3 = prac3+string.charAt(i);
            }
            return prac3;
        }
        throw new IllegalArgumentException("Null reference is passed");
    }
}
