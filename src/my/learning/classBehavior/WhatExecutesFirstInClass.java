package my.learning.classBehavior;

public class WhatExecutesFirstInClass {

    String name = "MyWhatExecutesFirstClass";
    public Integer age;


    WhatExecutesFirstInClass(){
        // no args constructor
        System.out.println("object/constructor created");
    }

    WhatExecutesFirstInClass(String name, Integer age){
        // with args constructor
        this.name = name;
        this.age = age;
    }

    {
        System.out.println("Initialization block");
    }

    static{
            System.out.println("static block");
    }




}
