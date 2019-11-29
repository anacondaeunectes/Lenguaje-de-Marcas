package eje12_Empleado_Horas;

public class Main_Ej12_Empleado {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Juan", 50, 20);
		Empleado e2 = new Empleado("Ana", 35, 20);
		Empleado e3 = new Empleado("Eduardo", 41, 20);
		
		System.out.println(e1.getInformacion());
		System.out.println(e2.getInformacion());
		System.out.println(e3.getInformacion());
			
	}

}
