package my.learning.collections;

import java.util.ArrayList;
import java.util.List;

import my.learning.model.Person;

public class ListWithPersons {
	
	public static void main(String[]  args){
	List<Person> personsList = new ArrayList<>();
	
	Person dharam = new Person("Dharmendra", "Doel"); //setting up the values of the Dharam object using the constructor
	
	Person amitabh = new Person();
	//setting up the values of the amitabh using the setters and getters
	amitabh.setFirstName("Amitabh");
	amitabh.setLastName("Bacchan");
	
	
	Person mitun = new Person();
	
	mitun.setFirstName("Mithun");
	mitun.setLastName("Chakkarbotti");
	
	
	personsList.add(dharam);
	
	personsList.add(amitabh);
	
	personsList.add(mitun);
	
	
	for(Person per : personsList){
		if(per==dharam){
		System.out.println(per.getFirstName());
		System.out.println(per.getLastName());
	    }
	}
	
	
	
	}

}
