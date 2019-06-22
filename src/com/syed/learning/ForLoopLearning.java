package com.syed.learning;

public class ForLoopLearning {
	
	
	public static void main(String[]args){
		
		int[] nums = {1,3,21,4,43,4,23,12,12,1,21,2,112};
		
	
		for(int i =0;i<nums.length;i++){
		//body
		if(i==8){
			continue;
		}
		System.out.println("loop iteration is = "+i+" ,my loop is always true");
		
				
		}
	}
		
	


}
