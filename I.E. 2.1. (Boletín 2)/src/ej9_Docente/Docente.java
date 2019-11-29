package ej9_Docente;

public class Docente extends Persona {
	private String codigo;
	private String categoria;
	private String estudiosPostgrados;
	private double horasDeClase;
	private double pagoHora;
	
	public Docente(String apellidos, String nombre, String sexo, String dni, String codigo, String categoria, String estudiosPostgrados, double horasDeClase, double pagoHora  ) {
		super(apellidos, nombre, sexo, dni);
		this.codigo=codigo;
		this.categoria=categoria;
		this.estudiosPostgrados=estudiosPostgrados;
		this.horasDeClase=horasDeClase;
		this.pagoHora=pagoHora;
	}
	
	public double calculoPago() {
		return horasDeClase*pagoHora;
	}
	
	public String getInfo() {
		return toString()+"\n\tComo parte del profesorado, su codigo es: "+codigo+". Sus estudios en postgrados son: "+estudiosPostgrados+". Imparte "+horasDeClase+" horas de clase, cobrando "+pagoHora+"€ la hora.";
	}
}
