package com.esolutions.trainings.java.nivelacion.ex3;

public class MonthFromDate {
    
	public String monthFrom(String date) {
		String monthDate = null;   
		String mes= date.substring(2,4);
		 
    	switch (mes) {
           case "01":
        	   monthDate="Enero";    	
        	   break;
           case "10":
        	   monthDate="Octubre";
        	   break;
           case "11":
        	   monthDate="Noviembre";
        	   break;
                
       }
        return monthDate;
    }
}
