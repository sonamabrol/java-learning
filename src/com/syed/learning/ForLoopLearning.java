package com.syed.learning;

public class ForLoopLearning {
	
	
	public static void main(String[]args){
		
		int[] nums = {1,3,21,4,43,4,23,12,13,1,21,2,112};
		
	
		for(int i =0;i<nums.length;i++){
			//body
			if(i==8){ // we are checking if i is logically equals to number '8'
				continue; // to skip the loop execution from this point and pass the control back to the loop to goto next step.
			}
			System.out.println("loop iteration is = "+i+", my nums array index "+i+" value is "+nums[i]);
			//System.out.println("loop iteration is = "+i+" ,my loop is always true");
		}
	}
		
	


}
