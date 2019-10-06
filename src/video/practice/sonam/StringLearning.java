package video.practice.sonam;

public class StringLearning {

    public static void main(String[] args) {

        String x = "James Dean";

        //to concat
        System.out.println("Hello "+ x);

        System.out.println(x.toUpperCase());

        System.out.println(x.toLowerCase());

        System.out.println(x.substring(3)); //it will start printing from char store at 3.

        System.out.println(x.substring(3,7)); // it will print from char at three till 7 but the the char of 7nth index.

        System.out.println(x.charAt(3));// will print the character at the 3rd position.
        // to convert string ito number we need to use wrapper classes

      String age = "25";
      String salary = "9852.30";

      int a = Integer.parseInt(age)/2;
        System.out.println(a);
        double b = Double.parseDouble(salary)*10;
        System.out.println(b);




    }

}
