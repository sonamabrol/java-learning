package com.sonam.newpractice;

import java.util.Objects;

public class EqualOveride {

    private String name;
    private int age;

    public void setName (String nm){
        this.name = nm;
    }
    public String getName(){return this.name;}

    public void setAge(int num){this.age = num; }

    public int getAge() {
        return this.age;
    }

@Override

    public boolean equals(Object o){
        if (this == o)return true;
        if( o == null || !(o instanceof EqualOveride))
            return false;

        EqualOveride EqlOv = (EqualOveride) o;
        return EqlOv.getName().equals(name)&&
                EqlOv.getAge()==age;
}

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

