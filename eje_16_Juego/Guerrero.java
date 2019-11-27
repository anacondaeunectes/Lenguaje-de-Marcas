package eje_16_Juego;

public class Guerrero extends Personaje{
	private String arma;
	
	public Guerrero(String nombre, int energia, String arma) {
		super(nombre, energia);
		this.arma=arma;
	}
	
	public String combatir(int energia_gastada) {
		energia-=energia_gastada;
	}
}
