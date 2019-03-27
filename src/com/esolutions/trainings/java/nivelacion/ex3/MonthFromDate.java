package com.esolutions.trainings.java.nivelacion.ex3;

public class MonthFromDate {
    public String monthFrom(String date) {
        String fecha = date;
        String mes= fecha.substring(2, 4);
    	
        return mes;
    }
}
