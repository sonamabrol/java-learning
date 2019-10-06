package com.sonam.newpractice.ABINT;

public class StringSonam {

    public static void main(String[] args) {
        String result = reverseStr("LearningJava");
        System.out.println(result);

        String result1 = newMeths("LEARNINGJAVA");
        System.out.println(result1);

        String[] result2 = splitTheStr("I Live in United States of America");
        for(String s : result2){
            System.out.println(s);
        }
    }


    public static String returnName() {
        return "Sonam";
    }

    //passing argumenrt return String in lowercase
    public static String nameLcase(String s) {
        return s.toLowerCase();
    }

    //2 passinf A return * of both

    public static double multipTwo(double x, double y) {
        return x * y;
    }

    public static String reverseStr(String s) {
        String r = "";

        if (s != null) {
            StringBuilder rev = new StringBuilder(s);
            return rev.reverse().toString();
        }
        throw new IllegalArgumentException("null value is passed");

    }

    public static String newMeths(String n) {

        StringBuilder tryMeths = new StringBuilder(n);
        return tryMeths.substring(5).toLowerCase();
    }


    public static String[] splitTheStr(String n) {

        if (n != null) {
            String[] wordsFrpmN = n.split(" ");
            for (int i = 0; i <= wordsFrpmN.length-1; i=i+2) {
                System.out.println(wordsFrpmN[i]);
            }

            return wordsFrpmN;

        }throw  new IllegalArgumentException("null value is passed");
    }
}








