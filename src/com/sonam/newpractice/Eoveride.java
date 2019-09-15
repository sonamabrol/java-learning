package com.sonam.newpractice;

import java.util.Objects;

public class Eoveride {

   private String name;
   private int age;


   public void setName(String nm){
       this.name = nm;
   }

   public String getName(){
       return this.name;
   }

   public void setAge(int val){
       this.age = val;
   }

   public int getAge(){
       return age;
   }

@Override
    public boolean equals(Object o){
       if (this == o) return true;
       if (o == null || !(o instanceof Eoveride)){
           return false;
       }
       Eoveride eoveride = (Eoveride) o;
       return eoveride.getName().equals(name) &&
               eoveride.getAge()== age;



    }

    public int hashCode (){
       return Objects.hash(name, age);

    }

}
