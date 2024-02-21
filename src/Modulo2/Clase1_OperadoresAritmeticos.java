package Modulo2;
public class Clase1_OperadoresAritmeticos {
	public static void main(String[] args) {
		//Operadores aritméticos
		//Operador +
		int a=3, b=2; //Así se pueden declarar varias variables a la vez separandolas por una coma
		var resultado = a + b;
		System.out.println(resultado);
		
		//Operador -
		resultado = a - b;
		System.out.println(resultado);
		
		//Operador * 
		resultado = a * b;
		System.out.println(resultado);
		
		//Operador /
		var resultado2 = 3D / b;
		System.out.println(resultado2);
		
		//Operador % (residuo)
		resultado = a % b;
		System.out.println(resultado);
		
		if (b % 2 == 0)  //Si solo tenemos una línea de codigo en el bloque del if/else es posible omitir las llaves para ser mas prácticos pero no es recomendable
			System.out.println("Es un numero par");
		else
			System.out.println("Es un numero impar");
		
	}
}