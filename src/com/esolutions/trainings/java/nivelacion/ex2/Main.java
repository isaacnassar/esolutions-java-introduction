package com.esolutions.trainings.java.nivelacion.ex2;

import com.esolutions.trainings.java.nivelacion.Console;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(2);

        /*1. crear 3 personas asignando para cada una un nombre, altura y edad diferente*/
        Persona persona1 = new Persona("Martín Palermo", 1.98f, 42);
        Persona persona2 = new Persona("Santiago Caruso", 1.71f, 37);
        Persona persona3 = new Persona("Marie Curie", 1.68f, -20);

        /*2. dado el siguiente array cargar los objetos creados en 1*/
        Persona array[] = new Persona[3];
        array[0] = persona1;
        array[1] = persona2;
        array[2] = persona3;

        for (Persona per: array) System.out.println(per.toString());

        Console.printFooter();
    }
}