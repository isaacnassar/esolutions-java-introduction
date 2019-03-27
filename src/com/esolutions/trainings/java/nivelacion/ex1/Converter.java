package com.esolutions.trainings.java.nivelacion.ex1;

public class Converter {

    public String intToString(int i) {
        int numentero = i;
        String mensajeString = String.valueOf(numentero);
        return mensajeString;
    }

    public int stringToInt(String s) {
        int b = Integer.parseInt(s);
        return b;
    }

    public double stringToDouble(String s) {
        double doble = Double.parseDouble(s);
        return doble;
    }
}
