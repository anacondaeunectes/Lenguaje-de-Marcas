package ej11_Triangulo;
/**
 * 
 * @author usuario
 * @since nov19
 */
public class Triangulo {
	private double long_lado1;
	private double long_lado2;
	private double long_lado3;
	
	public 	Triangulo(double l1, double l2, double l3) {
		this.long_lado1=l1;
		this.long_lado2=l2;
		this.long_lado3=l3;
	}
	
	public String getLados() {
		return "Lado 1: "+long_lado1+"\n"+"Lado 2: "+long_lado2+"\n"+"Lado 3: "+long_lado3;
	}
	
//	METODO QUE DEVUELVE "TRUE" SI DOS TRIANGULOS SON IGUALES, "FALSE" SI NO LO SON. SE FIJA EN SI SUS LADOS SON IGUALES
	public boolean compareTo_Triangulos(Triangulo t1, Triangulo t2) {
		if (t1.long_lado1 == t2.long_lado1 || t1.long_lado1 == t2.long_lado2 || t1.long_lado1 == t2.long_lado3 ) {
			if(t1.long_lado2 == t2.long_lado1 || t1.long_lado2 == t2.long_lado2 || t1.long_lado2 == t2.long_lado3) {
				if (t1.long_lado3 == t2.long_lado1 || t1.long_lado3 == t2.long_lado2 || t1.long_lado3 == t2.long_lado3) {
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
//	METODO QUE DEVUELVE "TRUE" SI TODOS LOS TRIANGULOS DE UN CONJUNTO (ARRAY) SON IGUALES. "FALSE" SI NO LO SON. USA EL METODO ANTERIOR MIENTRAS RECORRE EL ARAY CON UN BUCLE FOR
	public boolean compareTo_VTriangulos(Triangulo v[]) {
		boolean t=false;
		for (int i = 1; i == v.length; i++) {
			if (compareTo_Triangulos(v[0], v[i]) == true) {
				if (i == v.length) {
					t = true;
				}
			}else {
				t = false;
				break;
			}
		}
		return t;
	}
	
	public int tipo_Triangulo() {
		if (long_lado1 == long_lado2 && long_lado1 == long_lado3) {
			return 1;
		}else if (long_lado1 != long_lado2 && long_lado2 != long_lado3 && long_lado1 != long_lado3){
			return 3;
		}else {
			return 2;	
		}
	}
	
	
}
