package com.esolutions.trainings.java.nivelacion.ex6;

import java.util.Arrays;
import java.util.Map;

public class JavaCollections {

    public int[] distinct(int[] arr) {
       // return Arrays.stream(arr).distinct().toArray();
        sorted(arr);
        int [] aux = new int[tamaño(arr)];
        int pInicial = 0;
        aux[0]= arr[0];
        for (int i = 1; i <arr.length-1 ; i++)
        {
            if(aux)

        }
        return aux;
        }


    public int tamaño(int[] arr) {
        int valor1 = 0;
        int contador = 0;
        int nuevo = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (nuevo == arr[i]) {
                contador++;
            } else {
                nuevo = arr[i];
            }
            valor1= arr.length-contador;

        }return valor1;
    }

    public int[] sorted(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
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
        // write your code here
        return null;
    }
}
