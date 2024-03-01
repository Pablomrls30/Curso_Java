package Modulo2;

public class Clase6_OperadorTernario {
	public static void main(String[] args) {
		var resultado = (1 > 2) ? "Verdadero" : "Falso" ; //El operador ternario se recomienda para estructuras sencillas 
		System.out.println(resultado);
		
		var numero = 8;
		resultado = (numero % 2 == 0) ? "numero par" : "numero impar";
		System.out.println(resultado);
	}
}
