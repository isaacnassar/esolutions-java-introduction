package com.esolutions.trainings.java.nivelacion.ex4;

public class Palindrome {

    public boolean isPalindrome(String s) {
        boolean R=true;
        int c=s.length()-1;
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)== s.charAt(c))
            {
                R=true;
                c--;
            }
            else
            {
                R=false;
                break;
            }
        }
        return R;
    }
}
