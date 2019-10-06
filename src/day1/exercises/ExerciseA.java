package day1.exercises;

public class ExerciseA {

    public static void main(String[] args) {
       double result =  taxCalc(10500.00);
        System.out.println("Tax of 10500 = " + result);
        double result1 = taxCalc(18000.00);
        System.out.println("tac of 18000 = " +result1);
        double result3 = taxCalc(60000);
        System.out.println("tax of 60000 =" +result3);





    }

    public static double taxCalc(double salary) {
        double tax = 0.0;


            if (salary <= 15000) {
                return tax =salary * .10;
            } else if (salary <= 40000) {
               return tax = salary * .20;
            } else
                return tax = salary * .30;

    }

}



