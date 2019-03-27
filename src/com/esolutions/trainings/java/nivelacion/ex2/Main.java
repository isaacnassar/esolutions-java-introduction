package com.esolutions.trainings.java.nivelacion.ex2;

import com.esolutions.trainings.java.nivelacion.Console;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(2);

        /*1. crear 3 personas asignando para cada una un nombre, altura y edad diferente*/

        /*2. dado el siguiente array cargar los objetos creados en 1*/
        Persona array[] = new Persona[3];
        array[0]= new Persona("martins",1.8f,25);
        array[1] = new Persona("Gabriel", 1.6f,96);
        array[2] = new Persona("luciano", 1.7f,85);
        Console.printFooter();
    }
}
