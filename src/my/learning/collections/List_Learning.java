package my.learning.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_Learning {
	
	public static void main(String[] args){
    
		List<String> listOfNames = new ArrayList<>();

		listOfNames.add("Sachin"); // index 0
		listOfNames.add("Mahi");
		listOfNames.add("Murli");
		listOfNames.add("Dhoni");
		listOfNames.add("Mahi");
		listOfNames.add("Murli");

		/*for(int i=0;i<listOfNames.size();i++){  //traversing the listOfNames using native for looop
			System.out.println(listOfNames.get(i));
		}*/

		/*for (String name : listOfNames) {  //traversing the listOfNames using for-each looop
			System.out.println(name);
		}*/

		Iterator<String> nameIterator = listOfNames.iterator();

		while (nameIterator.hasNext()){
			System.out.println(nameIterator.next());
		}


		
	
	}
	
	
	
	
	

}
