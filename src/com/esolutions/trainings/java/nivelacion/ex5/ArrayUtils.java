package com.esolutions.trainings.java.nivelacion.ex5;

public class ArrayUtils {
    public int sumOf(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int maxOf(int[] arr) {
        int mayor = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mayor)
                mayor = arr[i];
        }
        return mayor;
    }
}
