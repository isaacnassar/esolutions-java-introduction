package com.esolutions.trainings.java.nivelacion.ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class JavaCollections {
    public int[] distinct(int[] arr) {
   //b. Obtener un array que solo contenga los valores no repetidos. 
    	ArrayList<Integer> distintos = new ArrayList<Integer>();
    	
    	for (int i = 0; i < arr.length; i++) {
    		
				if (!distintos.contains(arr[i])) {
					distintos.add(arr[i]);		
			}
			
		}
    	int [] array = new int[distintos.size()];
    	for (int i = 0; i < distintos.size(); i++) {
			array[i]=distintos.get(i);
	
		}
        return array;
    }

    
    
    public int[] sorted(int[] arr) {
    //a.Ordenar todos los datos del array.
    	int [] a = arr;
    	Arrays.sort(a);
    	
    return a;
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
//c. Obtener un mapa cuyas claves sean cada uno de los valores no repetidos del array original 
//y el valor la cantidad de ocurrencias de ese número en el array original.
     int [] a = arr;
    //	Arrays.sort(a);
    	int v=1;
    	Map<Integer, Integer> mapa1 = new HashMap<Integer, Integer>();

    	for (int i = 0; i < a.length; i++) {
			if (!mapa1.containsKey(a[i])) {
				mapa1.put(a[i], v);
			}
			else {
				mapa1.put(a[i], mapa1.get(a[i])+1);
			}
		}
    	
        return mapa1;
    }
}
