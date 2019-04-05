package com.esolutions.trainings.java.nivelacion.ex6;

import java.util.Map;
import java.util.Arrays;
import java.util.LinkedHashMap;


public class JavaCollections {
   
	public int[] distinct(int[] arr) {
		
        int[ ] unicos = new int[ arr.length ];
        int q = 0;
        for( int i = 0 ; i < arr.length ; i++ ) {
            boolean existe = false;
            for( int j = 0 ; j < q ; j++ ) {
                if( unicos[ j ] == arr[ i ] ) {
                    existe = true;
                    break;
                }
            }
            if( !existe ) {
                unicos[ q++ ] = arr[ i ];
            }
        }

      
        unicos = Arrays.copyOf( unicos , q );
        //Arrays.sort(arr);
          return unicos;
    }
    
    

    public int[] sorted(int[] arr) {
    	int temporal=0;	
    	for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temporal = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temporal;
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
    	Map<Integer, Integer> mapa = new LinkedHashMap<Integer, Integer>();
    	int[ ] unico = new int[ arr.length ];
    	unico= this.distinct(arr);
    	for( int i = 0 ; i < unico.length ; i++ )
    	{   int count=0;
    		for( int j = 0 ; j < arr.length ; j++ ) 
    		{
    			if (unico[i]==arr[j])
    			{
    				count++;
    			}
    		}
    		mapa.put(unico[i], count);
    	}
    	
        return mapa;
    }
}
