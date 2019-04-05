package com.esolutions.trainings.java.nivelacion.ex1;

public class Converter {

    public String intToString(int i) {
        String stringReturn = String.valueOf(i);
        return stringReturn;
    }

    public int stringToInt(String s) {
        int intReturn = Integer.parseInt(s);
        return intReturn;
    }

    public double stringToDouble(String s) {
        Double doubleReturn = Double.parseDouble(s);
        return doubleReturn;
    }
}
