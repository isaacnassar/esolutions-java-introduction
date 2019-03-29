package com.esolutions.trainings.java.nivelacion.ex2;

import com.esolutions.trainings.java.nivelacion.Console;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(2);

        /*1. crear 3 personas asignando para cada una un nombre, altura y edad diferente*/

        /*2. dado el siguiente array cargar los objetos creados en 1*/
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();

        p1.setNombre("Fernando");
        p2.setNombre("Angel");
        p3.setNombre("Cristian");

        p1.setAltura(1.94F);
        p2.setAltura(1.80F);
        p3.setAltura(1.70F);

        p1.setEdad(23);
        p2.setEdad(32);
        p3.setEdad(30);

        /*2. dado el siguiente array cargar los objetos creados en 1*/
        Persona array[] = new Persona[3];
        array[0]=p1;
        array[1]=p2;
        array[2]=p3;
        Console.printFooter();
    }
}
