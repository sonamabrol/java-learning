package com.sonam.newpractice;

public class Eoveridetest {
    public static void main(String[] args) {


        Eoveride etest = new Eoveride();
        etest.setName("Sonam");
        etest.setAge(28);


        System.out.println(etest.getName());
        System.out.println(etest.getAge());

        Eoveride etest1 = new Eoveride();
        etest1.setName("Sonam");
        etest1.setAge(28);
         System.out.println(etest1.getName());
        System.out.println(etest1.getAge());

        System.out.println(etest.equals(etest1));
        System.out.println(etest==etest1);


    }
}
