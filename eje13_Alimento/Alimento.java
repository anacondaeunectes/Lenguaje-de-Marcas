package eje13_Alimento;

public class Alimento {
	private String nombre;
	private double lipidos;
	private double hidratos_carbono;
	private double proteinas;
	private boolean origen_animal;
	private String contenido_en_vitaminas;
	private String contenido_en_minerales;
	
	public Alimento(String nombre) {
		this.nombre=nombre;
	} 
	
	public Alimento(String nombre, double lipidos, double hidratos_carbono, double proteinas, boolean origen_animal, String contenido_en_vitaminas, String contenido_en_minerales ) {
		this.nombre=nombre;
		this.lipidos=lipidos;
		this.hidratos_carbono=hidratos_carbono;
		this.proteinas=proteinas;
		this.origen_animal=origen_animal;
		this.contenido_en_vitaminas=contenido_en_vitaminas;
		this.contenido_en_minerales=contenido_en_minerales;
	}
	
	public boolean esDietetico() {
		if (lipidos < 20 && contenido_en_vitaminas != "B") {
			return true;
		}else {
			return false;	
		}
	} 
	
//	PREGUNTAR A MONOLO: el atributo nombre tiene que sea la descripcion que pide el 2º metodo o la descripcion es un resumen de todos los atributos de un alimento.
//	public String 
	
}
