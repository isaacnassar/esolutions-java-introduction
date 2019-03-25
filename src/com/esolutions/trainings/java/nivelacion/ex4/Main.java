package com.esolutions.trainings.java.nivelacion.ex4;

import com.esolutions.trainings.java.nivelacion.Console;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(4);

        Palindrome p = new Palindrome();

        System.out.println("1) " + p.isPalindrome("menem"));
        System.out.println("2) " + p.isPalindrome("ahppyp00pyppha"));
        System.out.println("3) " + p.isPalindrome("880ljukujl88"));
        System.out.println("4) " + p.isPalindrome("yvoytty0vy"));

        Console.printFooter();
    }
}
