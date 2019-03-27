package com.esolutions.trainings.java.nivelacion.ex4;

public class Palindrome {

    public boolean isPalindrome(String s) {
    	String palabra = s;
    	int inc = 0;
    	int des = palabra.length()-1;
    	boolean bError = false;
    	
    	while ((inc<des) && (!bError)){
    		 
    		if (palabra.charAt(inc)==palabra.charAt(des)){				
    			inc++;
    			des--;
    		} else {
    			bError = true;
    		}
    	}
    	
    	if (!bError) {
    		System.out.println(palabra + " es un PALINDROMO");
    	return true;}
    	else {
    		System.out.println(palabra + " NO es un palindromo");
        return false;}
    }
}
