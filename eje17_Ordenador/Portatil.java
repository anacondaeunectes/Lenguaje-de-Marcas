package eje17_Ordenador;

public class Portatil extends Ordenador{
	
	private String marca;
	private double dimensionPantalla;
	private double peso;
	
	public Portatil(double ram, double discoDuro, String modeloProcesador, String modeloGrafica, double precio) {
		super(ram, discoDuro, modeloProcesador, modeloGrafica, precio);
	}
	
}
