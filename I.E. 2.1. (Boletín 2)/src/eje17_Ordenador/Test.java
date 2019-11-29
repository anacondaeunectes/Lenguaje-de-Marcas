package eje17_Ordenador;

import java.util.Scanner;

public class Test {
	
	static Scanner teclado = new Scanner(System.in);
//	Métodos que comprueban los datos introducidos por el usuario
	public static void comprobarServidor(Servidor server) {
		System.out.println("COMPROBANDO SERVIDOR...");
		while(server.getDiscoDuro()%5 != 0) {
			System.out.println("Error. El la capacidad del disco duro ha de ser multiplo de 5.\nReintroduzca la capacidad:");
			double dd = teclado.nextInt();
			server.setDiscoDuro(dd);
		}
		System.out.println("Capacidad de Disco Duro correcta...");
		
		while(server.getModeloGrafica().compareTo("1")) {
			
		}
		
		while(server.getPrecio() < 0) {
			System.out.println("Error. El precio no puede ser menor que 0.\nReintroduzca el precio:");
			double dd = teclado.nextInt();
			server.setPrecio(dd);	
		}
		System.out.println("Precio correcto...");
		while(server.getMonitor() <= 14) {
			System.out.println("Error. El tama�o del monitor no puede ser menor que 14.\nReintroduzca el tama�o:");
			double dd = teclado.nextInt();
			server.setMonitor(dd);	
		}
		System.out.println("Tama�o de monitor correcto...");
		System.out.println("Todo correcto.");
	}
	
	public static void comprobarPortatil(Portatil pc) {
		System.out.println("COMPROBANDO PORTATIL...");
		while(pc.getDiscoDuro()%5 != 0) {
			System.out.println("Error. El la capacidad del disco duro ha de ser multiplo de 5.\nReintroduzca la capacidad:");
			double dd = teclado.nextInt();
			pc.setDiscoDuro(dd);
		}
		System.out.println("Capacidad de Disco Duro correcta...");
		
		while(pc.getPrecio() < 0) {
			System.out.println("Error. El precio no puede ser menor que 0.\nReintroduzca el precio:");
			double dd = teclado.nextInt();
			pc.setPrecio(dd	);	
		}
		System.out.println("Precio correcto...");
		System.out.println("Todo correcto.");
	}
//	Metodo para la eleccion de procesador
	public static void Processor(Ordenador pc) {
		System.out.println("Eliga su tipo de procesador:\n1. Intel\n2. AMD");
		pc.setModeloProcesador(teclado.nextLine());
	}
	
	
	
//	Main
	public static void main(String[] args) {
		
		
		Servidor s1 = new Servidor(4, 125, "i5 4460", null, 300, 20, "Acer", "Logitech");
		Processor(s1);
		comprobarServidor(s1);
		
		Portatil p1 = new Portatil(8, 250, "i5 4460s", null, 300);
		comprobarPortatil(p1);
	}

}