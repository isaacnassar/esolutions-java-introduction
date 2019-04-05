package com.esolutions.trainings.java.nivelacion.ex4;

public class Palindrome {

    public boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());

    }
}
