package eje16_Juego;

/**
 * 
 * @author peiboli
 *
 */
public class Mago extends Personaje {
	/**
	 * 
	 */
	private String poder;
	
	/**
	 * 
	 * @param nombre
	 * @param poder
	 */
	public Mago(String nombre, String poder) {
		super(nombre, 100);
		this.poder=poder;
	}
	
	public String encantar() {
		this.energia-=2;
		return toString()+"Ha usado su poder"+ poder +"y ";
	}
}
