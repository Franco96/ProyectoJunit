public class Persona {
	
	private String nombre;
	private int edad;
	
	

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


	public String saludar() {
		
		return "Hola soy "+nombre;
	}
	
	public boolean esMayorQue(Persona person) {
		
		if(this.edad> person.edad)
			return true;
		else
			return false;
		
	}
	
	public int cumpleanios() {
		
		this.edad++;
		
		return edad;
		
	}
	
	

}
