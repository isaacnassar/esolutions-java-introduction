package com.esolutions.trainings.java.nivelacion.ex7;

import com.esolutions.trainings.java.nivelacion.Console;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(7);

        ExceptionHandling eh = new ExceptionHandling();

        for (int i : new int[]{2, 10, 100}) {
            VeryImportantResource res = new VeryImportantResource();
            int fails = eh.countFailures(i, res);
            System.out.println("De " + i + ", fallaron " + fails);
            if (!res.isOpen()) {
                System.out.println("Recurso cerrado!");
            } else {
                System.out.println("No cerraste el recurso... ¬¬");
            }
        }

        Console.printFooter();
    }
}
