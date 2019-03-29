package com.esolutions.trainings.java.nivelacion.ex5;

public class ArrayUtils {
    public int sumOf(int[] arr) {
        int suma = 0;
        for (int i=0; i < arr.length; i++){
            suma = suma + arr[i];
        }
        return suma;
    }

    public int maxOf(int[] arr) {
        int mayor = 0;
        for (int i=0; i < arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                mayor=arr[i];
            }
            else{
                i++;
            }
        }
        return mayor;
    }
}
