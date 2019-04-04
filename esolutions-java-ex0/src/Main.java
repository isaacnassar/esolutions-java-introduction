import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		 BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
	        Persona p[] = new Persona[3];
	        int suma=0;
	        float alt=0;
	        for (int i=0; i<p.length ; i++)
	        	{
	        		System.out.println("Ingrese el nombre de la "+(i+1)+"° persona:");
	        		String n1= in.readLine();
	        		System.out.println("Ingrese la altura de la "+(i+1)+"° persona:");
	        		float a1= Float.parseFloat(in.readLine());
	        		System.out.println("Ingrese la edad de la "+(i+1)+"° persona:");
	        		int e1= Integer.parseInt(in.readLine());
	        		
	        		p[i]= new Persona (n1, a1, e1);
	        		if (i==0) {
	        			System.out.println(p[i].toString() + ". Su nombre tiene "+p[i].cantVocales(n1)+" vocales.");
	        		}
	        		suma=suma+e1;
	        	}
	        System.out.println(" El promedio de edad es de: "+suma/p.length);
	        int pos=0;
	        for (int i = 0; i < p.length; i++) {
	        	if(alt > p[i].getAltura()) {
	        		pos=i;
	        	}
			}
	        System.out.println(" El nombre de la persona más alta es: "+p[pos].getNombre());
	}

}
