package com.esolutions.trainings.java.nivelacion.ex6;

import java.util.*;

public class JavaCollections {
    public int[] distinct(int[] arr) {
        Set<Integer> dist= new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            dist.add(arr[i]);
        }
        int idx = 0;
        int[] d = new int[dist.size()];
        for (Integer var:dist) {
            d[idx++]=var;
        }
        return d;
    }

    public int[] sorted(int[] arr) {
        int aux;
        for(int i=1; i<arr.length; i++){
            for (int j=0; j<arr.length-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
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
     * @return map con cantidada de repeticiones por numero de entrada
     */
    public Map<Integer, Integer> countByNumber(int[] arr) {
        Map<Integer, Integer> ocurr = new HashMap<Integer, Integer>();
        int value=0;
        for (int i = 1; i < arr.length ; i++) {
            value=ocurr.containsKey(arr[i])?ocurr.get(arr[i])+1:1;
            ocurr.put(arr[i],value);
        }
        return ocurr;
    }
}
