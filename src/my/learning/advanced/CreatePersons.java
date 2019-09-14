package my.learning.advanced;

public class CreatePersons {

	public static void main(String[] args) {
		
		Person narindra = new Person();
		
		Address a1 = new Address();
		
		a1.setStreetName("123 john st");
		a1.setCity("Alexendria");
		a1.setState("Virginia");
		a1.setZipCode(20134);
		
		//p1.setFirstName("Narindra");
		narindra.setLastName("Modi");
		narindra.setFirstName("Narindra");

		
		//creating another object p2 to store data of another person
		Person rahul = new Person();
		//p2.setFirstName("Rahul");
		rahul.setFirstName("Rahul");
		rahul.setLastName("Gandhi");
		
		//creating address for person p2
		Address a2 = new Address();
		a2.setCity("Ashburn");
		a2.setState("VA");
		a2.setStreetName("232423 Kings st");
		a2.setZipCode(20145);
		

		
		
		
		
		
		
		
		
		
	}

}
