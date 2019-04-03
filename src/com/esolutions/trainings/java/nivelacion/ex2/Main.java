package com.esolutions.trainings.java.nivelacion.ex2;

import com.esolutions.trainings.java.nivelacion.Console;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(2);

        /*1. crear 3 personas asignando para cada una un nombre, altura y edad diferente*/

        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();


        p1.setNombre("Lucas");
        p2.setNombre("Jose");
        p3.setNombre("Franco");

        p1.setAltura(1.52f);
        p2.setAltura(1.95f);
        p3.setAltura(1.42f);

        p1.setEdad(20);
        p2.setEdad(18);
        p3.setEdad(26);

        p1.setPeso(52);
        p2.setPeso(66);
        p3.setPeso(69);

        /*2. dado el siguiente array cargar los objetos creados en 1*/
        Persona array[] = new Persona[3];

        array[0] = p1;
        array[1] = p2;
        array[2] = p3;

        Console.printFooter();
    }
}
