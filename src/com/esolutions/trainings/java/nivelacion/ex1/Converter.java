package com.esolutions.trainings.java.nivelacion.ex1;

public class Converter {

    public String intToString(int i) {
        // write your code here
        String texto = String.valueOf(i);
        return texto;
    }

    public int stringToInt(String s) {
        // write your code here
        int entero = Integer.parseInt(s);
        return entero;
    }

    public double stringToDouble(String s) {
        // write your code here
        double doble = Double.parseDouble(s);
        return doble;
    }
}
