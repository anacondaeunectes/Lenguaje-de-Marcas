package eje16_Juego;

public class Test_Juego {

	public static void main(String[] args) {
		Guerrero g1=new Guerrero("Leonidas", 87, "Excalibur");
		Mago m1=new Mago("Gandalf", "invocacion");
		
		System.out.println(g1.combatir(37));
		System.out.println(m1.encantar());
		
		
	}

}
