package eje14_Marcianos;

import java.time.*;
import java.time.format.*;

public class Marte {

	public static void main(String[] args) {
		Marciano et1 = new Marciano("Wally");
		System.out.println(et1.nace());
		
		
		Marciano et2= new Marciano("Poppy");
		System.out.println(et2.nace());
		
		Marciano et3= new Marciano("Mars Attack");
		System.out.println(et3.nace());
		
		System.out.println(et2.muere());
		
		Marciano et4 = new Marciano("Bob");
		System.out.println(et4.nace());
		
		System.out.println(et2.muere());
		
		System.out.println(et1);
		
		System.out.println(et1.estaVivo());
		System.out.println(et2.estaVivo());
		System.out.println(et3.estaVivo());
		System.out.println(et4.estaVivo());
		
	}

}
