package Modulo2;

public class Clase4_OperadoresDeAsignacion_Relacionales {
	public static void main(String[] args) {
		var a = 3;
		var b = 2;
		
		//Operador de igualdad: Determina si un valor es igual a otro
		var c = (a == b);
		System.out.println(c);
		
		//Operador de diferente: Determina si un valor es diferente a otro
		var d = (a != b);
		System.out.println(d);
		
		//Operador para comparar cadenas: Determina si el contenido de una cadena es igual a otra
		var cadenaA = "Hola";
		var cadenaB = "False";
		var e = (cadenaA == cadenaB); //Se compara la referencia del objeto
		System.out.println(e);
		
		var f = cadenaA.equals(cadenaB); //Esta es la forma correcta en la que se debe hacer la comparación de cadenas
		System.out.println(f);
		
		//Mayor que
		var g = a > b;
		System.out.println(g);
		
		//Mayor o igual que
		g = a >= b;
		System.out.println(g);
		
		if(a % 2 == 0) 
		{
			System.out.println("Es numero par");
		}
		else
		{
			System.out.println("Es numero impar");
		}
		
		var edad = 15;
		var adulto = 18;
		if(edad >= adulto)
		{
			System.out.println("Es un adulto");
		}
		else
		{
			System.out.println("Es menor de edad");
		}
	}
}