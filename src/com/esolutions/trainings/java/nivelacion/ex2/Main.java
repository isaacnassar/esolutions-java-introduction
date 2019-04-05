package com.esolutions.trainings.java.nivelacion.ex2;

import com.esolutions.trainings.java.nivelacion.Console;
import com.esolutions.trainings.java.nivelacion.ex2.Persona;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(2);
        
        /*1. crear 3 personas asignando para cada una un nombre, altura y edad diferente*/
        Persona p1= new Persona("Ana", 1.80f, 20);
        Persona p2= new Persona("Pedro", 1.60f, 15);
        Persona p3= new Persona("Roberto", 1.50f, 10);
        
        p1.setPeso(10.5f);
        p2.setPeso(100.9f);
        p3.setPeso(50f);
                
        
        
        /*2. dado el siguiente array cargar los objetos creados en 1*/
        Persona array[] = new Persona[3];
        array[0]= p1;
        array[1]= p2;
        array[2]= p3;
        
        for(int f=0;f<array.length;f++) {
                System.out.println(array[f]);
            }
        
   /*metodo crecer*/     
        for (int i=0; i<array.length;i++)
        {
        	array[i].crecer();
        	System.out.println(array[i]);
        }
    /*correr*/
        Console.printFooter();
        
    }
}
