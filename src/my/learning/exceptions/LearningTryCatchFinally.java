package my.learning.exceptions;

import java.util.concurrent.ExecutionException;

public class LearningTryCatchFinally {


    public static void main(String[] args) {
        try{  //try the block of code
            System.out.println("running the try block...............");
            String result = getFirstThreeCharacterFromFirstAndLastName(null, "Tendulkar");
            System.out.println(result);
        }catch(Exception ex){  //catch the exceptions
            System.out.println("caught the exceptions from the main try block...............");
            ex.printStackTrace();
        } finally {  //(Optional to use) finally will always run and execute the code in it.
            System.out.println("running the finally");
            System.out.println("closing the database connections......");

            System.out.println("Handing exceptions in the finally block....");
            try {
                 System.out.println("running the try block inside the finally...............");
                String result = getFirstThreeCharacterFromFirstAndLastName(null, "Tendulkar");
                System.out.println(result);
            }catch(Exception ex){
                 System.out.println("caught the exceptions from the finally try block...............");
                ex.printStackTrace();
            }


        }
        System.out.println("Still running after the exception......Passing the results to the API...");

    }


    public static String getFirstThreeCharacterFromFirstAndLastName(String firstName, String lastName){
        String firstThreeCharsFromFirstName = "";
        for (int i = 0; i<=2 ; i++) {
            firstThreeCharsFromFirstName = firstThreeCharsFromFirstName+firstName.charAt(i);
        }

        String firstThreeCharsFromlastName = "";
        for (int i = 0; i<=2 ; i++) {
            firstThreeCharsFromlastName = firstThreeCharsFromlastName+lastName.charAt(i);
        }

        return firstThreeCharsFromFirstName+" "+firstThreeCharsFromlastName;
    }




}
