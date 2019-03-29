package com.esolutions.trainings.java.nivelacion.ex6;

import java.util.Map;
import java.util.HashMap;

public class JavaCollections {


    public int[] sorted(int[] arry) {
        int aux;
        for(int k =0; k< arry.length ; k++) {
            for (int i = 0; i < arry.length-1; i++) {
                if (arry[i] > arry[i + 1]) {
                    aux = arry[i];
                    arry[i] = arry[i + 1];
                    arry[i + 1] = aux;
                }
            }
        }
        return arry;
    }


    public int[] distinct(int[] arr) {
        int repetidos = 37826381;
        int[] arrCopia = new int [arr.length];
        //se crea un array con los mismos valores que el parametro de entrada
        for (int k=0; k< arr.length; k++){
            arrCopia[k] = arr[k];
        }
        /*Arrays.stream(arr).distinct().forEach(System.out::println);*/
        //cambia todos los duplicados por la variable "repetidos"
        for (int i=0; i<arrCopia.length-1;i++) {
            for (int j = 0; j < arrCopia.length; j++) {
               if(j==i){
                   j++;
               }
                if (arrCopia[i] == arrCopia[j]) {
                    if(  j<arrCopia.length-1){
                         arrCopia[j] = arrCopia[j + 1];
                    }
                    arrCopia[j] = repetidos;
                }
            }
        }
        //cuenta la cantidad de repetidos
        int contrep =0;
        for (int i =0; i<arrCopia.length; i++)
        {
            if(arrCopia[i] == repetidos){
                contrep++;
            }
        }
        //crea un array con su length del tamaño del array sin los repetidos y añade los valores no duplicados
        int [] arr2 = new int [arrCopia.length - contrep];
        int l =0;
        for (int i =0; i<arrCopia.length; i++)
        {
            if(arrCopia[i]!=repetidos){
                arr2[l]=arrCopia[i];
                l++;
            }
        }
        return arr2;
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
        Map Mapa1= new HashMap<Integer,Integer>();
        int contador = 0;
        int verificador=0;
        for (int i = 0; i< arr.length-1; i++){
            verificador = arr[i];
           for (int j=0; j<arr.length-1;j++) {
               if (verificador == arr[j+1]) {
                   contador++;
                   Mapa1.put(arr[i], contador);
               } else {
                   contador = 0;
               }
           }
        }
        return Mapa1;
    }
}
