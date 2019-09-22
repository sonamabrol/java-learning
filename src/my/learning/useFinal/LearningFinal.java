package my.learning.useFinal;

public class LearningFinal {

    public double findAreaOfCircle(double radius){
        final double pi = 3.15;  // final variable will never change, it will remain same.
        double area = pi * radius * radius;
        return area;
    }

    // overloaded method, this has same name/signature as the above method but passing args are different. This has 'height' as an additional argument.
    public double findAreaOfCircle(double radius, Integer height){
        final double pi = 3.15;  // final variable will never change, it will remain same.
        double area = pi * radius * radius;
        return area;
    }

    public final double findAreaOfSquare(double side){
        double area = side * side;
        return area;
    }






}
