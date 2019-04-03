package com.esolutions.trainings.java.nivelacion.ex6;

import com.esolutions.trainings.java.nivelacion.Console;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(6);
        Console.printHeader(6);

        final int[] arr = new int[]{10, 20, 40, 123, 90, 88, 122, 44, 100, 121, 99, 99, 123, 0, 90, 1, 90, 2, 90};

        JavaCollections col = new JavaCollections();
        System.out.println("Ordenados: " + Arrays.toString(col.sorted(arr)));
        System.out.println("Sin repetidos: " + Arrays.toString(col.distinct(arr)));
        System.out.println("Cantidad por numero: " + col.countByNumber(arr));

        Console.printFooter();
    }
}