package eje_16_Juego;

public class Personaje {
	private String nombre;
	private int energia;
	
	public Personaje(String nombre, int energia) {
		this.nombre = nombre;
		this.energia = energia;
	}
	
	public void alimentarse(int energia_obtenida) {
		this.energia-=energia_obtenida;
	}
	
}
