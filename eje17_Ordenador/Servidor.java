package eje17_Ordenador;

public class Servidor extends Ordenador {
	
	private double monitor;
	private String modeloTeclado;
	private String modeloRaton;
	
	public Servidor(double ram, double discoDuro, String modeloProcesador, String modeloGrafica, double precio) {
		super(ram, discoDuro, modeloProcesador, modeloGrafica, precio);
	}
}
