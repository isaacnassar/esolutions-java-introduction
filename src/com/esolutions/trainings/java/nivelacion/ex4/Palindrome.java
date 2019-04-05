package com.esolutions.trainings.java.nivelacion.ex4;

public class Palindrome {

    public boolean isPalindrome(String s) {
        String auxiliar = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            auxiliar = auxiliar + s.charAt(i);
        }
        if (s.equalsIgnoreCase(auxiliar) == true) {
            return true;
        } else {
            return false;
        }
    }
}