package com.esolutions.trainings.java.nivelacion.ex3;

public class MonthFromDate {
    public String monthFrom(String date) {
        String mes;
        mes = date.substring(2,4);
        return mes;
    }
}
