package com.esolutions.trainings.java.nivelacion.ex4;

public class Palindrome {

    public boolean isPalindrome(String s) {
    	int inicio = 0;
    	int largo = s.length()-1;
    	
    	while (inicio<largo){
    		 
    		if (s.charAt(inicio)==s.charAt(largo)){				
    			inicio++;
    			largo--;
    		} else {
    			return false;
    		}
    	}
        return true;
    }
}
