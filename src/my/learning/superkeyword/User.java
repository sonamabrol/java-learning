package my.learning.superkeyword;

public class User {
    private String firstName;
    private String lastName;
    private String address;

    User(){
        // no args constructor
    }

    User(String address){
       this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
