package com.esolutions.trainings.java.nivelacion.ex5;

public class ArrayUtils {
	
    public int sumOf(int[] arr) {
        // write your code here
    	int sum= 0;
    	
    	for (int i=0; i<arr.length; i++) {
    		sum= sum+arr[i];
    		    		
    	}
    		
        return sum;
    }

    public int maxOf(int[] arr) {
        // write your code here
    	int max=0;
    	for (int i = 0; i < arr.length; i++) {
			if (max< arr[i]) {
				max= arr[i];
			}	
			
		}
    	
        return max;
    }
}
