package my.learning.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_Learning {
	
	public static void main(String[] args){
		
	Set<String> setOfFavNames = new HashSet<>();
	    setOfFavNames.add("Varun");
		setOfFavNames.add("Sachin");
		setOfFavNames.add("Dhoni");
		setOfFavNames.add("Virat");
		setOfFavNames.add("Soroubh");
		setOfFavNames.add("Yuvraj");
		setOfFavNames.add("Virat");
		setOfFavNames.add("Sachin");
		setOfFavNames.add("Dhoni");
		setOfFavNames.add("Virat");
		setOfFavNames.add("Sachin");
		setOfFavNames.add("Dhoni");
		setOfFavNames.add("Varun");
		setOfFavNames.add("Virat");
		setOfFavNames.add("Varun");
		setOfFavNames.add("Virat");
		
		setOfFavNames.add("Varun");
		setOfFavNames.add("Virat");
		
		for(String str : setOfFavNames){
			System.out.println(str);

		}
		
		System.out.println(setOfFavNames.isEmpty());
		
		
	}

}
