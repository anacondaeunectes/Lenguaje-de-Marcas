package eje13_Alimento;

public class Main_Alimento {

	public static void main(String[] args) {
		Alimento a1 = new Alimento("manzana", 5, 2, 8, false, "B", "A");
		System.out.println(a1.esDietetico());
		System.out.println(a1.muestraAlimento());
	}

}
