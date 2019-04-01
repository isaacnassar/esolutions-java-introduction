package com.esolutions.trainings.java.nivelacion.ex2;
import com.esolutions.trainings.java.nivelacion.Console;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Console.printHeader(2);

        /*1. crear 3 personas asignando para cada una un nombre, altura y edad diferente*/

        /*2. dado el siguiente array cargar los objetos creados en 1*/
        
        BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
        Persona p[] = new Persona[3];
        for (int i=0; i<p.length ; i++)
        	{
        		System.out.println("Ingrese el nombre de la "+(i+1)+"° persona:");
        		String n1= in.readLine();
        		System.out.println("Ingrese la altura de la "+(i+1)+"° persona:");
        		float a1= Float.parseFloat(in.readLine());
        		System.out.println("Ingrese la edad de la "+(i+1)+"° persona:");
        		int e1= Integer.parseInt(in.readLine());
        		
        		p[i]= new Persona (n1, a1, e1);
        		
        	}
        for (int i = 0; i < p.length; i++)
        {
        	/*System.out.println("Ingrese la cantidad:");
        	String cant= in.readLine();
        	p[i].comer(cant);
        	System.out.println("Ingrese distancia en km:");
        	int dist= Integer.parseInt(in.readLine());
        	p[i].correr(dist);
        	p[i].crecer();*/
         System.out.println("Nombre:"+p[i].getNombre());
         System.out.println("Altura:"+p[i].getAltura());
         System.out.println("Edad:"+p[i].getEdad());
        }
        Console.printFooter();
    }
}
