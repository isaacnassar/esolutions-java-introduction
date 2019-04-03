package com.esolutions.trainings.java.nivelacion.ex4;

public class Palindrome {

    public boolean isPalindrome(String s) {
        
    	int c= s.length() -1;
    	boolean r= true;
    	
    	for (int i=0; i< s.length(); i++ )
    	{
    		if (s.charAt(i) == s.charAt(c))
    		{
    			r= true;
    			c--;
    		}
    		else
    		{
    			r=false;
    			break;
    			
    		}
    	}
    	return r;
    }
}
