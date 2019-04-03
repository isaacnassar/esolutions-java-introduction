package com.esolutions.trainings.java.nivelacion.ex1;

public class Converter {

    public String intToString(int i) {
            String cadena = String.valueOf(i);
            return cadena;
            //mayuscula es una clase, clase y punto me trae los metodos de la clase
    }

    public int stringToInt(String s) {
        int entero = Integer.parseInt(s);
        return entero;
    }

    public double stringToDouble(String s) {
        double decimal = Double.parseDouble(s);
        return decimal;
    }
}
