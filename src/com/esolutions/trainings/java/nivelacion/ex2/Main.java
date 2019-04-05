package com.esolutions.trainings.java.nivelacion.ex2;

import com.esolutions.trainings.java.nivelacion.Console;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(2);

        /*1. crear 3 personas asignando para cada una un nombre, altura y edad diferente*/
        Persona p1 = new Persona("Juan",1.5f,19);
        Persona p2 = new Persona("Maria",1.8f,-4);
        Persona p3 = new Persona("Pedro",1.3f,13);
        /*2. dado el siguiente array cargar los objetos creados en 1*/
        Persona array[] = new Persona[3];
        array[0]= p1;
        array[1]= p2;
        array[2]= p3;

        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i].toString());
        }
        Console.printFooter();
    }
}
