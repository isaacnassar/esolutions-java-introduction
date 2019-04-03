package com.esolutions.trainings.java.nivelacion.ex5;

public class ArrayUtils {
    public int sumOf(int[] arr) {
        Integer suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        return suma;
    }

    public int maxOf(int[] arr) {

        int compa = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (compa < arr[i]) {
                compa = arr[i];
            }
        }
        return compa;
    }
}
