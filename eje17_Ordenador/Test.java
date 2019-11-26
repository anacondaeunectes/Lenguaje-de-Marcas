package eje17_Ordenador;

import java.util.Scanner;

public class Test {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void comprobarServidor(Servidor server) {
		while(server.getDiscoDuro()%5 != 0) {
			System.out.println("Error. El la capacidad del disco duro ha de ser multiplo de 5.\nReintroduzca la capacidad:");
			double dd = teclado.nextInt();
			server.setDiscoDuro(dd);
		}
		System.out.println("Capacidad de Disco Duro correcta...");
		
		while(server.getPrecio() < 0) {
			System.out.println("Error. El precio no puede ser menor que 0.\nReintroduzca el precio:");
			double dd = teclado.nextInt();
			server.setPrecio(dd);
		}
		System.out.println("Precio correcto...");
		System.out.println("Todo correcto.");
	}
	
	public static void comprobarPortatil() {
		
	}
	public static void main(String[] args) {
		Servidor s1 = new Servidor(125, -3, "i5 4460", "intel HD", 300);
		comprobarServidor(s1);
	}

}
