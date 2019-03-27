package com.esolutions.trainings.java.nivelacion.ex5;

public class ArrayUtils {
    public int sumOf(int[] arr) {
    	//a. Obtener la suma de todos los valores del array.
    	
        int suma=0;
        for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				suma= suma +arr[i];
			}
		}
        return suma;
    }

    public int maxOf(int[] arr) {
        // b. Obtener el mayor valor de todos los valores del array.
    	int maximo=0;
    	for (int i = 0; i < arr.length; i++) {
			if (maximo<arr[i]) {
				maximo=arr[i];
			}
		}
    	
        return maximo;
    }
}
