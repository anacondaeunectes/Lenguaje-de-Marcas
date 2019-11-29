package eje16_Juego;

public class Personaje {
	protected String nombre;
	protected int energia;
	
	public Personaje(String nombre, int energia) {
		this.nombre = nombre;
		this.energia = energia;
	}
	
	public void alimentarse(int energia_obtenida) {
		this.energia+=energia_obtenida;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", energia=" + energia + "]";
	}
	
	
	
}