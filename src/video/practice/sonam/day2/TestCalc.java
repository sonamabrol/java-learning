package video.practice.sonam.day2;

public class TestCalc {
    public static void main(String[] args) {
       Box ups = new Box();
    Box fedex = new Box();

    ups.length = 8;
    ups.width = 9;
    int area1 = ups.calcTheArea();

    fedex.length = 8;
    fedex.width =45;

    int area2 = fedex.calcTheArea();

        System.out.println("Returning the area of both "+ (area1+area2));
    }



}
