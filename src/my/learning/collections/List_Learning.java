package my.learning.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_Learning {
	
	public static void main(String[] args){
    
		List<String> listOfFavNames = new ArrayList<>();
		
		listOfFavNames.add("Sachin");
		listOfFavNames.add("Dhoni");
		listOfFavNames.add("Virat");
		listOfFavNames.add("Soroubh");
		listOfFavNames.add("Yuvraj");
		listOfFavNames.add("Virat");
		listOfFavNames.add("Sachin");
		listOfFavNames.add("Dhoni");
		listOfFavNames.add("Virat");
		listOfFavNames.add("Sachin");
		listOfFavNames.add("Dhoni");
		listOfFavNames.add("Virat");
	    //classic for loop
		/*for(int i=0; i<listOfFavNames.size();i++){
			System.out.println(listOfFavNames.get(i));
		}*/
		
/*		List<String> myNewList = new ArrayList<>();
		
		myNewList.addAll(listOfFavNames);  //copied the listOfFavNames to myNewList
		*/
		if(listOfFavNames != null && !listOfFavNames.isEmpty()){
              int count =0;

              for(String str : listOfFavNames){

            	  if(str.equals("Sachin")){
            		  count++;
            	  }

              }
              System.out.println("my count of Sachin is : "+count);
			
			
			/*if(listOfFavNames.contains("Sachin")){
				
				for(String st : listOfFavNames){
					System.out.println(st);
				}
			}else{
				System.out.println("I have removed Sachin from the list, before my list iterates");
			}*/
			
		}
		//modern for-each loop
		
		
		
		
	
	}
	
	
	
	
	

}
