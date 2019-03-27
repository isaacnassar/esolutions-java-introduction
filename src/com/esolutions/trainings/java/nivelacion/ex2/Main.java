package com.esolutions.trainings.java.nivelacion.ex2;

import com.esolutions.trainings.java.nivelacion.Console;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(2);

        /*1. crear 3 personas asignando para cada una un nombre, altura y edad diferente*/
        Persona P1 = new Persona("Juan",1.88f,5);
        Persona P2 = new Persona("Alan",1.77f,31);
        Persona P3 = new Persona("Julieta",1.50f,15);

        /*2. dado el siguiente array cargar los objetos creados en 1*/
        Persona array[] = new Persona[3];
        array[0] = P1;
        array[1] = P2;
        array[2] = P3;

        for(int i = 0; i < array.length; i++)
        {
            // Imprimimos los elementos del array en pantalla.
            System.out.println(""+array[i]);
        }

        Console.printFooter();
    }
}
