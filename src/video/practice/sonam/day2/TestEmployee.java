package video.practice.sonam.day2;

public class TestEmployee {

    public static void main(String[] args) {
       Employee alex = new Employee();
       Employee linda = new Employee();
       Employee john =new Employee();

       alex.bonus = 821.00;
       alex.salary =9630.00;
       alex.calculateTotalPay();

       linda.bonus = 893.02;
       linda.salary = 9863.00;
       linda.calculateTotalPay();

       john.salary = 983.00;
       john.bonus = 223.00;
       john.calculateTotalPay();



    }

}
