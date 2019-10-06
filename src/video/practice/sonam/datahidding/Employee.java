package video.practice.sonam.datahidding;

public class Employee {
    private double salary;
    private double bonus;



    void setSalary(double salary){
        if(salary >= 40000 && salary <= 200000 ){
            this.salary = salary;
        }else{
            this.salary = 0;
            System.out.println("Please check the salary");
        }
    }

    void setBonus(double bouns){
        if(bouns >= 5000 && bouns <= 25000){
            this.bonus = bouns;
        }else{
            this.bonus = 0;
            System.out.println("please check the bonus");
        }
    }

    double calculateTheArea(){
        double a = 0;
        a= salary+bonus;
        return a;
    }
}
