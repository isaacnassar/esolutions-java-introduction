package com.esolutions.trainings.java.nivelacion.ex1;

public class Converter {

    public String intToString(int i) {

        i=60;

        String intToString = Integer.toString(i);

        return intToString;
    }

    public int stringToInt(String s) {

        s="23112332";

        int stringInt = Integer.parseInt(s);

        return stringInt;
    }

    public double stringToDouble(String s) {

        s = "123.4500";

        double d = Double.parseDouble(s);

        return d;
    }
}
