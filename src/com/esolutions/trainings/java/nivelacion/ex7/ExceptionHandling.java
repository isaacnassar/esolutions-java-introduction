package com.esolutions.trainings.java.nivelacion.ex7;


public class ExceptionHandling {

    public int countFailures(int rounds, VeryImportantResource res) {
    	int countRuntimeException=0;
    	for( int i = 0 ; i < rounds ; i++ ) 
    	{
    		try
            { 
              if (!res.isOpen())
            	  {
            	    res.open();
            	    res.use();
            	  }
              else 
                  {
            	  res.use();
                  }
            } 
              
            catch(RuntimeException ex) 
            { 
            	countRuntimeException++; 
            } 
            finally
            {  
            	if (res.isOpen()) {
                	res.close(); 
            	}
            } 
    	}
    	
        return countRuntimeException;
    }

}
