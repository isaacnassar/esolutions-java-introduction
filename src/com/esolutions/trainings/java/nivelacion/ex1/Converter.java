package com.esolutions.trainings.java.nivelacion.ex1;

public class Converter {

    public String intToString(int i) {
        String cadena = String.valueOf(i);
        return cadena;
    }

    public int stringToInt(String s) {
       Integer entero = Integer.valueOf(s);
        return entero;
    }

    public double stringToDouble(String s) {
        Double decimal = Double.valueOf(s);
        return decimal;
    }
}
