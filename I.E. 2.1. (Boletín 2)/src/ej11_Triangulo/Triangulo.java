package ej11_Triangulo;

import java.util.Arrays;
/**
 * 
 * <h2>Clase Triangulo</h2>
 * 
 * Contiene los lados de cada triangulo.
 * @author Pablo Gutierrez.
 */

//Atributos
/**
 * Lados del triangulo, son datos de tipo double.
 */
public class Triangulo {
	private double long_lado1;
	private double long_lado2;
	private double long_lado3;

	/**
	 * Constructor con tres parametros, uno para cada lado.
	 * @param l1 Uno de los lados.
	 * @param l2 Uno de los lados.
	 * @param l3 Uno de los lados.
	 */
	public Triangulo(double l1, double l2, double l3) {
		this.long_lado1=l1;
		this.long_lado2=l2;
		this.long_lado3=l3;
	}

//Metodos
	/**
	 * @return Devuelve en una cadena el valor de cada lado
	 */
	public String getLados() {
		return "Lado 1: "+long_lado1+"\n"+"Lado 2: "+long_lado2+"\n"+"Lado 3: "+long_lado3;
	}
	
//	METODO QUE DEVUELVE "TRUE" SI DOS TRIANGULOS SON IGUALES, "FALSE" SI NO LO SON. X
	/**
	 * Comprueba que dos triangulos sean iguales. Para ello, primero compara que sean del mismo tipo. Si lo son, compara uno u otros lados en funcion del tipo de triangulos que sean.
	 * @param t1 Uno de los triangulos a comparar.
	 * @param t2 Uno de los triangulos a comparar.
	 * @return <ul>
	 * 			<li>true: los dos triangulos comparados Si son iguales.</li>
	 * 			<li>false: los dos triangulos comparados NO son iguales.</li>
	 */
	public boolean compareTo_Triangulos(Triangulo t1, Triangulo t2) {
		boolean x=false;
	//	PRIMERO COMPARA LOS TIPOS DE TRIANGULOS DE AMBOS. SI NO SON DEL MISMO TIPO, RETORNA FALSO. 
		if (t1.tipo_Triangulo()==t2.tipo_Triangulo()) {
		//	SI AMBOS SON TRIAGULOS EQUILATEROS, COMPARA UNO DE SUS LADOS (PODRIA SER CUALQUIERA)
			if (t1.tipo_Triangulo()==1) {
				if (t1.long_lado1==t2.long_lado1) {
					x=true;
				}else {
					x=false;
				}
			}
		//	SI AMBOS SON TRIANGULOS ISOSCELES, PRIMERO LLAMO AL METODO "ordenarLadosTriangulos" Y, SOLO PARA ESTE METODO, CAMBIO EL ORDEN DE LOS LADOS Y LUEGO COMPARA QUE UNO DE LOS DOS
		//	LADOS MAYORES SEAN IGUALES EN AMBOS TRIANGULOS Y QUE EL CHICO TAMBIEN LO SEA EN AMBOS.  
			if (t1.tipo_Triangulo()==2) {
				t1.ordenarLadosTriangulo();
				t2.ordenarLadosTriangulo();
				if (t1.long_lado1==t2.long_lado1 && t1.long_lado3==t2.long_lado3) {
					x=true;
				}else {
					x=false;
				}
			}
		//  SI AMBOS SON TRIANGULOS ESCALENOS, PRIMERO LLAMO AL METODO "ordenarLadosTriangulos" Y, SOLO PARA ESTE METODO, CAMBIO EL ORDEN DE LOS LADOS Y LUEGO COMPARA UNO A UNO EN CADA TRIANGULO
			if (t1.tipo_Triangulo()==3) {
				t1.ordenarLadosTriangulo();
				t2.ordenarLadosTriangulo();
				if (t1.long_lado1==t2.long_lado1 && t1.long_lado2==t2.long_lado2 && t1.long_lado3==t2.long_lado3) {
					x=true;
				}else {
					x=false;
				}
			}
		}else {
			x=false;
		}
		return x;
	}
	
	/**
	 * Metodo que compara un conjunto de triangulos. Para ello, usa el metodo "compareTo_Triangulo"(@see ) 
	 * @see compareTo_Triangulo
	 * @param v
	 * @return
	 */
//	METODO QUE DEVUELVE "TRUE" SI TODOS LOS TRIANGULOS DE UN CONJUNTO (ARRAY) SON IGUALES. "FALSE" SI NO LO SON. USA EL METODO ANTERIOR MIENTRAS RECORRE EL ARAY CON UN BUCLE FOR.
	public boolean compareTo_VTriangulos(Triangulo v[]) {
		boolean t=false;
		for (int i = 1; i <= v.length - 1; i++) {
			if (compareTo_Triangulos(v[0], v[i]) == true) {
				if (i == v.length - 1) {
					t = true;
				}
			}else {
				t = false;
				break;
			}
		}
		return t;
	}
//	METODO QUE DEVUELVE EL TIPO DE TRIANGULO QUE ES. SE FIJA EN CUANTOS LADOS SON IGUALES ENTRE SI. 
	public int tipo_Triangulo() {
		if (long_lado1 == long_lado2 && long_lado1 == long_lado3) {
			return 1;
		}else if (long_lado1 != long_lado2 && long_lado2 != long_lado3 && long_lado1 != long_lado3){
			return 3;
		}else {
			return 2;	
		}
	}
//	METODO QUE CREA UN ARRAY DONDE CONTENER CADA UNO DE LOS LADOS DE UN TRIANGULO PARA LUEGO ORDENARLOS DE MAYOR A MENOR CAMBIANDO EL ORDEN. PARA ELLO SE USA EL METODO "sort" DE LA 
//	LIBRERIA "Arrays" DE JAVA. 
	public void ordenarLadosTriangulo() {
		double desordenado[] = {long_lado1, long_lado2, long_lado3};
		Arrays.sort(desordenado);
		long_lado1=desordenado[0];
		long_lado2=desordenado[1];
		long_lado3=desordenado[2];
	}
	
	
}