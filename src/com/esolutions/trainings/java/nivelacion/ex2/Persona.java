package com.esolutions.trainings.java.nivelacion.ex2;

import java.text.DecimalFormat;

/*
 * Dada la clase que represente el concepto de Persona. Debera tener las
 * propiedades:
 *
 * nombre, altura y edad deben ser propiedades obligatorias.
 * Es decir que, no puede existir ningun persona que no tenga un valor en estos atributos
 *
 *
 * y los metodos:
 *
 * Correr (que hara bajar el peso) Comer (que hara que aumente el peso) Crecer
 * (que hara que aumente la estatura)
 *
 */
public class Persona {

	public Persona(String nombre, Float altura, Integer edad, Float peso, boolean satisfecho) {
		super();
		this.nombre = nombre;
		this.altura = altura;
		if (edad<0)
			{
			this.edad = 0;
			}
		else 
			{
			this.edad = edad;
			}
		
		this.peso = peso;
		this.satisfecho = satisfecho;
	}

	private String nombre;
    private Float altura;
    private Integer edad;
    private Float peso;
    private boolean satisfecho;

    /*
     * Agregar un constructor que permita crear una nueva persona asignando un
     * nombre y edad Si la edad es menor a cero se debe asignar el valor edad = 0.
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Float getPeso() {
        return peso;
    }

    /*
     * el peso no puede ser menor al dobde de la edad
     */
    public void setPeso(float peso) {
        float pesoAux=0;
        pesoAux=this.edad*2;
    	if (peso>pesoAux)
    		{
    		this.peso = peso;
    		}
    	else if (peso<pesoAux)
    		{
    		System.out.println("El peso no puede ser menor al doble de la edad");
    		}
    }

    public boolean isSatisfecho() {
        return satisfecho;
    }

    public void setSatisfecho(boolean satisfecho) {
        this.satisfecho = satisfecho;
    }

    public void crecer() {
        // controlar que solo aumente la altura hasta los 18 a�os
        // cada vez que se llama al metodo crecer se debe aumentar un a�o.
    	if (this.edad<19) 
    		{
    		this.altura = this.altura + (10.6f)/100;
    		}
    	this.edad++;
    		
    }

    public void correr(int distanciaKM) {

        // si la distancia es igual o menor a 7 el estado "satisfecho" cambia a false y
        // el peso no cambia
        // si la distancia es mayor 7 km el estado "satisfecho" cambia a true y el peso
        // baja en 1
        if (distanciaKM<8)
        	{
        	this.satisfecho=false;
        	}
        if (distanciaKM>7)
    		{
        	this.satisfecho=true;
        	this.peso=this.peso-1;
    		}
    }
    

    public void comer(String cantidad) {
        switch (cantidad) {
            case "poco":
                // baja de peso 0.5
            	this.peso=this.peso-Float.parseFloat("0.5");
                break;
            case "mucho":
                // sube de peso 1
            	this.peso=this.peso+1;
                break;
            case "nada":
                // baja de peso 1
            	this.peso=this.peso-1;
                break;

            default:
                /*
                 * el peso no cambia y el estado "satisfecho cambia a true"
                 */
            	this.satisfecho=true;
            	
        }
    }

    @Override
 	public String toString() {
     	DecimalFormat formato1 = new DecimalFormat("#.00");
 		return "Persona [nombre=" + nombre + ", altura=" + formato1.format(altura) + " mts. , edad=" + edad + ", peso=" + peso
 				+ ", satisfecho=" + satisfecho + "]";
 	}
}
