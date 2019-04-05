package com.esolutions.trainings.java.nivelacion.ex4;

public class Palindrome {
	private String s;
	private String s2;
	
	
	@Override
	public String toString() {
		return "Palindrome [s=" + s + ", s2=" + s2 + "]";
	}
	
	public Palindrome() {
		
	}
	public String palabra2(String s) {
		this.s= s;
		String s2= "";
		
		for (int i= s.length(); i>=1; i--){
			s2=s2+ s.charAt(i-1);
				
		}
		System.out.println("Palabra s: "+s+ " Palabra s2: "+s2);
		return s2;
	}
    public boolean isPalindrome(String s) {
        // write your code here
    	// string.reverse()
    	//equal compara los valores de dos objetos.. == se fija si s y s2 apuntan al mismo objeto
    	this.s= s;
    	this.s2= palabra2(s);
    	if (s.equals(s2)) {
    		return true;
    	}
    	
        return false;
    }
}
