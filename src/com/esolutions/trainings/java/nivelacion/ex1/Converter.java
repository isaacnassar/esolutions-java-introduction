package com.esolutions.trainings.java.nivelacion.ex1;

public class Converter {

    public String intToString(int i) {
        String x = Integer.toString(i);
        return x;
    }

    public int stringToInt(String s) {
    	int y = Integer.parseInt(s);
        return y;
    }

    public double stringToDouble(String s) {
    	Double z= Double.parseDouble(s);
        return z;
    }
}
