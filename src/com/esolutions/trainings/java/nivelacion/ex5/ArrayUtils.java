package com.esolutions.trainings.java.nivelacion.ex5;

public class ArrayUtils {
    public int sumOf(int[] arr) {
        int total = 0;
        for (int x=0;x<arr.length;x++) {
            total += arr[x];

        }

        return total;
    }

    public int maxOf(int[] arr) {
        int maximo = arr[0];
        for (int x=0;x<arr.length;x++){
            if (maximo < arr[x])
                maximo = arr[x];


        }

        return maximo;
    }
}
