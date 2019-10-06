package my.learning.superkeyword;

public class FullUserName extends User{

    FullUserName(String address){
        super(address);

    }

    public String setFullName(String firstName, String lastName){
        super.setFirstName(firstName);
        super.setLastName(lastName);
        return firstName+" "+lastName;
    }

}
