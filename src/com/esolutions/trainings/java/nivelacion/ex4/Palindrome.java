package com.esolutions.trainings.java.nivelacion.ex4;

public class Palindrome {

    public boolean isPalindrome(String s) {
        //StringBuilder ss = new StringBuilder(s).reverse();
        //ss.reverse();
        //return s.equals(ss.toString());
        for (int i = 0,j=s.length(); i < (s.length()/2); i++,j--){
            if (!s.substring(i,i+1).equals(s.substring(j-1,j))){
                return false;
            }
        }
        return true;
    }
}
