package com.esolutions.trainings.java.nivelacion.ex1;

public class Converter {

    public String intToString(int i) {
        String cadena = Integer.toString(i);
        return cadena;
    }

    public int stringToInt(String s) {
        int i = Integer.parseInt(s);
        //Integer i = Integer.valueOf(s);
        return i;
    }

    public double stringToDouble(String s) {
        double doble = Double.parseDouble(s);
        return doble;
    }
}
