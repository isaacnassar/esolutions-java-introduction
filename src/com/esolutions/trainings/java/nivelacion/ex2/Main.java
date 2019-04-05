package com.esolutions.trainings.java.nivelacion.ex2;

import com.esolutions.trainings.java.nivelacion.Console;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(2);

        /*1. crear 3 personas asignando para cada una un nombre, altura y edad diferente*/
        Persona Antonio= new Persona ("Antonio",1.8f,-25,Float.parseFloat("84"),true);
        Persona Josefina= new Persona("Josefina",Float.parseFloat("1.6"),25,Float.parseFloat("54"),true);
        Persona Braulio= new Persona("Braulio",Float.parseFloat("1.7"),25,Float.parseFloat("76"),true);
        /*2. dado el siguiente array cargar los objetos creados en 1*/
        Persona array[] = new Persona[3];
        array[0]=Antonio;
        array[1]=Josefina;
        array[2]=Braulio;
        Console.printFooter();
        
        for (int i=0; i<3; i++)
        {
        	System.out.println(array[i].toString());
        }
        array[0].crecer();
        System.out.println(array[0].toString());
        array[0].comer("poco");
        System.out.println(array[0].toString());
        array[0].comer("mucho");
        System.out.println(array[0].toString());
        array[0].comer("nada");
        System.out.println(array[0].toString());
    }
}
