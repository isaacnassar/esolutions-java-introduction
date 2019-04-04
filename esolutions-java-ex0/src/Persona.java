
public class Persona {

	private String nombre;
	private int edad;
	private float altura;
	
	public Persona() {
		
	}
	public Persona(String nombre, float altura, int edad) {
    	this.setNombre(nombre);
    	this.setAltura(altura);
    	this.setEdad(edad);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public String toString (){
        String mensaje="Nombre "+nombre+" con "+edad+" años " +
                "y de altura "+altura;
        return mensaje;
    }
	//Crear un método que reciba por parámetro de la edad una persona y responda a la pregunta

	//¿Es mayor? Respondiendo “falso” si es menor a 18 y “verdadero” si tiene 18 o más.
	
	public boolean esMayor (){
		if(edad>=18) {
			return true;
		}else{
			return false;
		}
	}
	//Crear un método que revisa un nombre, apellido y devuelva únicamente el nombre.
	public String nombre(String nombre) {
		String nom=nombre;
		nom.split(" ");
		return nom;
	}
	//Crear un método que retorne la cantidad de vocales que tiene un nombre
	public int cantVocales(String nom) {
		int cant=0;
		for (int x = 0; x < nom.length(); x++) {
			if ((nom.charAt(x)=='a') || (nom.charAt(x)=='e') || (nom.charAt(x)=='i') || (nom.charAt(x)=='o') || (nom.charAt(x)=='u')){
			    cant++;
			  }
			
		}
		return cant;
	}
}
