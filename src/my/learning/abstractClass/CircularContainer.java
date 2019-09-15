package my.learning.abstractClass;

public class CircularContainer extends Container {


    @Override
    public double calculateArea(double length, double width) {
        return Math.PI * length / 2 * length / 2;
    }
}
