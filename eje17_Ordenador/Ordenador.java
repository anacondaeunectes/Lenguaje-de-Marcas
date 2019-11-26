package eje17_Ordenador;

public class Ordenador {
	private double ram;
	private double discoDuro;
	private String modeloProcesador;
	private String modeloGrafica;
	private double precio;
	
	public Ordenador(double ram, double discoDuro, String modeloProcesador, String modeloGrafica, double precio) {
		this.ram = ram;
		this.discoDuro = discoDuro;
		this.modeloProcesador = modeloProcesador;
		this.modeloGrafica = modeloGrafica;
		this.precio = precio;
		
	}

	public double getRam() {
		return ram;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}

	public double getDiscoDuro() {
		return discoDuro;
	}

	public void setDiscoDuro(double discoDuro) {
		this.discoDuro = discoDuro;
	}

	public String getModeloProcesador() {
		return modeloProcesador;
	}

	public void setModeloProcesador(String modeloProcesador) {
		this.modeloProcesador = modeloProcesador;
	}

	public String getModeloGrafica() {
		return modeloGrafica;
	}

	public void setModeloGrafica(String modeloGrafica) {
		this.modeloGrafica = modeloGrafica;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}	
	
	
}
