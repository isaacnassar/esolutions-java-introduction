package com.esolutions.trainings.java.nivelacion.ex1;

public class Converter {

    public String intToString(int i) {
        // write your code here

       String cadena = String.valueOf(i);
        return cadena;
    }

    public int stringToInt(String s) {
        // write your code here
        Integer entero = Integer.valueOf(s);
        return entero;
    }

    public double stringToDouble(String s) {
        // write your code here
        Double decimal = Double.valueOf(s);
        return decimal;
    }
}
