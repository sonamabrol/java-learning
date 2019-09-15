package my.learning.abstractClass;

public class TestCircularContainer {

    public static void main(String[] args) {
        Container test = new CircularContainer();
        double result =  test.calculateArea(25.4,20.34);
        System.out.println("Area of cylinder is "+result);

        double volume = test.calculateVolume(20,25.4,20.34);
        System.out.println("Volume of Cylinder : "+volume);

        test = new SquareContainer();
        double squareArea =  test.calculateArea(25.4,20.34);
        System.out.println("Area of square is "+squareArea);

        double squareVolume = test.calculateVolume(20,25.4,20.34);
        System.out.println("Volume of square : "+squareVolume);
    }


}
