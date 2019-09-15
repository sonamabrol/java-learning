package my.learning.inheritence;

public class BoxTest {

    public static void main(String[] args) {
        Box squareBox = new NewBox();

        double areaOFMyBox = squareBox.calculateArea(20,20);

        System.out.println(areaOFMyBox);

    }
}
