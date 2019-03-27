package com.esolutions.trainings.java.nivelacion.ex1;

public class Converter {

    public String intToString(int i) {
        String n= Integer.toString(i);
        return n;
    }

    public int stringToInt(String s) {
        int i= Integer.parseInt(s);
        return i;
    }

    public double stringToDouble(String s) {
        double d= Double.parseDouble(s);
        return d;
    }
}
