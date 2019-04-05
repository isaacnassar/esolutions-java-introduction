package com.esolutions.trainings.java.nivelacion.ex6;

import java.awt.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaCollections {
    public int[] distinct(int[] arr) {
        // write your code her

        Set<Integer> list = new HashSet<Integer>();

        for(int i=0; i < arr.length; i++){

            list.add(arr[i]);
        }


        ArrayList<Integer> newArr = new ArrayList<Integer>();

        for(int i=0; i< list.size(); i++){

            newArr.add(list[i]);
        }

        return newArr;

    }

    public int[] sorted(int[] arr) {
        // write your code here
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]) {

                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
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

        Map<Integer,Integer> mapa = new HashMap<>();

        int cont = 1;
        for (int i=0; i<arr.length ; i++){

            if(mapa.containsKey(arr[i])) {
                mapa.put(arr[i], mapa.get(arr[i]) + 1);
            }
            else{
                mapa.put( arr[i], 1);
            }

        }

        return mapa;
    }
}
