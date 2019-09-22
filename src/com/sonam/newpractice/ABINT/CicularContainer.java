package com.sonam.newpractice.ABINT;

abstract class Circularcontainer extends Container{


    @Override
    public double cirarea(double length, double width, double height) {
        return (2*Math.PI*width/2*height+2*Math.PI*width/2*width/2);
    }

    @Override
    public abstract double cubevol(double length, double width, double height);
    @Override
    public abstract double cubearea(double length, double width, double height) ;
}


