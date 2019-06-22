package com.syed.learning;

public class DoWhileLearning {
	
	public static void main(String[] args){
		
		
		int[] myNums = {1,2,121,8,12,21};
		
		//this is while loop
		/*int i=0;
		while(i<myNums.length){
			System.out.println(myNums[i]);
			i++;
		}*/
		
		//this is do-while 
		int j = 0;
		
		do{
			System.out.println(myNums[j]);
			j++;
		}while(j<myNums.length);
		
		
	}

}
