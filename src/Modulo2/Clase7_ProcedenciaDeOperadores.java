package Modulo2;

public class Clase7_ProcedenciaDeOperadores {
	public static void main(String[] args) {
		var x = 5;
		var y = 10;
		var z = ++x + y--;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		var resultado = 4 + 5 * 6 / 3;
		System.out.println(resultado);
	}
}
