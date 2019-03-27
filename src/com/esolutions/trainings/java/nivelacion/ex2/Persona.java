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

    public Persona(String nombre, Float altura, Integer edad) {
        this.nombre = nombre;
        this.altura = altura;
        if (edad > 0){
            this.edad = edad;
        }else {
            this.edad = 0;
        }
    }

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
        if (peso > (edad *2))
            this.peso = peso;
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
        if (edad <= 18){
            this.altura = altura + 10.6f;
        }
        edad++;
    }

    public void correr(int distanciaKM) {

        // si la distancia es igual o menor a 7 el estado "satisfecho" cambia a false y
        // el peso no cambia
        // si la distancia es mayor 7 km el estado "satisfecho" cambia a true y el peso
        // baja en 1
        if (distanciaKM <= 7){
            satisfecho = false;
        }else {
            satisfecho = true;
            peso--;
        }
    }

    public void comer(String cantidad) {
        switch (cantidad) {
            case "poco":
                    peso -= 0.5f;
                break;
            case "mucho":
                    peso++;
                break;
            case "nada":
                    peso--;
                break;

            default:
                /*
                 * el peso no cambia y el estado "satisfecho cambia a true"
                 */
                satisfecho = true;
        }
    }

}
