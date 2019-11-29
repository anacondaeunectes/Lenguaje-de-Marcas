package eje17_Ordenador;

public class Servidor extends Ordenador {
	private double monitor;
	private String modeloTeclado;
	private String modeloRaton;
	
	public Servidor(double ram, double discoDuro, String modeloProcesador, String modeloGrafica, double precio, double monitor, String modeloTeclado, String modeloRaton) {
		super(ram, discoDuro, modeloProcesador, modeloGrafica, precio);
		this.monitor=monitor;
		this.modeloTeclado=modeloTeclado;
		this.modeloRaton=modeloRaton;
	}
	
//	Getters y Setters
	public double getMonitor() {
		return monitor;
	}

	public void setMonitor(double monitor) {
		this.monitor = monitor;
	}

	public String getModeloTeclado() {
		return modeloTeclado;
	}

	public void setModeloTeclado(String modeloTeclado) {
		this.modeloTeclado = modeloTeclado;
	}

	public String getModeloRaton() {
		return modeloRaton;
	}

	public void setModeloRaton(String modeloRaton) {
		this.modeloRaton = modeloRaton;
	}
	
	
}
