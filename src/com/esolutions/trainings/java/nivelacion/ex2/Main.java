package com.esolutions.trainings.java.nivelacion.ex2;

import com.esolutions.trainings.java.nivelacion.Console;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(2);

        /*1. crear 3 personas asignando para cada una un nombre, altura y edad diferente*/



        /*2. dado el siguiente array cargar los objetos creados en 1*/

        Persona personas[] = new Persona[]
                {

                        new Persona("Juan",1.75f , 32),
                        new Persona("Lucia",1.65f , 25),
                        new Persona("Facundo",1.70f , 29)

                };

        for (int i = 0; i < personas.length; i++) {

            System.out.println(personas[i].toString());
        }

        Console.printFooter();

    }
}
