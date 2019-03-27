package com.esolutions.trainings.java.nivelacion.ex1;

public class Converter {

    public String intToString(int i) {
        String salida;
        int entrada = i;
        salida= Integer.toString(entrada);
        return salida;
    }

    public int stringToInt(String s) {
    	int salida;
    	String entrada=s;
    	salida = Integer.parseInt(entrada);
        return salida;
    }

    public double stringToDouble(String s) {
        double salida;
        String entrada = s;
        salida= Double.parseDouble(entrada);
        return salida;
    }
}
