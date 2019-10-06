package video.practice.sonam.day2;

public class Employee {
    double salary;
    double bonus;

    void calculateTotalPay(){
        double totalPay= salary+bonus;
        System.out.println(totalPay);
    }
}