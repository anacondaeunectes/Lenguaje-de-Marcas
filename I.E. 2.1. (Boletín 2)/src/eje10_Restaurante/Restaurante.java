package eje10_Restaurante;

public class Restaurante {
	private double papas;
	private double chocos;
	private int comensales;
	
	
	
	public Restaurante(double papas, double chocos) {
		this.papas = papas;
		this.chocos = chocos;
	}

	public void addChocos(double x) {
		chocos+=x;
	}
	
	public void addPapas(double x) {
		papas+=x;
	}
	
	public int getComensales() {
		double comensales_papas = (int)(papas*3);
		double comensales_chocos = (int)((chocos/2)*3);
		
//		if(papas<1 || chocos<0.5) {
			if (comensales_papas >= comensales_chocos) {
				comensales = (int)comensales_chocos;
			} else {
				comensales = (int)comensales_papas;
				
			}
		
			return comensales;
//		}
	}
	
	public void showChocos() {
		System.out.println("En el almacen hay "+chocos+" kilos de chocos.");
	}
	
	public void showPapas() {
		System.out.println("En el almacen hay "+papas+" kilos de papas.");
	}
}
