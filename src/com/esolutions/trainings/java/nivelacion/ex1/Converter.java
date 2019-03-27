package com.esolutions.trainings.java.nivelacion.ex1;

import java.lang.String;

public class Converter {

    public String intToString(int i) {
        String a;
        a = Integer.toString(i);
        return a;
    }

    public int stringToInt(String s) {
        Integer a;
        a= Integer.parseInt(s);
        return a;
    }

    public double stringToDouble(String s) {
        double a;
        a = Double.parseDouble(s);
        return a;
    }
}
