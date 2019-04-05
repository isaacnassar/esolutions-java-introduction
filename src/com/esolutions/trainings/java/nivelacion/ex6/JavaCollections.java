package com.esolutions.trainings.java.nivelacion.ex6;

import com.sun.javafx.collections.MappingChange;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JavaCollections {

    public int resta(int[] arr) {
        int resta = 0;
        int n = arr[0];
        int conrep = 0;
        for (int i = 1; i < arr.length; i++) {
            if (n == arr[i]) {
                conrep++;
            } else {
                n = arr[i];
            }
        }
        resta = arr.length-conrep;
        return resta;
    }

    public int[] distinct(int[] arr) {
        int resta = resta(arr);
        int[] aux = new int[resta];
        int position = 0;
        sorted(arr);

        aux[0] = arr[0];
        position ++;
        for (int i = 1; i < arr.length; i++) {
            boolean exists = false;

            for (int j = 0; j < aux.length; j++) {
                if (aux[j] == arr[i]) {
                    exists = true;
                }
            }

            if(!exists){
                aux[position] = arr[i];
                position ++;
            }
        }

        return aux;
    }

    //10, 20, 40, 123, 90, 88, 122, 44, 100, 121, 99, 99, 123, 0, 90, 1, 90, 2, 90
    public int[] sorted(int[] arr) {

        int temp;

        for (int i = 1; i < arr.length; i++) {
            for (int k = arr.length - 1; k >= i; k--) {
                if (arr[k] < arr[k - 1]) {
                    temp = arr[k];
                    arr[k] = arr[k - 1];
                    arr[k - 1] = temp;
                }
            }
        }
        return arr;
    }



/*
    public int[] sorted(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }*/

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
        Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();
        int[] arrAUX = distinct(arr);
        int largo = arrAUX.length;
        for (int f = 0; f < largo; f++) {
            int key = arrAUX[f];
            int cantidad = cantidad(key, arr);
            mapa.put(key, cantidad);
        }
        return mapa;
    }

    public int cantidad(int a, int[] arr) {
        sorted(arr);
        int cant = 0;
        int n = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (a == arr[i]) {
                cant++;
            } else
                n = arr[i];
        }

        return cant;
    }
/*
    public int [] distinct(int [] arr)
    {
        int [] limpio = new int[0]; //Array final con los numeros sin repetir
        int j = 0; //Cantidad de numeros sin repetir

        for (int i = 0; i < arr.length; i++)
        {
            int n = arr[i]; //Numero del vector con repeticiones

            if(existe(n, limpio) == false) //Verifica si existe en el array sin repetir
            {
                if (j == limpio.length) //Consulta si hay que ampliar el array de sin repetir
                {
                    //En el caso que si, se auto envia para ampliar la cantidad de numeros que puede contener
                    limpio = copy(limpio);
                }

                limpio[j] = n; //Asigna el nuevo numero sin repetir en el array
                j++; //Aumenta en uno la cantidad elementos encontrados sin repetir.
            }
        }

        return limpio; //Retorna el array sin repeticiones
    }

    public int[] copy(int [] original)
    {
        int [] aux = new int[original.length+1]; //Crea un array con tamaño+1 del que se desea ampliar

        System.arraycopy(original, 0, aux, 0, original.length); //Realiza la copia del array

        return aux; //Array aumentado en 1 con respecto al original.
    }

    public boolean existe(int n, int [] limpio)
    {
        for (int i : limpio)
        {
            if (i == n) return true; //Ya existe en el array
        }
        return false; //No existe en el array
    }
*/
}
