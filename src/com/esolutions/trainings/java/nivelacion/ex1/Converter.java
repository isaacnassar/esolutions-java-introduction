package com.esolutions.trainings.java.nivelacion.ex1;

public class Converter {

    public String intToString(int i) {

        String intToString = Integer.toString(i);

        return intToString;
    }

    public int stringToInt(String s) {
         int stringToInt = Integer.parseInt(s);
        return stringToInt;
    }

    public double stringToDouble(String s) {
        double stringToDouble =  Double.parseDouble(s);
        return stringToDouble;
    }
}
