package com.esolutions.trainings.java.nivelacion.ex2;

import com.esolutions.trainings.java.nivelacion.Console;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(2);

        /*1. crear 3 personas asignando para cada una un nombre, altura y edad diferente*/
        Persona per1= new Persona("Gachi",1.60f ,33);
        Persona per2= new Persona("Pachi",1.50f ,28);
        Persona per3= new Persona("Raul",1.80f ,38);
        
        /*2. dado el siguiente array cargar los objetos creados en 1*/
        Persona array[] = new Persona[3];
        
        array[0]=per1;
        array[1]=per2;
        array[2]=per3;
        
        for(int i=0; i<array.length;i++)
        {
        	System.out.println(array[i]);
        }

        Console.printFooter();
    }
}
