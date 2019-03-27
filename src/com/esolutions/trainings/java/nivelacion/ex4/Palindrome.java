package com.esolutions.trainings.java.nivelacion.ex4;

public class Palindrome {

    public boolean isPalindrome(String s) {
        // write your code here
        String palabra = s;
        int inc = 0;
        int des = palabra.length()-1;

        while (inc<des){
            if (palabra.charAt(inc)==palabra.charAt(des)){
                inc++;
                des--;
            } else {
                return false;
            }
        }

        return true;
    }
}
