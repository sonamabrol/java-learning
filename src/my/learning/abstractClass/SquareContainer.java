package my.learning.abstractClass;

public class SquareContainer extends Container {
    @Override
    public double calculateArea(double length, double width) {
        return length * width;
    }
}
