package com.esolutions.trainings.java.nivelacion.ex4;

public class Palindrome {

    public boolean isPalindrome(String s) {
        // write your code here
        String inversa="";
        for(int i=s.length()-1; i>=0; i--){
            inversa += s.substring(i,i+1);
        }
        if(inversa.equals(s)){
            return true;
        }else{
            return false;
        }
    }
}
