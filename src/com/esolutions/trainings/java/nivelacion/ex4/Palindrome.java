package com.esolutions.trainings.java.nivelacion.ex4;

public class Palindrome {

    public boolean isPalindrome(String s) {
        String cadena1 = "";
        //inicializar la variable i  en el maximo tamaño del objeto s
        for (int i = s.length() - 1; i >= 0; i--) {
            // i= i - 1
            // Acumulador
            cadena1 = cadena1 + s.charAt(i);
        }
        if (s.equals(cadena1) == true) {
            return true;
        } else {
            return false;
        }
    }
}