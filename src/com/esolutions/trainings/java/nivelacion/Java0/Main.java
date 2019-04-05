package com.esolutions.trainings.java.nivelacion.Java0;

public class Main
{
    public String nombreYApellido;
    public int edad;
    public double altura;

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        nombreYApellido = nombreYApellido;
    }


    public void setPersona(String nYA, int e, double alt)
    {
            nombreYApellido = nYA;
            edad=e;
            altura= alt;

    }

}
