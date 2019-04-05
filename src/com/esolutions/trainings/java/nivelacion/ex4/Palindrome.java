package com.esolutions.trainings.java.nivelacion.ex4;

public class Palindrome {

    public boolean isPalindrome(String s) {
        String inverse = new StringBuilder(s).reverse().toString();
        return (s.equals(inverse));

        /*int inc = 0;
        int des = s.length()-1;
        while (inc<des){
            if (s.charAt(inc)==s.charAt(des)){
                inc++;
                des--;
            } else {
                return false;
            }
        }*/
//        return true;
    }
}
