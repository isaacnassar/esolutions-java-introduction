package com.esolutions.trainings.java.nivelacion.ex5;

public class ArrayUtils {
    public int sumOf(int[] arr) {
    	int lenght=arr.length;
    	int sum=0;
    	for (int i=0; i< lenght; i++)
    		{
    		sum=sum+arr[i];
    		}

        return sum;
    }

    public int maxOf(int[] arr) {
    	int lenght=arr.length;
    	int max=0;
    	for (int i=0; i< lenght; i++)
    		{
    		if (max<arr[i]) 
    			{
    			max=arr[i];
    			}
 			
    		}
        return max;
    }
}
