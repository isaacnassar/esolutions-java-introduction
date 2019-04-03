package com.esolutions.trainings.java.nivelacion.ex2;

import com.esolutions.trainings.java.nivelacion.Console;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(2);

        /*1. crear 3 personas asignando para cada una un nombre, altura y edad diferente*/

        Persona persona1 = new Persona ();
        Persona persona2 = new Persona ();
        Persona persona3 = new Persona ();

        persona1.setNombre("Juan");
        persona1.setAltura(151f);
        persona1.setEdad(40);
        persona2.setNombre("Pedro");
        persona2.setAltura(180f);
        persona2.setEdad(25);
        persona3.setNombre("Pablo");
        persona3.setAltura(195f);
        persona3.setEdad(30);

        /*2. dado el siguiente array cargar los objetos creados en 1*/
        Persona array[] = new Persona[3];
        array[0]= persona1;
        array[1]= persona2;
        array[2]= persona3;
        Console.printFooter();
    }
}
