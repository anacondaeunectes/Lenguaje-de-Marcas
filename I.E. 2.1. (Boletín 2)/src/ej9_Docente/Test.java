package ej9_Docente;


public class Test {

	public static void main(String[] args) {
				
		Docente d1=new Docente("Ramirez", "Ana", "mujer", "1234567H", "1235146234616", "profesorado", "master en integracion social", 24, 12);
		Estudiante e1=new Estudiante("Perez", "Adrian", "hombre", "87654332G", "123497862135", "alumnado", 542.45, "Calvo Sotelo");
		
		System.out.println(d1.toString());
		System.out.println(e1.getInfo());
		System.out.println(d1.getInfo());
	}

}
