package ej9_Docente;

import java.util.Scanner;

public class Estudiante extends Persona{
	private String codigo;
	private String categoria;
	private double pagoPensiones;
	private String colegio;
	private double promedioPonderado;
	
	public Estudiante(String apellidos, String nombre, String sexo, String dni, String codigo, String categoria, double pagoPensiones, String colegio) {
		super(apellidos, nombre, sexo, dni);
		this.codigo=codigo;
		this.categoria=categoria;
		this.pagoPensiones=pagoPensiones;
		this.colegio=colegio;
	}
	
	public int calculoDescuentoPension() {
		Scanner teclado=new Scanner(System.in);

		System.out.println("Introduzca el promedio ponderado correspondiente:");
		promedioPonderado=teclado.nextDouble();
		if (promedioPonderado<13) {
			return 0;
		}else if(promedioPonderado<16){
			return 8;
		}else {
			return 15;
		}
	}
	
	public String getInfo() {
		return toString()+"\n\tComo estudiante, su codigo es: "+codigo+". Sostenta una pension de "+pagoPensiones+"€ y estudia en el colegio "+colegio+". Le corresponde un descuento del "+calculoDescuentoPension()+"% sobre el pago de pension.";
	}
	
}
