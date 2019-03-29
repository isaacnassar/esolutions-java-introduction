package com.esolutions.trainings.java.nivelacion.ex2;

import com.esolutions.trainings.java.nivelacion.Console;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(2);

        Persona P1 = new Persona();
        P1.setNombre("Gervasio");
        P1.setAltura(1.75f);
        P1.setEdad(25);

        Persona P2 = new Persona();
        P2.setNombre("Ger");
        P2.setAltura(1.88f);
        P2.setEdad(22);

        Persona P3 = new Persona();
        P3.setNombre("Gerva");
        P3.setAltura(1.95f);
        P3.setEdad(29);
        /*1. crear 3 personas asignando para cada una un nombre, altura y edad diferente*/

        /*2. dado el siguiente array cargar los objetos creados en 1*/
        Persona array[] = new Persona[3];
        array[0] =P1;
        array[1] =P2;
        array[2] =P3;

        System.out.println(Arrays.toString(array));
        Console.printFooter();
    }
}
