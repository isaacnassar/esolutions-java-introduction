package com.esolutions.trainings.java.nivelacion.ex2;

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

    private String nombre;
    private Float altura;
    private Integer edad;
    private Float peso;
    private boolean satisfecho;

    /*
     * Agregar un constructor que permita crear una nueva persona asignando un
     * nombre y edad Si la edad es menor a cero se debe asignar el valor edad = 0.
     */
    
	
	public Persona(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
		if (edad <0) {
			this.edad=0;
		}
	}
    

    public String getNombre() {
        return nombre;
    }

    @Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + "]";
	}

	public Persona(String nombre, Float altura, Integer edad) {
		this.nombre = nombre;
		this.altura = altura;
		this.edad = edad;
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
    public void pesoNoMenorEdad(float p, int e) {
    	p = peso;
    	e = edad;
    	if (peso<(edad * 2)) {
    		System.out.println("El peso no puede ser menor al doble de la edad");
    	}	else {
    		System.out.println("La relación entre el peso y la edad está bien");
    	}
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isSatisfecho() {
        return satisfecho;
    }

    public void setSatisfecho(boolean satisfecho) {
        this.satisfecho = satisfecho;
    }

    public void crecer() {
        // controlar que solo aumente la altura hasta los 18 aï¿½os
    	if (this.edad<18) {
    		this.altura = altura + 10.6f;
    		this.edad= edad + 1;
    	}
        // cada vez que se llama al metodo crecer se debe aumentar un aï¿½o.
        
    }

    public void correr(int distanciaKM) {
    	int d = distanciaKM;
    	if(d<=7) {
    		this.satisfecho=false;
    	}else
    		if (d>7) {
    			this.satisfecho=true;
    			this.peso= peso-1;
    		}
        // si la distancia es igual o menor a 7 el estado "satisfecho" cambia a false y
        // el peso no cambia
        // si la distancia es mayor 7 km el estado "satisfecho" cambia a true y el peso
        // baja en 1
    }

    public void comer(String cantidad) {
        switch (cantidad) {
            case "poco":
            	this.peso=peso-0.5f;
                // baja de peso 0.5
                break;
            case "mucho":
            	this.peso=peso+1;
                // sube de peso 1
                break;
            case "nada":
            	this.peso= peso-1;
                // baja de peso 1
                break;

            default:
            	this.satisfecho=true;
                /*
                 * el peso no cambia y el estado "satisfecho cambia a true"
                 */
        }
    }

}
