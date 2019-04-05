package com.esolutions.trainings.java.nivelacion.ex3;

public class MonthFromDate {
	private String date;
	private String month;
	
	
	
    public String monthFrom(String date) {
        // write your code here
    	this.date= date;
    	String month= date.substring(2, 4);
    	
    	/*charAt(2) devuelve el valor*/
    		
        return month;
    }
}
