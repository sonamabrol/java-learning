package video.practice.sonam.datahidding;

public class TestEmployee {
    final static int defaultSalary = 5000;
    public static void main(String[] args) {
        Employee test = new Employee();
        test.setSalary(200000.00);
        test.setBonus(15000.00);
        double result = test.calculateTheArea();
        System.out.println(result);

    }


}
