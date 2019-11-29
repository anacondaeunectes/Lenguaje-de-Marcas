package eje15_Cajero;

public class Cuenta {
	private float saldo;
	private static int id_Cuenta;
	
	public Cuenta() {
		id_Cuenta++;
	}
	
	public Cuenta(float saldo) {
		this.saldo=saldo;
	}
	
	public void ingresar(float ingreso) {
		this.saldo+=ingreso;
	}
	
	public void extraer (float retirada) {
		this.saldo-=retirada;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
//	public String menu() {
//		return "Eliga la operación que quiere realizar: \n"
//				+ "1.Crear cuenta vacia
//	}
}
