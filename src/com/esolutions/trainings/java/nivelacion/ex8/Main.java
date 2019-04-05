package com.esolutions.trainings.java.nivelacion.ex8;

import com.esolutions.trainings.java.nivelacion.Console;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Console.printHeader(8);

        final Set<Long> ids = new HashSet<>();

        final ExecutorService service = Executors.newFixedThreadPool(8);
        final Callable<Thing> callable = () -> new Thing();
        final List<Callable<Thing>> callables = Collections.nCopies(5000, callable);

        try {
            final List<Future<Thing>> futures = service.invokeAll(callables, 1, TimeUnit.MINUTES);
            for (final Future<Thing> f : futures) {
                final long id = f.get().getId();
//                System.out.println("Id: " + id);
                if (!ids.add(id)) {
                    throw new RuntimeException("Ups! Fallo en el id: " + id);
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }

        Console.printFooter();
    }

}
