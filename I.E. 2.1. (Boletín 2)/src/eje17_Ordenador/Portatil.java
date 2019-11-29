package eje17_Ordenador;

public class Portatil extends Ordenador {
	private String marca;
	private double dimensionPantalla;
	private double peso;
	
	public Portatil(double ram, double discoDuro, String modeloProcesador, String modeloGrafica, double precio) {
		super(ram, discoDuro, modeloProcesador, modeloGrafica, precio);
	}
	
//	Getters y Setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getDimensionPantalla() {
		return dimensionPantalla;
	}

	public void setDimensionPantalla(double dimensionPantalla) {
		this.dimensionPantalla = dimensionPantalla;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
