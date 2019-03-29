package com.esolutions.trainings.java.nivelacion.ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JavaCollections {
    public int[] distinct(int[] arr) {
        // write your code here
        ArrayList<Integer> noRepetidos = new ArrayList<>();
        int [] b = new int[noRepetidos.size()];
        for(int i=0;i<arr.length;i++) {
            if(!noRepetidos.contains(arr[i]))
                noRepetidos.add(arr[i]);
        }
        b = noRepetidos.stream().mapToInt(i -> i).toArray();
        return b;
    }

    public int[] sorted(int[] arr) {
        // write your code here
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
     * @return map con cantidada de repeticiones por numero de entrada
     */
    public Map<Integer, Integer> countByNumber(int[] arr) {
        // write your code here
        Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();
        for (Integer elem : arr){
            if (!mapa.containsKey(elem)){
                mapa.put(elem, 1);
            }else{
                mapa.put(elem, mapa.get(elem) + 1);
            }
        }
        return mapa;
    }
}
