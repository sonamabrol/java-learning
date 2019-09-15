package my.learning.abstractClass;

public abstract class Container {

    public double calculateVolume(double height, double length, double width){
        return calculateArea(length,width)*height;
    }

    public abstract double calculateArea(double length, double width);


}
