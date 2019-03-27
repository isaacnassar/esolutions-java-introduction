package com.esolutions.trainings.java.nivelacion.ex5;

import com.esolutions.trainings.java.nivelacion.Console;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(5);

        final int[] arr = new int[]{10, 20, 40, 90, 88, 122, 500, 44, 100, 121, 99, 99, 0};

        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.println("Suma: " + arrayUtils.sumOf(arr));
        System.out.println("Mayor: " + arrayUtils.maxOf(arr));

        Console.printFooter();
    }
}
