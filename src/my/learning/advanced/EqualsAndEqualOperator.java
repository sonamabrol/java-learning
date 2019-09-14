package my.learning.advanced;

import java.util.HashSet;
import java.util.Set;

public class EqualsAndEqualOperator {

    public static void main(String[] args) {

      String s1 = "David";
      String s2 = "David";
      System.out.println(s1.equals(s2));  //true, because both String literals contains same values.
      System.out.println(s1==s2); //true, because s1 and s2 are string literals and have same values and that's why value is stored at same memory locations/references

      String s3 = new String("David");

      System.out.println(s3==s2); //false, because s3 is new Object and 2 different objects have different memory locations/references
      // ToProof  --> s2 and s3 don't have same hashCode values.
      System.out.println(System.identityHashCode(s2));
      System.out.println(System.identityHashCode(s3));

      // Override Equals and HashCode method in Person class, so we can find the duplicate objects and 2 person objects are equal or not.
      Person p1 = new Person();
      p1.setFirstName("Sachin");
      p1.setLastName("Tendulkar");
      p1.setAge(25);

      Person p2 = new Person();
      p2.setFirstName("Sachin");
      p2.setLastName("Tendulkar");
      p2.setAge(25);

      Person p3 = new Person();
      p3.setFirstName("Sahil");
      p3.setLastName("Singh");
      p3.setAge(22);

      Person p4 = new Person();
      p4.setFirstName("Rajan");
      p4.setLastName("Bhatt");
      p4.setAge(25);

      Set<Person> uniquePersons = new HashSet<>();

      uniquePersons.add(p1);
      uniquePersons.add(p2);
      uniquePersons.add(p3);
      uniquePersons.add(p4);

      for(Person person : uniquePersons){
        System.out.println(person.getFirstName());

      }


    }


}
