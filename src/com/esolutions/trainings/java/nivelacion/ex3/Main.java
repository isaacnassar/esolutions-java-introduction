package com.esolutions.trainings.java.nivelacion.ex3;

import com.esolutions.trainings.java.nivelacion.Console;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(3);
        MonthFromDate mfd = new MonthFromDate();

        System.out.println("1) " + mfd.monthFrom("01012010"));
        System.out.println("2) " + mfd.monthFrom("22102018"));
        System.out.println("3) " + mfd.monthFrom("31112019"));

        Console.printFooter();
    }

}
