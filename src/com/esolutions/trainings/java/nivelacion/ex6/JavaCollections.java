package com.esolutions.trainings.java.nivelacion.ex6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class JavaCollections {
    public int[] distinct(int[] arr) {
        arr = Arrays.stream(arr).distinct().toArray();
        /*Set<Integer> list = new HashSet();
        for (int i = 0; i < arr.length ; i++) {
            list.add(arr[i]);
        }
        int iNewArr = 0;
        int [] newArr = new int[list.size()];
        for (Integer i : list){
            newArr[iNewArr++] = i;
        }*/
        return arr;
    }

    public int[] sorted(int[] arr) {
        //arr = Arrays.stream(arr).sorted().toArray();
        int temp;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < (arr.length - i) ; j++) {
                if (arr[j - 1] > arr[j]) {
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
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.stream(arr)
                .forEach( (e) -> map.put((map.containsKey(e))
                        ? map.put(e,map.get(e) + 1):e,1));
        /*for (int i = 0; i <arr.length ; i++) {
            if (map.containsKey(arr[i])){
               map.put(arr[i],map.get(arr[i]) + 1);
            }else {
                map.put(arr[i],1);
            }
        }*/
        return map;
    }
}
