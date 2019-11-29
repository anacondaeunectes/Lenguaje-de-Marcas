package ej11_Triangulo;

public class Main_Triangulo {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo(3, 3, 3);
		Triangulo t2 = new Triangulo(4, 4, 3);
		Triangulo t3 = new Triangulo(3, 3, 3);
		
		Triangulo arrayTriangulos[] = {t1,t2,t3};
		System.out.println(t1.compareTo_Triangulos(t1, t3));
		
		System.out.println(t1.compareTo_Triangulos(t1, arrayTriangulos[2]));
		
		System.out.println(t1.tipo_Triangulo());
//		System.out.println(arrayTriangulos.length);
		
//		for (int i = 0; i < arrayTriangulos.length; i++) {
//			System.out.println(arrayTriangulos[i].getLados());
//		}
		
		System.out.println(t1.compareTo_VTriangulos(arrayTriangulos));
		
	}

}
