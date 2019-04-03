package com.esolutions.trainings.java.nivelacion.ex5;

public class ArrayUtils {
    public int sumOf(int[] arr) {
        // write your code here
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }

    public int maxOf(int[] arr) {
        // write your code here
        int mayor = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (mayor < arr[i]) {
                mayor = arr[i];
            }
        }

        return mayor;
    }
}
