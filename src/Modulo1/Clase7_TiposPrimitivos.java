package Modulo1;
public class Clase7_TiposPrimitivos {
	public static void main(String[] args) {
		/*
		Tipos primitivos enteros
		-Byte
		-Short
		-Int
		-Long
		*/
		
		byte numeroByte = 10;
		System.out.println(numeroByte);
		System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
		System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
		
		short numeroShort = 9;
		System.out.println(numeroShort);
		System.out.println("Valor minimo del short: " + Short.MIN_VALUE);
		System.out.println("Valor maximo del short: " + Short.MAX_VALUE);
		
		int numeroInt = 8;
		System.out.println(numeroInt);
		System.out.println("Valor minimo del int: " + Integer.MIN_VALUE);
		System.out.println("Valor maximo del int: " + Integer.MAX_VALUE);
		
		long numeroLong = 7;
		System.out.println(numeroLong);
		System.out.println("Valor minimo del long: " + Long.MIN_VALUE);
		System.out.println("Valor maximo del long: " + Long.MAX_VALUE);
	}
}