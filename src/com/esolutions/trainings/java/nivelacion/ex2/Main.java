package com.esolutions.trainings.java.nivelacion.ex2;

import com.esolutions.trainings.java.nivelacion.Console;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(2);

        /*1. crear 3 personas asignando para cada una un nombre, altura y edad diferente*/

        /*2. dado el siguiente array cargar los objetos creados en 1*/
        Persona p1= new Persona();
        Persona p2= new Persona();
        Persona p3= new Persona();

        p1.setNombre("Laura");
        p2.setNombre("Pedro");
        p3.setNombre("Lucia");

        p1.setAltura(1.63f);
        p2.setAltura(1.80f);
        p3.setAltura(1.69f);

        p1.setEdad(15);
        p2.setEdad(18);
        p3.setEdad(16);

        p1.setPeso(45);
        p2.setPeso(50);
        p3.setPeso(40);


        Persona array[] = new Persona[3];
             array[0] = p1;
             array[1] = p2;
             array[2] = p3;

        Console.printFooter();
    }
}
