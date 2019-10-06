package my.practice.javamethods;

import java.sql.SQLOutput;

public class EscapeSequence {
    public static void main(String[] args) {
        //putting the backslash will let java know that not treat the inside quotes as string \"
     String backSlash = "Patrick Hanry said \"Give me Liberty, Or Death\" in 1775.";
        System.out.println(backSlash);

//this will make sure that backslash is printesd. we need to put one more back slash
String backSlash2 = "The file is located at c:\\myfiles\\myDoc.dc";
        System.out.println(backSlash2);

//this will create a new line
        String backSlash3 = "The file is located at\n c:\\myfiles\\myDoc.dc";
        System.out.println(backSlash3);

        // create a empty line before and after \n

           String backSlash4 = "\nThe file is located at\n c:\\myfiles\\myDoc.dc\n";
        System.out.println(backSlash4);

        //\t will give tab

      System.out.println("Name\tAge\tDate");
//\r will overide
        System.out.println("I Like this \r No start over ");
}
    }


