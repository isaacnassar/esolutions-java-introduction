package com.esolutions.trainings.java.nivelacion.ex4;

public class Palindrome {

    public boolean isPalindrome(String s) {

     int primera = 0;
     int ultima = s.length()-1;


        while (primera<ultima){
            if(s.charAt(primera) == s.charAt(ultima))
            {
                primera++;
                ultima--;
            }
            else {return false;}
        }
        return true;
    }
}
