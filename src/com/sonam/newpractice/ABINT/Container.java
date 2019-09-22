package com.sonam.newpractice.ABINT;

public abstract class  Container {

    public double cirvol(double length, double width, double height){
        return Math.PI*length/2*length/2*height;
    }

    public abstract double cirarea(double length, double width, double height);

    public abstract double cubevol(double length, double width, double height);

    public abstract double cubearea(double length, double width, double height);


}
