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
	
//	Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLipidos() {
		return lipidos;
	}

	public void setLipidos(double lipidos) {
		this.lipidos = lipidos;
	}

	public double getHidratos_carbono() {
		return hidratos_carbono;
	}

	public void setHidratos_carbono(double hidratos_carbono) {
		this.hidratos_carbono = hidratos_carbono;
	}

	public double getProteinas() {
		return proteinas;
	}

	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}

	public boolean isOrigen_animal() {
		return origen_animal;
	}

	public void setOrigen_animal(boolean origen_animal) {
		this.origen_animal = origen_animal;
	}

	public String getContenido_en_vitaminas() {
		return contenido_en_vitaminas;
	}

	public void setContenido_en_vitaminas(String contenido_en_vitaminas) {
		this.contenido_en_vitaminas = contenido_en_vitaminas;
	}

	public String getContenido_en_minerales() {
		return contenido_en_minerales;
	}

	public void setContenido_en_minerales(String contenido_en_minerales) {
		this.contenido_en_minerales = contenido_en_minerales;
	} 
	
	public boolean esDietetico() {
		if (lipidos < 20 && contenido_en_vitaminas != "B") {
			return true;
		}else {
			return false;	
		}
	}
	
	public String muestraAlimento() {
		String origen;
		if (origen_animal = true) {
			origen = "si";
		}else {
			origen = "no";
		}
		return "El alimento "+nombre+" contiene un "+lipidos+"% en lipidos, "+hidratos_carbono+
				"% de hidratos de carbono y un "+proteinas+"% en proteinas.\nAdemas, "+origen+
				" es de origen animal. Su contenido en vitamina es: "+contenido_en_vitaminas+". "
				+ "Y su contenido en minerales es: "+contenido_en_minerales+".";
					
	}

}
