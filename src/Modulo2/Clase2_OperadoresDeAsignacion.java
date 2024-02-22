package Modulo2;

public class Clase2_OperadoresDeAsignacion {
	public static void main(String[] args) {
		//Operador de asignación:
		int a = 3, b = 2;
		int c = a + 5 - b;
		System.out.println(c);
		
		//Operador de incremento
		a += 1;
		System.out.println("a = " + a);
		
		a += 3;
		System.out.println("a = " + a);
		
		//Operador de decremento
		a -= 2;
		System.out.println("a = " + a);
		
		//Operador de multiplicación
		a *= 3;
		System.out.println("a = " + a);
		
		//Operador de división
		a /= 2;
		System.out.println("a = " + a);
		
		//Operador de modulo
		a %= 2;
		System.out.println("residuo de a = " + a);
	}
}
