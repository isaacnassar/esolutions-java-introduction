package com.esolutions.trainings.java.nivelacion.ex6;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.sql.Array;
import java.util.ArrayList;

public class JavaCollections {

	public  Integer  [] distinct(int[] arr) {
		int cont=1;
		Map<Integer, Integer> mapa = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (mapa.containsKey(arr[i])) {
				mapa.put(arr[i], cont + 1);
			} else {
				mapa.put(arr[i],cont);
			}
		}
		Integer[] claves = mapa.keySet().toArray(new Integer[0]);
		 Arrays.sort(claves);
		return claves;
	}
public int [] sorted(int []arr) {
	int n = 0;

    for (int i = 0; i < arr.length; i++) {
        for (int j = 1; j < (arr.length - i); j++) {
            if (arr[j - 1] > arr[j]) {
                n = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = n;
            }
        }
    }
    return arr;
}
	public int[] sorted2(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}

	/**
	 * Debe contar la cantidad de ocurrencias de cada numero de 'arr'
	 *
	 * Ej: arr = [ 0, 0, 1, 2, 2, 2 ] return map = { 0: 2, 1: 1, 2: 3 }
	 *
	 * @param arr entrada
	 * @return map con cantidada de repeticiones por numero de entrada
	 */
	public Map<Integer, Integer> countByNumber(int[] arr) {
		Map<Integer, Integer> mapa = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (mapa.containsKey(arr[i])) {
				mapa.put(arr[i], mapa.get(arr[i]) + 1);
			} else {
				mapa.put(arr[i], 1);
			}
		}
		return mapa;
	}
}
