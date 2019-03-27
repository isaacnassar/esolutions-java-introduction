package com.esolutions.trainings.java.nivelacion.ex2;

import com.esolutions.trainings.java.nivelacion.Console;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(2);

        /*1. crear 3 personas asignando para cada una un nombre, altura y edad diferente*/

        Persona n1 = new Persona("Pepe", 1.6f, 18);
        Persona n2 = new Persona("Pepe", 1.6f, 18);
        Persona n3 = new Persona("Pepe", 1.6f, 18);

        /*2. dado el siguiente array cargar los objetos creados en 1*/
        Persona array[] = new Persona[3];

        array[0]=n1;
        array[1]=n2;
        array[2]=n3;

        Console.printFooter();
    }
}
