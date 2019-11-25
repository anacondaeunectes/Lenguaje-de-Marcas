package eje14_Marcianos;

public class Marciano {
	private boolean vivo=false;
	private String nombre;
	private static int numMarcianos;
	
	public Marciano(String nombre) {
		this.vivo=true;
		this.nombre=nombre;
		numMarcianos++;
		nace();
	}
	
	public String nace() {
		return "Hola, he nacido y soy el marciano "+nombre+".\nMarcianos vivos: "+cuentaMarcianos()	;
		
	}
		
	public String muere() {
		if (vivo == true) {
			this.vivo=false;
			numMarcianos--;
			return "El marciano "+nombre+" ha muerto.";
		}else {
			return "El marciano "+nombre+" ya esta muerto.";
		}
	} 
	
	public String estaVivo() {
		if (vivo == true) {
			return "El marciano "+nombre+" esta vivo.";
		}else {
			return "El marciano "+nombre+" esta muerto.";
		}
	}
	
	public int cuentaMarcianos() {
		return numMarcianos;		
	}
}
