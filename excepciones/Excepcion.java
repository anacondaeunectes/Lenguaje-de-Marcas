package excepciones;

import java.util.Scanner;

public class Excepcion {

	public static void main(String[] args) {
		int a=2, b=0;
		Scanner teclado = new Scanner(System.in) ;
		boolean c;
		
		do{
			c=false;
			try {
				System.out.println(a/b);
				c=true;
			} catch (ArithmeticException exc) {
				System.err.println(exc.getMessage());
				System.out.println("Reintroduzca los datos:");
				b = teclado.nextInt();
				c=false;
			}
			
		}while(c==false);
		
		
	}

}
