package com.esolutions.trainings.java.nivelacion.ex1;

import com.esolutions.trainings.java.nivelacion.Console;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(1);

        Converter converter = new Converter();


        System.out.println("intToString: " + converter.intToString(50));
        System.out.println("stringToInt: " + converter.stringToInt("200"));
        System.out.println("stringToDouble: " + converter.stringToDouble("20.44"));

        Console.printFooter();
    }

}
