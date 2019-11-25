package ej11_Triangulo;

public class Main_Triangulo {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo(3, 5, 5);
		Triangulo t2 = new Triangulo(5, 3, 5);
		
		Triangulo arrayTriangulos[] = {t1,t2, new Triangulo (5, 3, 5)};
		System.out.println(t1.compareTo_Triangulos(t1, t2));
		
		System.out.println(t1.compareTo_Triangulos(t1, arrayTriangulos[2]));
		
		System.out.println(t1.tipo_Triangulo());
		System.out.println(arrayTriangulos.length);
		
//		for (int i = 0; i < arrayTriangulos.length; i++) {
//			System.out.println(arrayTriangulos[i].getLados());
//		}
		
		System.out.println(t1.compareTo_VTriangulos(arrayTriangulos));
		
	}

}
