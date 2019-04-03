package com.esolutions.trainings.java.nivelacion.ex4;

public class Palindrome {
/*
    public boolean isPalindrome(String s) {
        if(s.length() == 1 || s.length() == 0)
            return true;
        else{
            if(s.charAt(0) == s.charAt(s.length()-1) )
                return isPalindrome(s.substring(1,s.length()-1));
            return false;
        }
    }
*/


    public boolean isPalindrome(String s) {
        int inicio = 0;
        int fin = s.length() - 1;
        boolean pal = true;
        while (inicio < fin) {
            if (s.charAt(inicio) != s.charAt(fin)) {
                pal = false;
            }
            inicio++;
            fin--;
        }
        return pal;
    }









}