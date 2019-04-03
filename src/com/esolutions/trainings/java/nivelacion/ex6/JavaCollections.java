package com.esolutions.trainings.java.nivelacion.ex6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class JavaCollections {
    public int[] distinct(int[] arr) {
        Set<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
           hashSet.add(arr[i]);
        }

        int[] array = new int[hashSet.size()];
        int k = 0;

        for (Integer i : hashSet) {
            array[k++] = i;

        }

        return array;


    }


    public int[] sorted(int[] arr) {
        Arrays.sort(arr);
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
        Map<Integer, Integer> miMapa = new HashMap<>();
        int cont = 1;
        for (int x = 0; x < arr.length; x++) {
            if (miMapa.containsKey(arr[x])) {
                miMapa.put(arr[x], miMapa.get(arr[x]) + 1);
            } else {
                miMapa.put(arr[x], 1);

            }

        }
        return miMapa;
    }
}

