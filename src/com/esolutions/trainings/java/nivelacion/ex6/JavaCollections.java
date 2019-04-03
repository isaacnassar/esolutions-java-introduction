package com.esolutions.trainings.java.nivelacion.ex6;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.stream.IntStream;

public class JavaCollections {

    public int[] distinct(int[] arr) {
        return IntStream.of(arr).distinct().toArray();
    }

    public int[] sorted(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    /**
     * Debe contar la cantidad de ocurrencias de cada numero de 'arr'
     *
     * Ej:
     * arr = [ 0, 0, 1, 2, 2, 2 ]
     * return map = {
     *   0: 2,
     *   1: 1,
     *   2: 3
     * }
     *
     * @param arr entrada
     * @return map con cantidad de repeticiones por numero de entrada
     */
    public Map<Integer, Integer> countByNumber(int[] arr) {

        Map<Integer, Integer> mapOcurr = new HashMap();
        for(int x:arr){
            if(!mapOcurr.containsKey(x))
                mapOcurr.put(x,1);
            else
                mapOcurr.put(x, mapOcurr.get(x)+1);
        }

        return mapOcurr;
    }
}