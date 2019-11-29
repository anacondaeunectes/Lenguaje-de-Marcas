package eje12_Empleado_Horas;

public class Empleado {
	private String nombre;
	private double horas_trabajadas;
	private double tarifa_hora;
	
	public Empleado(String nombre, double horas_trabajadas, double tarifa_hora) {
		this.nombre=nombre;
		this.horas_trabajadas=horas_trabajadas;
		this.tarifa_hora=tarifa_hora;
	}
	
	public double getSueldoBruto() {
		if (horas_trabajadas <= 40) {
			return horas_trabajadas*tarifa_hora;
		} else {
			return 40*tarifa_hora+((horas_trabajadas-40)*(tarifa_hora*1.5));
		}
	}
	
	public String getInformacion() {
		 return nombre+" trabajo "+horas_trabajadas+" horas, cobra "+tarifa_hora+" euros la hora por lo que le corresponde un sueldo de "+getSueldoBruto()+" euros.";
	}
}


