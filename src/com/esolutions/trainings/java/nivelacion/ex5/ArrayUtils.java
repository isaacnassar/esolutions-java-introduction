package com.esolutions.trainings.java.nivelacion.ex5;

public class ArrayUtils {
    public int sumOf(int[] arr) {
        // write your code here

        int suma=0;

        for(int i=0; i < arr.length ; i++){
            suma = suma + arr[i];
        }
        return suma;
    }

    public int maxOf(int[] arr) {
        // write your code here
        int mayor=0;

        for(int i=0; i < arr.length ; i++){
            if(arr[i]>mayor)
            {
                mayor= arr[i];
            }
        }

        return mayor;
    }
}
