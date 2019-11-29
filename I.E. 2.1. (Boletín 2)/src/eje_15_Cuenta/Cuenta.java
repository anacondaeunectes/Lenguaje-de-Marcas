package eje_15_Cuenta;

public class Cuenta {
	private float saldo;
	private static int num_cuenta;
	
	public Cuenta() {
		num_cuenta++;
	}
	
	public Cuenta(float saldo) {
		num_cuenta++;
		this.saldo=saldo;
	} 
	
	public void ingresar(float ingreso) {
		this.saldo+=saldo;
	}
	
	public void extraer(float retirada) {
		this.saldo-=retirada;
	}
	
	public float getSaldo() {
		return saldo;
	}
}
