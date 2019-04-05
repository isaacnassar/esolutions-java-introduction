package com.esolutions.trainings.java.nivelacion.ex5;

public class ArrayUtils {
    public int sumOf(int[] arr) {
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            total +=arr[i];

        }
        return total;
    }

    public int maxOf(int[] arr) {
        int nMayor = arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>nMayor){
                nMayor = arr[i];
            }
        }
        return nMayor;
    }
}
