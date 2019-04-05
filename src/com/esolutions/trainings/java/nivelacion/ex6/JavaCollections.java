package com.esolutions.trainings.java.nivelacion.ex6;

import java.util.Map;
import java.util.stream.IntStream;

public class JavaCollections {
    public int[] distinct(int[] arr) {
        arr = IntStream.of(arr).distinct().toArray();
        return arr;
    }

    public int[] sorted(int[] arr) {
        arr = IntStream.of(arr).sorted().toArray();
        return arr;
    }

    /**
     * Debe contar la cantidad de ocurrencias de cada numero de 'arr'
     * <p>
     * Ej:
     * arr = [ 0, 0, 1, 2, 2, 2 ]
     * return map = {
     * 0: 2,
     * 1: 1,
     * 2: 3
     * }
     *
     * @param arr entrada
     * @return map con cantidada de repeticiones por numero de entrada
     */
    public Map<Integer, Integer> countByNumber(int[] arr) {

        return null;
    }
}
