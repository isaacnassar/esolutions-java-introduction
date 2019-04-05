package com.esolutions.trainings.java.nivelacion.ex7;

import java.util.Random;

public class VeryImportantResource implements AutoCloseable {
    private final Random random = new Random();
    private boolean open = false;

    public void open() {
        if (open) {
            throw new RuntimeException("YA ESTA ABIERTO!");
        }

        open = true;
       // System.out.println("OPEN!!");
    }

    public void use() {
        if (!open) {
            throw new Error("Deberias probar con open() ¬¬");
        }
        if (random.nextInt() > 0.7) {
            throw new RuntimeException("Ooops!");
        }
    }

    @Override
    public void close() {
        if (!open) {
            throw new RuntimeException("NUNCA SE ABRIO!!");
        }

        open = false;
       // System.out.println("CLOSE!!");
    }

    public boolean isOpen() {
        return open;
    }
}
