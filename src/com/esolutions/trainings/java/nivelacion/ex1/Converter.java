package com.esolutions.trainings.java.nivelacion.ex1;

public class Converter {

    public String intToString(int i) {
    	
    	String num= Integer.toString(i);
        return num;
    }

    public int stringToInt(String s) {
        int letra= Integer.parseInt(s);
        return letra;
    }

    public double stringToDouble(String s) {
        double num=Double.parseDouble(s);
        return num;
    }
}
