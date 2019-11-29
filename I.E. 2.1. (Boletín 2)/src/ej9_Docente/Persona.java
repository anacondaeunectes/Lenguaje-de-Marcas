package ej9_Docente;

public class Persona {
	private String apellidos;
	private String nombre;
	private String sexo;
	private String dni;
	
	public Persona(String apellidos, String nombre, String sexo, String dni) {
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.sexo = sexo;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Nombre: "+ nombre + ". Apellidos: " + apellidos + ". Sexo: " + sexo + ". DNI: " + dni + ".";
	}
	
	
	
	
	
}
