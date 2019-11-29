package eje_15_Cuenta;

import java.util.Scanner;

public class Main_Cuenta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int opcion=0;
		do {
			System.out.println("1. Crear cuenta vacia.\n2. Crear cuenta con saldo inicial.\n3. Ingresar dinero.\n4. Sacar dinero.\5. Ver Saldo.\n6. Salir.");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				new Cuenta();
				break;
			case 2:
				new Cuenta(300);
				break;
			case 3:
				System.out.println("¿Que cantidad quiere ingresar?");
				int x = teclado.nextInt();
				
			}
		}while(opcion != 6);
	}

}
